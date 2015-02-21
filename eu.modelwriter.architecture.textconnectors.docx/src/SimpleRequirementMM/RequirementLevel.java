/**
 */
package SimpleRequirementMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleRequirementMM.RequirementLevel#getOwnedLevel <em>Owned Level</em>}</li>
 *   <li>{@link SimpleRequirementMM.RequirementLevel#getOwnedRequirement <em>Owned Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleRequirementMM.SimpleRequirementMMPackage#getRequirementLevel()
 * @model
 * @generated
 */
public interface RequirementLevel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Level</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleRequirementMM.RequirementLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Level</em>' containment reference list.
	 * @see SimpleRequirementMM.SimpleRequirementMMPackage#getRequirementLevel_OwnedLevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementLevel> getOwnedLevel();

	/**
	 * Returns the value of the '<em><b>Owned Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleRequirementMM.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirement</em>' containment reference list.
	 * @see SimpleRequirementMM.SimpleRequirementMMPackage#getRequirementLevel_OwnedRequirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getOwnedRequirement();

} // RequirementLevel
