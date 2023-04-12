/**
 */
package cM_DSL.impl;

import cM_DSL.Application;
import cM_DSL.CM;
import cM_DSL.CM_DSLPackage;
import cM_DSL.Configuration;
import cM_DSL.Infrastructure;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cM_DSL.impl.CMImpl#getInfrastructures <em>Infrastructures</em>}</li>
 *   <li>{@link cM_DSL.impl.CMImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link cM_DSL.impl.CMImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link cM_DSL.impl.CMImpl#getSelectedConf <em>Selected Conf</em>}</li>
 *   <li>{@link cM_DSL.impl.CMImpl#getNameCMM <em>Name CMM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CMImpl extends MinimalEObjectImpl.Container implements CM {
	/**
	 * The cached value of the '{@link #getInfrastructures() <em>Infrastructures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Infrastructure> infrastructures;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configurations;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

	/**
	 * The cached value of the '{@link #getSelectedConf() <em>Selected Conf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedConf()
	 * @generated
	 * @ordered
	 */
	protected Configuration selectedConf;

	/**
	 * The default value of the '{@link #getNameCMM() <em>Name CMM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameCMM()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_CMM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameCMM() <em>Name CMM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameCMM()
	 * @generated
	 * @ordered
	 */
	protected String nameCMM = NAME_CMM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CM_DSLPackage.Literals.CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Infrastructure> getInfrastructures() {
		if (infrastructures == null) {
			infrastructures = new EObjectContainmentEList<Infrastructure>(Infrastructure.class, this, CM_DSLPackage.CM__INFRASTRUCTURES);
		}
		return infrastructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, CM_DSLPackage.CM__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectContainmentEList<Application>(Application.class, this, CM_DSLPackage.CM__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getSelectedConf() {
		if (selectedConf != null && selectedConf.eIsProxy()) {
			InternalEObject oldSelectedConf = (InternalEObject)selectedConf;
			selectedConf = (Configuration)eResolveProxy(oldSelectedConf);
			if (selectedConf != oldSelectedConf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CM_DSLPackage.CM__SELECTED_CONF, oldSelectedConf, selectedConf));
			}
		}
		return selectedConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetSelectedConf() {
		return selectedConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedConf(Configuration newSelectedConf) {
		Configuration oldSelectedConf = selectedConf;
		selectedConf = newSelectedConf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CM_DSLPackage.CM__SELECTED_CONF, oldSelectedConf, selectedConf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameCMM() {
		return nameCMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameCMM(String newNameCMM) {
		String oldNameCMM = nameCMM;
		nameCMM = newNameCMM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CM_DSLPackage.CM__NAME_CMM, oldNameCMM, nameCMM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void selectConfig() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CM_DSLPackage.CM__INFRASTRUCTURES:
				return ((InternalEList<?>)getInfrastructures()).basicRemove(otherEnd, msgs);
			case CM_DSLPackage.CM__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
			case CM_DSLPackage.CM__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
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
			case CM_DSLPackage.CM__INFRASTRUCTURES:
				return getInfrastructures();
			case CM_DSLPackage.CM__CONFIGURATIONS:
				return getConfigurations();
			case CM_DSLPackage.CM__APPLICATIONS:
				return getApplications();
			case CM_DSLPackage.CM__SELECTED_CONF:
				if (resolve) return getSelectedConf();
				return basicGetSelectedConf();
			case CM_DSLPackage.CM__NAME_CMM:
				return getNameCMM();
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
			case CM_DSLPackage.CM__INFRASTRUCTURES:
				getInfrastructures().clear();
				getInfrastructures().addAll((Collection<? extends Infrastructure>)newValue);
				return;
			case CM_DSLPackage.CM__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case CM_DSLPackage.CM__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case CM_DSLPackage.CM__SELECTED_CONF:
				setSelectedConf((Configuration)newValue);
				return;
			case CM_DSLPackage.CM__NAME_CMM:
				setNameCMM((String)newValue);
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
			case CM_DSLPackage.CM__INFRASTRUCTURES:
				getInfrastructures().clear();
				return;
			case CM_DSLPackage.CM__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case CM_DSLPackage.CM__APPLICATIONS:
				getApplications().clear();
				return;
			case CM_DSLPackage.CM__SELECTED_CONF:
				setSelectedConf((Configuration)null);
				return;
			case CM_DSLPackage.CM__NAME_CMM:
				setNameCMM(NAME_CMM_EDEFAULT);
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
			case CM_DSLPackage.CM__INFRASTRUCTURES:
				return infrastructures != null && !infrastructures.isEmpty();
			case CM_DSLPackage.CM__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case CM_DSLPackage.CM__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case CM_DSLPackage.CM__SELECTED_CONF:
				return selectedConf != null;
			case CM_DSLPackage.CM__NAME_CMM:
				return NAME_CMM_EDEFAULT == null ? nameCMM != null : !NAME_CMM_EDEFAULT.equals(nameCMM);
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
			case CM_DSLPackage.CM___SELECT_CONFIG:
				selectConfig();
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
		result.append(" (nameCMM: ");
		result.append(nameCMM);
		result.append(')');
		return result.toString();
	}

} //CMImpl
