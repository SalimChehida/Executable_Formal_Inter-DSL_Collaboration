/**
 */
package sRA_DSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sRA_DSL.SRA_DSLPackage;
import sRA_DSL.Threat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.impl.ThreatImpl#getNameTh <em>Name Th</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatImpl extends MinimalEObjectImpl.Container implements Threat {
	/**
	 * The default value of the '{@link #getNameTh() <em>Name Th</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTh()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameTh() <em>Name Th</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTh()
	 * @generated
	 * @ordered
	 */
	protected String nameTh = NAME_TH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SRA_DSLPackage.Literals.THREAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameTh() {
		return nameTh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameTh(String newNameTh) {
		String oldNameTh = nameTh;
		nameTh = newNameTh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SRA_DSLPackage.THREAT__NAME_TH, oldNameTh, nameTh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SRA_DSLPackage.THREAT__NAME_TH:
			return getNameTh();
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
		case SRA_DSLPackage.THREAT__NAME_TH:
			setNameTh((String) newValue);
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
		case SRA_DSLPackage.THREAT__NAME_TH:
			setNameTh(NAME_TH_EDEFAULT);
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
		case SRA_DSLPackage.THREAT__NAME_TH:
			return NAME_TH_EDEFAULT == null ? nameTh != null : !NAME_TH_EDEFAULT.equals(nameTh);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nameTh: ");
		result.append(nameTh);
		result.append(')');
		return result.toString();
	}

} //ThreatImpl
