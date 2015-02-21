/**
 */
package SimpleRequirementMM.tests;

import SimpleRequirementMM.RequirementLevel;
import SimpleRequirementMM.SimpleRequirementMMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Requirement Level</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementLevelTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequirementLevelTest.class);
	}

	/**
	 * Constructs a new Requirement Level test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementLevelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Requirement Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequirementLevel getFixture() {
		return (RequirementLevel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimpleRequirementMMFactory.eINSTANCE.createRequirementLevel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RequirementLevelTest
