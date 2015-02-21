/**
 * Converts requirement file(.docx) to  EMF model instance
 * 
 * @author furkan.tanriverdi@unitbilisim.com
 */

package eu.modelwriter.architecture.textconnectors.docx;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import SimpleRequirementMM.Priority;
import SimpleRequirementMM.Product;
import SimpleRequirementMM.Requirement;
import SimpleRequirementMM.RequirementLevel;
import SimpleRequirementMM.SimpleRequirementMMFactory;

import com.google.common.collect.HashMultimap;

public class Docx2ReqModelConverter {

	private static Resource resource;
	private static Product product;

	// Requirement property keywords
	private final static String REQUIREMENT_NAME = "Name";
	private final static String REQUIREMENT_DESCRIPTION = "Description";
	private final static String REQUIREMENT_REFINE = "Refine";
	private final static String REQUIREMENT_DEPENDENCY_TO = "Dependency to ";
	private final static String REQUIREMENT_PRIORITY = "Priority";
	private final static String REQUIREMENT_PRIORITY_MANDATORY = "Mandatory";

	//private static Map<Requirement,String> requirementsMap;

	// Stores levels 
	private static Stack<RequirementLevel> requirementLevelStack;

	// Maps requirement level object and their levels
	private static Map<RequirementLevel,Integer> requirementLevelMap;

	// Maps styles and their levels
	private static Map<String,Integer> headingMap;

	// Maps source and target requirement's Ids
	public static Map<String, String> dependenceyToMultiMap;

	// Maps source and target requirement's Ids
	public static Map<String, String> refineMultiMap;

	// Maps requirement id and corresponding requirement object
	public static Map<String, Requirement> requirementMultiMap;

	public static void main(String[] args)throws Exception 
	{
		//requirementsMap = new HashMap<Requirement,String>();
		requirementLevelStack = new Stack<RequirementLevel>();

		requirementLevelMap = new HashMap<RequirementLevel, Integer>();
		headingMap = new HashMap<String,Integer>();

		dependenceyToMultiMap = new HashMap<String, String>();
		refineMultiMap = new HashMap<String, String>();
		requirementMultiMap = new HashMap<String, Requirement>();

		// higher level is Heading1 in a word file
		//headingMap.put("NoSpacing", 0);
		headingMap.put("Heading1", 1);
		headingMap.put("Heading2", 2);
		headingMap.put("Heading3", 3);
		headingMap.put("Heading4", 4);
		headingMap.put("Heading5", 5);
		headingMap.put("Heading6", 6);
		headingMap.put("Heading7", 7);
		headingMap.put("Heading8", 8);
		headingMap.put("Heading9", 9);

		XWPFDocument docx = new XWPFDocument(new FileInputStream("C:/Users/2/Desktop/SampleRequirementDocument.docx"));

		//XWPFWordExtractor we = new XWPFWordExtractor(docx);

		//XWPFStyles styles = docx.getStyles();

		List<XWPFParagraph> paragraphList = docx.getParagraphs();

		SimpleRequirementMMFactory factory = SimpleRequirementMMFactory.eINSTANCE;

		//int currentIndex = 0;
		int firstParagraphCounter = 0;
		product = factory.createProduct();

		Requirement requirement = null;
		Requirement previousRequirement = null;

		// Regular expression for requirement id
		String pattern = "(EM-HLR-F-REQ-[0-9]{3})";
		Pattern p = Pattern.compile(pattern);


		for(XWPFParagraph paragraph : paragraphList){

			//boolean b = paragraph.getRun().isBold();
			firstParagraphCounter++;

			// For debug
			// String paragraphText = paragraph.getText();

			if( paragraph != null && paragraph.getText() != ""){

				// first paragraph element
				if(firstParagraphCounter == 1){

					// Create a new RequirementLevel
					RequirementLevel requirementLevel = factory.createRequirementLevel();

					// Set requirements' name as paragraphs' name
					requirementLevel.setName(paragraph.getText());

					// paragraph.getStyle().equals("Heading1")

					// Only biggest headers(Heading 1) should be added Product
					if(headingMap.get(paragraph.getStyle()) == 1){
						product.getOwnedRequirementLevel().add(requirementLevel);
					}

					requirementLevelStack.push(requirementLevel);
					requirementLevelMap.put(requirementLevel, headingMap.get(paragraph.getStyle()));					
				}				

				else {

					// If the paragraph is on the lowest level
					// This paragraph is about one of requirements' properties
					if(paragraph.getStyle() == null){

						Matcher matcher = p.matcher(paragraph.getText());

						// If there is no corresponding requirement object
						if(matcher.matches()){

							previousRequirement = requirement;
							if(previousRequirement != null){

								requirementLevelStack.peek().getOwnedRequirement().add(previousRequirement);
								requirementMultiMap.put(previousRequirement.getId().trim(), previousRequirement);

							}

							requirement = factory.createRequirement();
							//requirement.setName(requirementLevelStack.peek().getName());
							requirement.setId(paragraph.getText());


						}															

						// Split the propertie and the value of it
						String[] values = paragraph.getText().split(":");

						// Set requirement's name
						if(values[0].trim().equals(REQUIREMENT_NAME)){

							requirement.setName(values[1]);
						}

						// Set requirement's description
						if(values[0].trim().equals(REQUIREMENT_DESCRIPTION)){

							requirement.setDescription(values[1]);
						}

						// Set requirement's dependency
						if(values[0].equals(REQUIREMENT_DEPENDENCY_TO)){

							dependenceyToMultiMap.put(requirement.getId(), values[1].trim());
						}

						// Set requirement's priority
						if(values[0].trim().equals(REQUIREMENT_PRIORITY)){

							if(values[1].equals(REQUIREMENT_PRIORITY_MANDATORY)){

								requirement.setPriorityType(Priority.MANDATORY);	

							}else{

								requirement.setPriorityType(Priority.OPTÝONAL);
							}
						}

						// Set requirement's refine
						if(values[0].trim().equals(REQUIREMENT_REFINE)){

							refineMultiMap.put(requirement.getId(), values[1].trim());
						}


					}else{

						// The current paragraph is on different level
						// so add requirement to peek requirement level object
						if(requirement != null){

							/*
							RequirementLevel poppedRequirementLevel = requirementLevelStack.pop();
							poppedRequirementLevel.getOwnedRequirement().add(requirement);
							requirementLevelStack.peek().getOwnedLevel().add(poppedRequirementLevel);
							 */
							requirementLevelStack.peek().getOwnedRequirement().add(requirement);
							requirementMultiMap.put(requirement.getId(), requirement);
							requirement = null;


						}

						// If the current paragraph's level is lower than the peek's level 
						if(headingMap.get(paragraph.getStyle()) > requirementLevelMap.get(requirementLevelStack.peek())){

							RequirementLevel newRequirementLevel = factory.createRequirementLevel();
							newRequirementLevel.setName(paragraph.getText());

							/*
							if(headingMap.get(paragraph.getStyle()) == 1){
								product.getOwnedRequirementLevel().add(newRequirementLevel);
							}*/

							requirementLevelStack.push(newRequirementLevel);
							requirementLevelMap.put(newRequirementLevel, headingMap.get(paragraph.getStyle()));
						}

						// If the current paragraph's level is equal to the peek's level 
						else if(firstParagraphCounter > 1 && (headingMap.get(paragraph.getStyle()) == requirementLevelMap.get(requirementLevelStack.peek()))){

							RequirementLevel poppedRequirementLevel = requirementLevelStack.pop();

							if(!requirementLevelStack.isEmpty()){

								requirementLevelStack.peek().getOwnedLevel().add(poppedRequirementLevel);
							}else{

								product.getOwnedRequirementLevel().add(poppedRequirementLevel);
							}

							RequirementLevel newRequirementLevel = factory.createRequirementLevel();
							newRequirementLevel.setName(paragraph.getText());

							if(headingMap.get(paragraph.getStyle()) == 1){
								product.getOwnedRequirementLevel().add(newRequirementLevel);
							}

							requirementLevelStack.push(newRequirementLevel);
							requirementLevelMap.put(newRequirementLevel, headingMap.get(paragraph.getStyle()));
						}


						// If the current paragraph's level is higher than the peek's level 
						// then pop the requirement level and add it to peek's level is higher than
						// current paragraph's level
						else{											

							while(headingMap.get(paragraph.getStyle()) <= requirementLevelMap.get(requirementLevelStack.peek())){

								RequirementLevel poppedRequirementLevel = requirementLevelStack.pop();

								// Higher level paragraph must be added to product
								if(requirementLevelMap.get(poppedRequirementLevel) == 1){

									product.getOwnedRequirementLevel().add(poppedRequirementLevel);
									break;

								}else{

									requirementLevelStack.peek().getOwnedLevel().add(poppedRequirementLevel);			
								}


							}

							RequirementLevel newRequirementLevel = factory.createRequirementLevel();
							newRequirementLevel.setName(paragraph.getText());

							if(headingMap.get(paragraph.getStyle()) == 1){
								product.getOwnedRequirementLevel().add(newRequirementLevel);
							}

							requirementLevelStack.push(newRequirementLevel);
							requirementLevelMap.put(newRequirementLevel, headingMap.get(paragraph.getStyle()));

						}
					}



				}

			}

		}


		// Assign Refine attribute
		handleRefine();

		// Assign Dependency To attribute
		handleDependencyTo();

		// At last, stack must be emptied
		emptyStack();

		// Create and save the model instance to xmi file
		createXMIFile(product);

	}

	/**
	 * Requirement Levels left at stack must be removed and 
	 * added corresponding levels
	 */
	private static void emptyStack() {
		// TODO Auto-generated method stub

		while(!requirementLevelStack.isEmpty()){

			RequirementLevel poppedRequirementLevel = requirementLevelStack.pop();	

			if(requirementLevelMap.get(poppedRequirementLevel) == 1){

				product.getOwnedRequirementLevel().add(poppedRequirementLevel);
			}else{

				requirementLevelStack.peek().getOwnedLevel().add(poppedRequirementLevel);			
			}


		}
	}

	/**
	 * Assigns Dependency To requirements to requirement
	 */
	private static void handleDependencyTo() {
		// TODO Auto-generated method stub

		for(Map.Entry<String, String> e : dependenceyToMultiMap.entrySet()){

			String key = e.getKey();
			String value = e.getValue();

			Requirement source = requirementMultiMap.get(key);
			Requirement target = requirementMultiMap.get(value);

			source.setDependencyTo(target);

		}

	}

	/**
	 * Assigns refine requirements to requirement
	 */
	private static void handleRefine() {
		// TODO Auto-generated method stub

		for(Map.Entry<String, String> e : refineMultiMap.entrySet()){

			String key = e.getKey();
			String value = e.getValue();

			Requirement source = requirementMultiMap.get(key);
			Requirement target = requirementMultiMap.get(value);

			source.setRefine(target);

		}
	}

	/**
	 * Saves the model instance and writes it to xmi file
	 * 
	 * @param product
	 */
	private static void createXMIFile(Product product) {

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML Factory implementation using xmi extension
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"xmi", new  XMLResourceFactoryImpl());


		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createURI("Model/SimpleRequirementMM.xmi"));


		// Add Product to contents list of the resource 

		resource.getContents().add(product);

		try{

			// Save the resource	
			resource.save(null);

		}catch (IOException e) {

			e.printStackTrace();
		}
	}


}
