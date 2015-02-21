/**
 */
package SimpleRequirementMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleRequirementMM.Product#getOwnedRequirementLevel <em>Owned Requirement Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleRequirementMM.SimpleRequirementMMPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Requirement Level</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleRequirementMM.RequirementLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirement Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirement Level</em>' containment reference list.
	 * @see SimpleRequirementMM.SimpleRequirementMMPackage#getProduct_OwnedRequirementLevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementLevel> getOwnedRequirementLevel();

} // Product
