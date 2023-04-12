/**
 */
package inter_DSL_Collaboration_CM_SRA.impl;

import cM_DSL.CM;

import inter_DSL_Collaboration_CM_SRA.COMPOSITION;
import inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage;
import inter_DSL_Collaboration_CM_SRA.SecureConfiguration;

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

import sRA_DSL.SRA;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COMPOSITION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.impl.COMPOSITIONImpl#getSra <em>Sra</em>}</li>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.impl.COMPOSITIONImpl#getCm <em>Cm</em>}</li>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.impl.COMPOSITIONImpl#getSecureConfigs <em>Secure Configs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COMPOSITIONImpl extends MinimalEObjectImpl.Container implements COMPOSITION {
	/**
	 * The cached value of the '{@link #getSra() <em>Sra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSra()
	 * @generated
	 * @ordered
	 */
	protected SRA sra;

	/**
	 * The cached value of the '{@link #getCm() <em>Cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCm()
	 * @generated
	 * @ordered
	 */
	protected CM cm;

	/**
	 * The cached value of the '{@link #getSecureConfigs() <em>Secure Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<SecureConfiguration> secureConfigs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected COMPOSITIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inter_DSL_Collaboration_CM_SRAPackage.Literals.COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRA getSra() {
		if (sra != null && sra.eIsProxy()) {
			InternalEObject oldSra = (InternalEObject) sra;
			sra = (SRA) eResolveProxy(oldSra);
			if (sra != oldSra) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SRA, oldSra, sra));
			}
		}
		return sra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRA basicGetSra() {
		return sra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSra(SRA newSra) {
		SRA oldSra = sra;
		sra = newSra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SRA, oldSra, sra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM getCm() {
		if (cm != null && cm.eIsProxy()) {
			InternalEObject oldCm = (InternalEObject) cm;
			cm = (CM) eResolveProxy(oldCm);
			if (cm != oldCm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__CM, oldCm, cm));
			}
		}
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM basicGetCm() {
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCm(CM newCm) {
		CM oldCm = cm;
		cm = newCm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__CM,
					oldCm, cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecureConfiguration> getSecureConfigs() {
		if (secureConfigs == null) {
			secureConfigs = new EObjectContainmentEList<SecureConfiguration>(SecureConfiguration.class, this,
					Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SECURE_CONFIGS);
		}
		return secureConfigs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SECURE_CONFIGS:
			return ((InternalEList<?>) getSecureConfigs()).basicRemove(otherEnd, msgs);
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
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SRA:
			if (resolve)
				return getSra();
			return basicGetSra();
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__CM:
			if (resolve)
				return getCm();
			return basicGetCm();
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SECURE_CONFIGS:
			return getSecureConfigs();
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
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SRA:
			setSra((SRA) newValue);
			return;
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__CM:
			setCm((CM) newValue);
			return;
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SECURE_CONFIGS:
			getSecureConfigs().clear();
			getSecureConfigs().addAll((Collection<? extends SecureConfiguration>) newValue);
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
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SRA:
			setSra((SRA) null);
			return;
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__CM:
			setCm((CM) null);
			return;
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SECURE_CONFIGS:
			getSecureConfigs().clear();
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
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SRA:
			return sra != null;
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__CM:
			return cm != null;
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION__SECURE_CONFIGS:
			return secureConfigs != null && !secureConfigs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //COMPOSITIONImpl
