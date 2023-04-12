/**
 */
package cM_DSL.impl;

import cM_DSL.Action;
import cM_DSL.Application;
import cM_DSL.CM_DSLPackage;
import cM_DSL.OptimisationAlgo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cM_DSL.impl.ApplicationImpl#getNameApp <em>Name App</em>}</li>
 *   <li>{@link cM_DSL.impl.ApplicationImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link cM_DSL.impl.ApplicationImpl#getOpt_algo <em>Opt algo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
	/**
	 * The default value of the '{@link #getNameApp() <em>Name App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameApp()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_APP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameApp() <em>Name App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameApp()
	 * @generated
	 * @ordered
	 */
	protected String nameApp = NAME_APP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getOpt_algo() <em>Opt algo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpt_algo()
	 * @generated
	 * @ordered
	 */
	protected OptimisationAlgo opt_algo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CM_DSLPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameApp() {
		return nameApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameApp(String newNameApp) {
		String oldNameApp = nameApp;
		nameApp = newNameApp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CM_DSLPackage.APPLICATION__NAME_APP, oldNameApp, nameApp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<Action>(Action.class, this, CM_DSLPackage.APPLICATION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationAlgo getOpt_algo() {
		if (opt_algo != null && opt_algo.eIsProxy()) {
			InternalEObject oldOpt_algo = (InternalEObject)opt_algo;
			opt_algo = (OptimisationAlgo)eResolveProxy(oldOpt_algo);
			if (opt_algo != oldOpt_algo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CM_DSLPackage.APPLICATION__OPT_ALGO, oldOpt_algo, opt_algo));
			}
		}
		return opt_algo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationAlgo basicGetOpt_algo() {
		return opt_algo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpt_algo(OptimisationAlgo newOpt_algo) {
		OptimisationAlgo oldOpt_algo = opt_algo;
		opt_algo = newOpt_algo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CM_DSLPackage.APPLICATION__OPT_ALGO, oldOpt_algo, opt_algo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CM_DSLPackage.APPLICATION__NAME_APP:
				return getNameApp();
			case CM_DSLPackage.APPLICATION__ACTIONS:
				return getActions();
			case CM_DSLPackage.APPLICATION__OPT_ALGO:
				if (resolve) return getOpt_algo();
				return basicGetOpt_algo();
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
			case CM_DSLPackage.APPLICATION__NAME_APP:
				setNameApp((String)newValue);
				return;
			case CM_DSLPackage.APPLICATION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case CM_DSLPackage.APPLICATION__OPT_ALGO:
				setOpt_algo((OptimisationAlgo)newValue);
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
			case CM_DSLPackage.APPLICATION__NAME_APP:
				setNameApp(NAME_APP_EDEFAULT);
				return;
			case CM_DSLPackage.APPLICATION__ACTIONS:
				getActions().clear();
				return;
			case CM_DSLPackage.APPLICATION__OPT_ALGO:
				setOpt_algo((OptimisationAlgo)null);
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
			case CM_DSLPackage.APPLICATION__NAME_APP:
				return NAME_APP_EDEFAULT == null ? nameApp != null : !NAME_APP_EDEFAULT.equals(nameApp);
			case CM_DSLPackage.APPLICATION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case CM_DSLPackage.APPLICATION__OPT_ALGO:
				return opt_algo != null;
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
		result.append(" (nameApp: ");
		result.append(nameApp);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
