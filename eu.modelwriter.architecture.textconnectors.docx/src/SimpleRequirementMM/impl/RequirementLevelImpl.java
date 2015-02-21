/**
 */
package SimpleRequirementMM.impl;

import SimpleRequirementMM.Requirement;
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
 * An implementation of the model object '<em><b>Requirement Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleRequirementMM.impl.RequirementLevelImpl#getOwnedLevel <em>Owned Level</em>}</li>
 *   <li>{@link SimpleRequirementMM.impl.RequirementLevelImpl#getOwnedRequirement <em>Owned Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementLevelImpl extends NamedElementImpl implements RequirementLevel {
	/**
	 * The cached value of the '{@link #getOwnedLevel() <em>Owned Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementLevel> ownedLevel;

	/**
	 * The cached value of the '{@link #getOwnedRequirement() <em>Owned Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> ownedRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleRequirementMMPackage.Literals.REQUÝREMENT_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementLevel> getOwnedLevel() {
		if (ownedLevel == null) {
			ownedLevel = new EObjectContainmentEList<RequirementLevel>(RequirementLevel.class, this, SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_LEVEL);
		}
		return ownedLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getOwnedRequirement() {
		if (ownedRequirement == null) {
			ownedRequirement = new EObjectContainmentEList<Requirement>(Requirement.class, this, SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_REQUÝREMENT);
		}
		return ownedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_LEVEL:
				return ((InternalEList<?>)getOwnedLevel()).basicRemove(otherEnd, msgs);
			case SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_REQUÝREMENT:
				return ((InternalEList<?>)getOwnedRequirement()).basicRemove(otherEnd, msgs);
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
			case SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_LEVEL:
				return getOwnedLevel();
			case SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_REQUÝREMENT:
				return getOwnedRequirement();
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
			case SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_LEVEL:
				getOwnedLevel().clear();
				getOwnedLevel().addAll((Collection<? extends RequirementLevel>)newValue);
				return;
			case SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_REQUÝREMENT:
				getOwnedRequirement().clear();
				getOwnedRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_LEVEL:
				getOwnedLevel().clear();
				return;
			case SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_REQUÝREMENT:
				getOwnedRequirement().clear();
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
			case SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_LEVEL:
				return ownedLevel != null && !ownedLevel.isEmpty();
			case SimpleRequirementMMPackage.REQUÝREMENT_LEVEL__OWNED_REQUÝREMENT:
				return ownedRequirement != null && !ownedRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementLevelImpl
