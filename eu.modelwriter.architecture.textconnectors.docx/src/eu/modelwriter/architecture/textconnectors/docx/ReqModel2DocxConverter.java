package eu.modelwriter.architecture.textconnectors.docx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import SimpleRequirementMM.Priority;
import SimpleRequirementMM.Product;
import SimpleRequirementMM.Requirement;
import SimpleRequirementMM.RequirementLevel;

public class ReqModel2DocxConverter {

	private static Resource resource;
	private static XWPFDocument document;
	
	// Requirement property keywords
		private final static String REQUIREMENT_NAME = "Name";
		private final static String REQUIREMENT_DESCRIPTION = "Description";
		private final static String REQUIREMENT_REFINE = "Refine";
		private final static String REQUIREMENT_DEPENDENCY_TO = "Dependency to ";
		private final static String REQUIREMENT_PRIORITY = "Priority";
		private final static String REQUIREMENT_PRIORITY_MANDATORY = "Mandatory";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		document = new XWPFDocument(); 
		
		//Write the Document in file system					C:/Users/2/Desktop/
		FileOutputStream out = new FileOutputStream(new File("RequirementModelDocument.docx"));

		try {

			// Get the resource
			resource = getResource();
			// try to load the file into resource
			resource.load(null);

			//resource.save(System.out, Collections.EMPTY_MAP);


			Iterator<EObject> resourceObjects = resource.getAllContents();	

			while (resourceObjects.hasNext()) {
				Object o = resourceObjects.next();

				
				// Traversing Product's children
				if(o instanceof Product){
					
					for(RequirementLevel requirementLevelHeading1 : ((Product)o).getOwnedRequirementLevel()){
						
						preOrder(requirementLevelHeading1,1);
					}
					
					break;
				}
							
			}
			
			
		}// end of try
		catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}
		
		document.write(out);
		out.close();
		
		System.out.println("Docx written successfully");

	}

	@SuppressWarnings("unchecked")
	private static Resource getResource() {
		// TODO Auto-generated method stub
		
		// Register the XMI resource factory for the .graph extension
		URI uri = URI.createURI("Model/SimpleRequirementMM.xmi");
		
		ResourceSet resourceSet = new ResourceSetImpl();

		// register UML
		Map packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(SimpleRequirementMM.SimpleRequirementMMPackage.eNS_URI, 
				SimpleRequirementMM.SimpleRequirementMMPackage.eINSTANCE);

		// Register XML resource as UMLResource.Factory.Instance
		Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());
		
		return (Resource)resourceSet.createResource(uri);
	}

	// non-binary tree pre-order traverse
	public static void preOrder (RequirementLevel reqLvl, int headingLevel)
	{
	 
	  if(reqLvl.getOwnedLevel().isEmpty()){
		  
		  // Write Requirement Level to file
		  writeRequirementLevel(reqLvl,headingLevel);
		  //System.out.println(reqLvl.getName() + " " + headingLevel);

		  if(!reqLvl.getOwnedRequirement().isEmpty()){
			  
			  for(Requirement r : reqLvl.getOwnedRequirement()){
				  
				  // Write Requirement to file
				  writeRequirement(r);
				  //System.out.println(r.getName());
			  }
		  }
		  
		  return;
	  }
	  
	  // Write Requirement Level to file
	  writeRequirementLevel(reqLvl,headingLevel);
	  //System.out.println(reqLvl.getName() + " " + headingLevel);
	  
	  headingLevel++;
	  
	  for(RequirementLevel subReqLvl : reqLvl.getOwnedLevel()){
		  
		  preOrder(subReqLvl,headingLevel);
		 
	  }
	  
	}
	
	// Write Requirement to file
	public static void writeRequirement(Requirement r){
		
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run=paragraph.createRun();
		
		run.setText(r.getId());
		run.setBold(true);
		run.setFontSize(11);
		run.setFontFamily("Calibri (Body)");
		run.addBreak();
		
		XWPFRun runName = paragraph.createRun();
		runName.setText(REQUIREMENT_NAME + " : " + r.getName());
		runName.addBreak();
		
		XWPFRun runDescription = paragraph.createRun();
		runDescription.setText(REQUIREMENT_DESCRIPTION + " : " + r.getDescription());
		runDescription.addBreak();
		
		XWPFRun runPriority = paragraph.createRun();
		if(r.getPriorityType() == Priority.MANDATORY){
			
			runDescription.setText(REQUIREMENT_DESCRIPTION + " : Mandatory");
			
		}else{
			
			runDescription.setText(REQUIREMENT_DESCRIPTION + " : Optional");
			
		}
		runPriority.addBreak();
		
		if(r.getDependencyTo() != null){
			
			XWPFRun runDependencyTo = paragraph.createRun();
			runDependencyTo.setText(REQUIREMENT_DEPENDENCY_TO + " : " + r.getDependencyTo().getId());
			runDependencyTo.addBreak();
		}
		
		if(r.getRefine() != null){
			
			XWPFRun runRefine = paragraph.createRun();
			runRefine.setText(REQUIREMENT_REFINE + " : " + r.getRefine().getId());
			runRefine.addBreak();
		}
		
	}
	
	 // Write Requirement Level to file
	public static void writeRequirementLevel(RequirementLevel rl, int heading){
		
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run=paragraph.createRun();
		
		paragraph.setAlignment(ParagraphAlignment.LEFT);
		
		// Setting heading style is not working
		paragraph.setStyle("Heading"+heading);
		
		run.setText(rl.getName());
		run.setBold(true);
		
		switch(heading){
		
		case 1 : run.setFontSize(18); break;
		case 2 : run.setFontSize(16); break;
		case 3 : run.setFontSize(14); break;
		default : run.setFontSize(12); break;
		}
		
		run.setFontFamily("Calibri Light (Headings)");
	}
		

}
