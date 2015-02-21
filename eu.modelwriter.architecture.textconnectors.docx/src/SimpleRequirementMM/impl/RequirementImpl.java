/**
 */
package SimpleRequirementMM.impl;

import SimpleRequirementMM.Priority;
import SimpleRequirementMM.Requirement;
import SimpleRequirementMM.SimpleRequirementMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleRequirementMM.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link SimpleRequirementMM.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SimpleRequirementMM.impl.RequirementImpl#getRefine <em>Refine</em>}</li>
 *   <li>{@link SimpleRequirementMM.impl.RequirementImpl#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link SimpleRequirementMM.impl.RequirementImpl#getPriorityType <em>Priority Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends NamedElementImpl implements Requirement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String �d = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCR�PT�ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCR�PT�ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefine() <em>Refine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefine()
	 * @generated
	 * @ordered
	 */
	protected Requirement refine;

	/**
	 * The cached value of the '{@link #getDependencyTo() <em>Dependency To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTo()
	 * @generated
	 * @ordered
	 */
	protected Requirement dependencyTo;

	/**
	 * The default value of the '{@link #getPriorityType() <em>Priority Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityType()
	 * @generated
	 * @ordered
	 */
	protected static final Priority PR�OR�TY_TYPE_EDEFAULT = Priority.MANDATORY;

	/**
	 * The cached value of the '{@link #getPriorityType() <em>Priority Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityType()
	 * @generated
	 * @ordered
	 */
	protected Priority priorityType = PR�OR�TY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleRequirementMMPackage.Literals.REQU�REMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return �d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = �d;
		�d = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRequirementMMPackage.REQU�REMENT__ID, oldId, �d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRequirementMMPackage.REQU�REMENT__DESCR�PT�ON, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getRefine() {
		if (refine != null && refine.eIsProxy()) {
			InternalEObject oldRefine = (InternalEObject)refine;
			refine = (Requirement)eResolveProxy(oldRefine);
			if (refine != oldRefine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleRequirementMMPackage.REQU�REMENT__REF�NE, oldRefine, refine));
			}
		}
		return refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRefine() {
		return refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefine(Requirement newRefine) {
		Requirement oldRefine = refine;
		refine = newRefine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRequirementMMPackage.REQU�REMENT__REF�NE, oldRefine, refine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getDependencyTo() {
		if (dependencyTo != null && dependencyTo.eIsProxy()) {
			InternalEObject oldDependencyTo = (InternalEObject)dependencyTo;
			dependencyTo = (Requirement)eResolveProxy(oldDependencyTo);
			if (dependencyTo != oldDependencyTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleRequirementMMPackage.REQU�REMENT__DEPENDENCY_TO, oldDependencyTo, dependencyTo));
			}
		}
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetDependencyTo() {
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyTo(Requirement newDependencyTo) {
		Requirement oldDependencyTo = dependencyTo;
		dependencyTo = newDependencyTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRequirementMMPackage.REQU�REMENT__DEPENDENCY_TO, oldDependencyTo, dependencyTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority getPriorityType() {
		return priorityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorityType(Priority newPriorityType) {
		Priority oldPriorityType = priorityType;
		priorityType = newPriorityType == null ? PR�OR�TY_TYPE_EDEFAULT : newPriorityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleRequirementMMPackage.REQU�REMENT__PR�OR�TY_TYPE, oldPriorityType, priorityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleRequirementMMPackage.REQU�REMENT__ID:
				return getId();
			case SimpleRequirementMMPackage.REQU�REMENT__DESCR�PT�ON:
				return getDescription();
			case SimpleRequirementMMPackage.REQU�REMENT__REF�NE:
				if (resolve) return getRefine();
				return basicGetRefine();
			case SimpleRequirementMMPackage.REQU�REMENT__DEPENDENCY_TO:
				if (resolve) return getDependencyTo();
				return basicGetDependencyTo();
			case SimpleRequirementMMPackage.REQU�REMENT__PR�OR�TY_TYPE:
				return getPriorityType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleRequirementMMPackage.REQU�REMENT__ID:
				setId((String)newValue);
				return;
			case SimpleRequirementMMPackage.REQU�REMENT__DESCR�PT�ON:
				setDescription((String)newValue);
				return;
			case SimpleRequirementMMPackage.REQU�REMENT__REF�NE:
				setRefine((Requirement)newValue);
				return;
			case SimpleRequirementMMPackage.REQU�REMENT__DEPENDENCY_TO:
				setDependencyTo((Requirement)newValue);
				return;
			case SimpleRequirementMMPackage.REQU�REMENT__PR�OR�TY_TYPE:
				setPriorityType((Priority)newValue);
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
			case SimpleRequirementMMPackage.REQU�REMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case SimpleRequirementMMPackage.REQU�REMENT__DESCR�PT�ON:
				setDescription(DESCR�PT�ON_EDEFAULT);
				return;
			case SimpleRequirementMMPackage.REQU�REMENT__REF�NE:
				setRefine((Requirement)null);
				return;
			case SimpleRequirementMMPackage.REQU�REMENT__DEPENDENCY_TO:
				setDependencyTo((Requirement)null);
				return;
			case SimpleRequirementMMPackage.REQU�REMENT__PR�OR�TY_TYPE:
				setPriorityType(PR�OR�TY_TYPE_EDEFAULT);
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
			case SimpleRequirementMMPackage.REQU�REMENT__ID:
				return ID_EDEFAULT == null ? �d != null : !ID_EDEFAULT.equals(�d);
			case SimpleRequirementMMPackage.REQU�REMENT__DESCR�PT�ON:
				return DESCR�PT�ON_EDEFAULT == null ? description != null : !DESCR�PT�ON_EDEFAULT.equals(description);
			case SimpleRequirementMMPackage.REQU�REMENT__REF�NE:
				return refine != null;
			case SimpleRequirementMMPackage.REQU�REMENT__DEPENDENCY_TO:
				return dependencyTo != null;
			case SimpleRequirementMMPackage.REQU�REMENT__PR�OR�TY_TYPE:
				return priorityType != PR�OR�TY_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Id: ");
		result.append(�d);
		result.append(", Description: ");
		result.append(description);
		result.append(", PriorityType: ");
		result.append(priorityType);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
