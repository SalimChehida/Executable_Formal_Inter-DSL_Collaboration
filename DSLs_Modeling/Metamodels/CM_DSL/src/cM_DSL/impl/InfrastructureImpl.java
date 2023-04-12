/**
 */
package cM_DSL.impl;

import cM_DSL.CM_DSLPackage;
import cM_DSL.Communication;
import cM_DSL.Infrastructure;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cM_DSL.impl.InfrastructureImpl#getNameInf <em>Name Inf</em>}</li>
 *   <li>{@link cM_DSL.impl.InfrastructureImpl#getCommunications <em>Communications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureImpl extends MinimalEObjectImpl.Container implements Infrastructure {
	/**
	 * The default value of the '{@link #getNameInf() <em>Name Inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameInf()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_INF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameInf() <em>Name Inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameInf()
	 * @generated
	 * @ordered
	 */
	protected String nameInf = NAME_INF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommunications() <em>Communications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunications()
	 * @generated
	 * @ordered
	 */
	protected EList<Communication> communications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CM_DSLPackage.Literals.INFRASTRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameInf() {
		return nameInf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameInf(String newNameInf) {
		String oldNameInf = nameInf;
		nameInf = newNameInf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CM_DSLPackage.INFRASTRUCTURE__NAME_INF, oldNameInf, nameInf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Communication> getCommunications() {
		if (communications == null) {
			communications = new EObjectResolvingEList<Communication>(Communication.class, this, CM_DSLPackage.INFRASTRUCTURE__COMMUNICATIONS);
		}
		return communications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CM_DSLPackage.INFRASTRUCTURE__NAME_INF:
				return getNameInf();
			case CM_DSLPackage.INFRASTRUCTURE__COMMUNICATIONS:
				return getCommunications();
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
			case CM_DSLPackage.INFRASTRUCTURE__NAME_INF:
				setNameInf((String)newValue);
				return;
			case CM_DSLPackage.INFRASTRUCTURE__COMMUNICATIONS:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends Communication>)newValue);
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
			case CM_DSLPackage.INFRASTRUCTURE__NAME_INF:
				setNameInf(NAME_INF_EDEFAULT);
				return;
			case CM_DSLPackage.INFRASTRUCTURE__COMMUNICATIONS:
				getCommunications().clear();
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
			case CM_DSLPackage.INFRASTRUCTURE__NAME_INF:
				return NAME_INF_EDEFAULT == null ? nameInf != null : !NAME_INF_EDEFAULT.equals(nameInf);
			case CM_DSLPackage.INFRASTRUCTURE__COMMUNICATIONS:
				return communications != null && !communications.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nameInf: ");
		result.append(nameInf);
		result.append(')');
		return result.toString();
	}

} //InfrastructureImpl
