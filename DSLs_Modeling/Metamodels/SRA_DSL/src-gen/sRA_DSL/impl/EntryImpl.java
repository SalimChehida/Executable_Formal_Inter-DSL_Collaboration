/**
 */
package sRA_DSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sRA_DSL.Defense;
import sRA_DSL.Entry;
import sRA_DSL.SRA_DSLPackage;
import sRA_DSL.Threat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.impl.EntryImpl#getDefs <em>Defs</em>}</li>
 *   <li>{@link sRA_DSL.impl.EntryImpl#getThrs <em>Thrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntryImpl extends MinimalEObjectImpl.Container implements Entry {
	/**
	 * The cached value of the '{@link #getDefs() <em>Defs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<Defense> defs;

	/**
	 * The cached value of the '{@link #getThrs() <em>Thrs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrs()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> thrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SRA_DSLPackage.Literals.ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Defense> getDefs() {
		if (defs == null) {
			defs = new EObjectResolvingEList<Defense>(Defense.class, this, SRA_DSLPackage.ENTRY__DEFS);
		}
		return defs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threat> getThrs() {
		if (thrs == null) {
			thrs = new EObjectResolvingEList<Threat>(Threat.class, this, SRA_DSLPackage.ENTRY__THRS);
		}
		return thrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SRA_DSLPackage.ENTRY__DEFS:
			return getDefs();
		case SRA_DSLPackage.ENTRY__THRS:
			return getThrs();
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
		case SRA_DSLPackage.ENTRY__DEFS:
			getDefs().clear();
			getDefs().addAll((Collection<? extends Defense>) newValue);
			return;
		case SRA_DSLPackage.ENTRY__THRS:
			getThrs().clear();
			getThrs().addAll((Collection<? extends Threat>) newValue);
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
		case SRA_DSLPackage.ENTRY__DEFS:
			getDefs().clear();
			return;
		case SRA_DSLPackage.ENTRY__THRS:
			getThrs().clear();
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
		case SRA_DSLPackage.ENTRY__DEFS:
			return defs != null && !defs.isEmpty();
		case SRA_DSLPackage.ENTRY__THRS:
			return thrs != null && !thrs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntryImpl
