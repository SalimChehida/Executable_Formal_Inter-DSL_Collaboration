/**
 */
package inter_DSL_Collaboration_CM_SRA.impl;

import cM_DSL.Configuration;

import inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage;
import inter_DSL_Collaboration_CM_SRA.SecureConfiguration;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sRA_DSL.Defense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secure Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.impl.SecureConfigurationImpl#getValidConfig <em>Valid Config</em>}</li>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.impl.SecureConfigurationImpl#getValidDefenses <em>Valid Defenses</em>}</li>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.impl.SecureConfigurationImpl#getNameSecConf <em>Name Sec Conf</em>}</li>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.impl.SecureConfigurationImpl#isIsValidSecConf <em>Is Valid Sec Conf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecureConfigurationImpl extends MinimalEObjectImpl.Container implements SecureConfiguration {
	/**
	 * The cached value of the '{@link #getValidConfig() <em>Valid Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidConfig()
	 * @generated
	 * @ordered
	 */
	protected Configuration validConfig;

	/**
	 * The cached value of the '{@link #getValidDefenses() <em>Valid Defenses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDefenses()
	 * @generated
	 * @ordered
	 */
	protected EList<Defense> validDefenses;

	/**
	 * The default value of the '{@link #getNameSecConf() <em>Name Sec Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSecConf()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SEC_CONF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSecConf() <em>Name Sec Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSecConf()
	 * @generated
	 * @ordered
	 */
	protected String nameSecConf = NAME_SEC_CONF_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsValidSecConf() <em>Is Valid Sec Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValidSecConf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VALID_SEC_CONF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsValidSecConf() <em>Is Valid Sec Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValidSecConf()
	 * @generated
	 * @ordered
	 */
	protected boolean isValidSecConf = IS_VALID_SEC_CONF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecureConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inter_DSL_Collaboration_CM_SRAPackage.Literals.SECURE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getValidConfig() {
		if (validConfig != null && validConfig.eIsProxy()) {
			InternalEObject oldValidConfig = (InternalEObject) validConfig;
			validConfig = (Configuration) eResolveProxy(oldValidConfig);
			if (validConfig != oldValidConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_CONFIG, oldValidConfig,
							validConfig));
			}
		}
		return validConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetValidConfig() {
		return validConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidConfig(Configuration newValidConfig) {
		Configuration oldValidConfig = validConfig;
		validConfig = newValidConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_CONFIG, oldValidConfig,
					validConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Defense> getValidDefenses() {
		if (validDefenses == null) {
			validDefenses = new EObjectResolvingEList<Defense>(Defense.class, this,
					Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_DEFENSES);
		}
		return validDefenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSecConf() {
		return nameSecConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSecConf(String newNameSecConf) {
		String oldNameSecConf = nameSecConf;
		nameSecConf = newNameSecConf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__NAME_SEC_CONF, oldNameSecConf,
					nameSecConf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsValidSecConf() {
		return isValidSecConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValidSecConf(boolean newIsValidSecConf) {
		boolean oldIsValidSecConf = isValidSecConf;
		isValidSecConf = newIsValidSecConf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__IS_VALID_SEC_CONF, oldIsValidSecConf,
					isValidSecConf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSecureConfig() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void affectValidDefenses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void approveSecureConfig() {
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
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_CONFIG:
			if (resolve)
				return getValidConfig();
			return basicGetValidConfig();
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_DEFENSES:
			return getValidDefenses();
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__NAME_SEC_CONF:
			return getNameSecConf();
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__IS_VALID_SEC_CONF:
			return isIsValidSecConf();
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
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_CONFIG:
			setValidConfig((Configuration) newValue);
			return;
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_DEFENSES:
			getValidDefenses().clear();
			getValidDefenses().addAll((Collection<? extends Defense>) newValue);
			return;
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__NAME_SEC_CONF:
			setNameSecConf((String) newValue);
			return;
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__IS_VALID_SEC_CONF:
			setIsValidSecConf((Boolean) newValue);
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
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_CONFIG:
			setValidConfig((Configuration) null);
			return;
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_DEFENSES:
			getValidDefenses().clear();
			return;
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__NAME_SEC_CONF:
			setNameSecConf(NAME_SEC_CONF_EDEFAULT);
			return;
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__IS_VALID_SEC_CONF:
			setIsValidSecConf(IS_VALID_SEC_CONF_EDEFAULT);
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
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_CONFIG:
			return validConfig != null;
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__VALID_DEFENSES:
			return validDefenses != null && !validDefenses.isEmpty();
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__NAME_SEC_CONF:
			return NAME_SEC_CONF_EDEFAULT == null ? nameSecConf != null : !NAME_SEC_CONF_EDEFAULT.equals(nameSecConf);
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__IS_VALID_SEC_CONF:
			return isValidSecConf != IS_VALID_SEC_CONF_EDEFAULT;
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
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION___CREATE_SECURE_CONFIG:
			createSecureConfig();
			return null;
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION___AFFECT_VALID_DEFENSES:
			affectValidDefenses();
			return null;
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION___APPROVE_SECURE_CONFIG:
			approveSecureConfig();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nameSecConf: ");
		result.append(nameSecConf);
		result.append(", isValidSecConf: ");
		result.append(isValidSecConf);
		result.append(')');
		return result.toString();
	}

} //SecureConfigurationImpl
