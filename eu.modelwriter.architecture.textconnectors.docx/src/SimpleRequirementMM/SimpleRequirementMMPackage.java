/**
 */
package SimpleRequirementMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SimpleRequirementMM.SimpleRequirementMMFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleRequirementMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SimpleRequirementMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "eu.modelwriter.architecture.textconnectors.docx.requirement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SimpleRequirementMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleRequirementMMPackage eINSTANCE = SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link SimpleRequirementMM.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleRequirementMM.impl.NamedElementImpl
	 * @see SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SimpleRequirementMM.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleRequirementMM.impl.ProductImpl
	 * @see SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Requirement Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__OWNED_REQUÝREMENT_LEVEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleRequirementMM.impl.RequirementLevelImpl <em>Requirement Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleRequirementMM.impl.RequirementLevelImpl
	 * @see SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl#getRequirementLevel()
	 * @generated
	 */
	int REQUÝREMENT_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_LEVEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_LEVEL__OWNED_LEVEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_LEVEL__OWNED_REQUÝREMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirement Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_LEVEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Requirement Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_LEVEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleRequirementMM.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleRequirementMM.impl.RequirementImpl
	 * @see SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUÝREMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__DESCRÝPTÝON = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__REFÝNE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dependency To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__DEPENDENCY_TO = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT__PRÝORÝTY_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUÝREMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleRequirementMM.Priority <em>Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleRequirementMM.Priority
	 * @see SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl#getPriority()
	 * @generated
	 */
	int PRÝORÝTY = 4;


	/**
	 * Returns the meta object for class '{@link SimpleRequirementMM.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see SimpleRequirementMM.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link SimpleRequirementMM.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SimpleRequirementMM.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link SimpleRequirementMM.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see SimpleRequirementMM.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleRequirementMM.Product#getOwnedRequirementLevel <em>Owned Requirement Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Requirement Level</em>'.
	 * @see SimpleRequirementMM.Product#getOwnedRequirementLevel()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_OwnedRequirementLevel();

	/**
	 * Returns the meta object for class '{@link SimpleRequirementMM.RequirementLevel <em>Requirement Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Level</em>'.
	 * @see SimpleRequirementMM.RequirementLevel
	 * @generated
	 */
	EClass getRequirementLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleRequirementMM.RequirementLevel#getOwnedLevel <em>Owned Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Level</em>'.
	 * @see SimpleRequirementMM.RequirementLevel#getOwnedLevel()
	 * @see #getRequirementLevel()
	 * @generated
	 */
	EReference getRequirementLevel_OwnedLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleRequirementMM.RequirementLevel#getOwnedRequirement <em>Owned Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Requirement</em>'.
	 * @see SimpleRequirementMM.RequirementLevel#getOwnedRequirement()
	 * @see #getRequirementLevel()
	 * @generated
	 */
	EReference getRequirementLevel_OwnedRequirement();

	/**
	 * Returns the meta object for class '{@link SimpleRequirementMM.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see SimpleRequirementMM.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link SimpleRequirementMM.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SimpleRequirementMM.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the attribute '{@link SimpleRequirementMM.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SimpleRequirementMM.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the reference '{@link SimpleRequirementMM.Requirement#getRefine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refine</em>'.
	 * @see SimpleRequirementMM.Requirement#getRefine()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Refine();

	/**
	 * Returns the meta object for the reference '{@link SimpleRequirementMM.Requirement#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency To</em>'.
	 * @see SimpleRequirementMM.Requirement#getDependencyTo()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_DependencyTo();

	/**
	 * Returns the meta object for the attribute '{@link SimpleRequirementMM.Requirement#getPriorityType <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Type</em>'.
	 * @see SimpleRequirementMM.Requirement#getPriorityType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_PriorityType();

	/**
	 * Returns the meta object for enum '{@link SimpleRequirementMM.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority</em>'.
	 * @see SimpleRequirementMM.Priority
	 * @generated
	 */
	EEnum getPriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleRequirementMMFactory getSimpleRequirementMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SimpleRequirementMM.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleRequirementMM.impl.NamedElementImpl
		 * @see SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link SimpleRequirementMM.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleRequirementMM.impl.ProductImpl
		 * @see SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Owned Requirement Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__OWNED_REQUÝREMENT_LEVEL = eINSTANCE.getProduct_OwnedRequirementLevel();

		/**
		 * The meta object literal for the '{@link SimpleRequirementMM.impl.RequirementLevelImpl <em>Requirement Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleRequirementMM.impl.RequirementLevelImpl
		 * @see SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl#getRequirementLevel()
		 * @generated
		 */
		EClass REQUÝREMENT_LEVEL = eINSTANCE.getRequirementLevel();

		/**
		 * The meta object literal for the '<em><b>Owned Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUÝREMENT_LEVEL__OWNED_LEVEL = eINSTANCE.getRequirementLevel_OwnedLevel();

		/**
		 * The meta object literal for the '<em><b>Owned Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUÝREMENT_LEVEL__OWNED_REQUÝREMENT = eINSTANCE.getRequirementLevel_OwnedRequirement();

		/**
		 * The meta object literal for the '{@link SimpleRequirementMM.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleRequirementMM.impl.RequirementImpl
		 * @see SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUÝREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUÝREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUÝREMENT__DESCRÝPTÝON = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Refine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUÝREMENT__REFÝNE = eINSTANCE.getRequirement_Refine();

		/**
		 * The meta object literal for the '<em><b>Dependency To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUÝREMENT__DEPENDENCY_TO = eINSTANCE.getRequirement_DependencyTo();

		/**
		 * The meta object literal for the '<em><b>Priority Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUÝREMENT__PRÝORÝTY_TYPE = eINSTANCE.getRequirement_PriorityType();

		/**
		 * The meta object literal for the '{@link SimpleRequirementMM.Priority <em>Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleRequirementMM.Priority
		 * @see SimpleRequirementMM.impl.SimpleRequirementMMPackageImpl#getPriority()
		 * @generated
		 */
		EEnum PRÝORÝTY = eINSTANCE.getPriority();

	}

} //SimpleRequirementMMPackage
