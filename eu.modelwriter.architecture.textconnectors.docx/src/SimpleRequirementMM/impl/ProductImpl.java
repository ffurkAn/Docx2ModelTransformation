/**
 */
package SimpleRequirementMM.impl;

import SimpleRequirementMM.Product;
import SimpleRequirementMM.RequirementLevel;
import SimpleRequirementMM.SimpleRequirementMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleRequirementMM.impl.ProductImpl#getOwnedRequirementLevel <em>Owned Requirement Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends NamedElementImpl implements Product {
	/**
	 * The cached value of the '{@link #getOwnedRequirementLevel() <em>Owned Requirement Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRequirementLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementLevel> ownedRequirementLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleRequirementMMPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementLevel> getOwnedRequirementLevel() {
		if (ownedRequirementLevel == null) {
			ownedRequirementLevel = new EObjectContainmentEList<RequirementLevel>(RequirementLevel.class, this, SimpleRequirementMMPackage.PRODUCT__OWNED_REQUÝREMENT_LEVEL);
		}
		return ownedRequirementLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleRequirementMMPackage.PRODUCT__OWNED_REQUÝREMENT_LEVEL:
				return ((InternalEList<?>)getOwnedRequirementLevel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleRequirementMMPackage.PRODUCT__OWNED_REQUÝREMENT_LEVEL:
				return getOwnedRequirementLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleRequirementMMPackage.PRODUCT__OWNED_REQUÝREMENT_LEVEL:
				getOwnedRequirementLevel().clear();
				getOwnedRequirementLevel().addAll((Collection<? extends RequirementLevel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimpleRequirementMMPackage.PRODUCT__OWNED_REQUÝREMENT_LEVEL:
				getOwnedRequirementLevel().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimpleRequirementMMPackage.PRODUCT__OWNED_REQUÝREMENT_LEVEL:
				return ownedRequirementLevel != null && !ownedRequirementLevel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl
