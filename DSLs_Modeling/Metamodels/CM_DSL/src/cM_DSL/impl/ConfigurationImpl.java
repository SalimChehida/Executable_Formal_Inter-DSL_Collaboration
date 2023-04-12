/**
 */
package cM_DSL.impl;

import cM_DSL.Application;
import cM_DSL.CM_DSLPackage;
import cM_DSL.Configuration;
import cM_DSL.Infrastructure;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cM_DSL.impl.ConfigurationImpl#getNameConf <em>Name Conf</em>}</li>
 *   <li>{@link cM_DSL.impl.ConfigurationImpl#getQoS <em>Qo S</em>}</li>
 *   <li>{@link cM_DSL.impl.ConfigurationImpl#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link cM_DSL.impl.ConfigurationImpl#getInfr <em>Infr</em>}</li>
 *   <li>{@link cM_DSL.impl.ConfigurationImpl#getApp <em>App</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The default value of the '{@link #getNameConf() <em>Name Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameConf()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_CONF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameConf() <em>Name Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameConf()
	 * @generated
	 * @ordered
	 */
	protected String nameConf = NAME_CONF_EDEFAULT;

	/**
	 * The default value of the '{@link #getQoS() <em>Qo S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQoS()
	 * @generated
	 * @ordered
	 */
	protected static final float QO_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQoS() <em>Qo S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQoS()
	 * @generated
	 * @ordered
	 */
	protected float qoS = QO_S_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected boolean isValid = IS_VALID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInfr() <em>Infr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfr()
	 * @generated
	 * @ordered
	 */
	protected Infrastructure infr;

	/**
	 * The cached value of the '{@link #getApp() <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp()
	 * @generated
	 * @ordered
	 */
	protected Application app;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CM_DSLPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameConf() {
		return nameConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameConf(String newNameConf) {
		String oldNameConf = nameConf;
		nameConf = newNameConf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CM_DSLPackage.CONFIGURATION__NAME_CONF, oldNameConf, nameConf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getQoS() {
		return qoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQoS(float newQoS) {
		float oldQoS = qoS;
		qoS = newQoS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CM_DSLPackage.CONFIGURATION__QO_S, oldQoS, qoS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsValid() {
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValid(boolean newIsValid) {
		boolean oldIsValid = isValid;
		isValid = newIsValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CM_DSLPackage.CONFIGURATION__IS_VALID, oldIsValid, isValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure getInfr() {
		if (infr != null && infr.eIsProxy()) {
			InternalEObject oldInfr = (InternalEObject)infr;
			infr = (Infrastructure)eResolveProxy(oldInfr);
			if (infr != oldInfr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CM_DSLPackage.CONFIGURATION__INFR, oldInfr, infr));
			}
		}
		return infr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure basicGetInfr() {
		return infr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfr(Infrastructure newInfr) {
		Infrastructure oldInfr = infr;
		infr = newInfr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CM_DSLPackage.CONFIGURATION__INFR, oldInfr, infr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApp() {
		if (app != null && app.eIsProxy()) {
			InternalEObject oldApp = (InternalEObject)app;
			app = (Application)eResolveProxy(oldApp);
			if (app != oldApp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CM_DSLPackage.CONFIGURATION__APP, oldApp, app));
			}
		}
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApp() {
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp(Application newApp) {
		Application oldApp = app;
		app = newApp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CM_DSLPackage.CONFIGURATION__APP, oldApp, app));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration validateConfig() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQoS() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CM_DSLPackage.CONFIGURATION__NAME_CONF:
				return getNameConf();
			case CM_DSLPackage.CONFIGURATION__QO_S:
				return getQoS();
			case CM_DSLPackage.CONFIGURATION__IS_VALID:
				return isIsValid();
			case CM_DSLPackage.CONFIGURATION__INFR:
				if (resolve) return getInfr();
				return basicGetInfr();
			case CM_DSLPackage.CONFIGURATION__APP:
				if (resolve) return getApp();
				return basicGetApp();
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
			case CM_DSLPackage.CONFIGURATION__NAME_CONF:
				setNameConf((String)newValue);
				return;
			case CM_DSLPackage.CONFIGURATION__QO_S:
				setQoS((Float)newValue);
				return;
			case CM_DSLPackage.CONFIGURATION__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case CM_DSLPackage.CONFIGURATION__INFR:
				setInfr((Infrastructure)newValue);
				return;
			case CM_DSLPackage.CONFIGURATION__APP:
				setApp((Application)newValue);
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
			case CM_DSLPackage.CONFIGURATION__NAME_CONF:
				setNameConf(NAME_CONF_EDEFAULT);
				return;
			case CM_DSLPackage.CONFIGURATION__QO_S:
				setQoS(QO_S_EDEFAULT);
				return;
			case CM_DSLPackage.CONFIGURATION__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case CM_DSLPackage.CONFIGURATION__INFR:
				setInfr((Infrastructure)null);
				return;
			case CM_DSLPackage.CONFIGURATION__APP:
				setApp((Application)null);
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
			case CM_DSLPackage.CONFIGURATION__NAME_CONF:
				return NAME_CONF_EDEFAULT == null ? nameConf != null : !NAME_CONF_EDEFAULT.equals(nameConf);
			case CM_DSLPackage.CONFIGURATION__QO_S:
				return qoS != QO_S_EDEFAULT;
			case CM_DSLPackage.CONFIGURATION__IS_VALID:
				return isValid != IS_VALID_EDEFAULT;
			case CM_DSLPackage.CONFIGURATION__INFR:
				return infr != null;
			case CM_DSLPackage.CONFIGURATION__APP:
				return app != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CM_DSLPackage.CONFIGURATION___VALIDATE_CONFIG:
				return validateConfig();
			case CM_DSLPackage.CONFIGURATION___SET_QO_S:
				setQoS();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (nameConf: ");
		result.append(nameConf);
		result.append(", QoS: ");
		result.append(qoS);
		result.append(", isValid: ");
		result.append(isValid);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
