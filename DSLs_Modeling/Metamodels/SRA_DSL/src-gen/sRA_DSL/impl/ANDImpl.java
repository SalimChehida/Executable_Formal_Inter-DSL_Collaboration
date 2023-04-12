/**
 */
package sRA_DSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sRA_DSL.AND;
import sRA_DSL.Entry;
import sRA_DSL.SRA_DSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AND</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.impl.ANDImpl#getEntryAnd <em>Entry And</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ANDImpl extends EntryImpl implements AND {
	/**
	 * The cached value of the '{@link #getEntryAnd() <em>Entry And</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryAnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Entry> entryAnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SRA_DSLPackage.Literals.AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entry> getEntryAnd() {
		if (entryAnd == null) {
			entryAnd = new EObjectContainmentEList<Entry>(Entry.class, this, SRA_DSLPackage.AND__ENTRY_AND);
		}
		return entryAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SRA_DSLPackage.AND__ENTRY_AND:
			return ((InternalEList<?>) getEntryAnd()).basicRemove(otherEnd, msgs);
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
		case SRA_DSLPackage.AND__ENTRY_AND:
			return getEntryAnd();
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
		case SRA_DSLPackage.AND__ENTRY_AND:
			getEntryAnd().clear();
			getEntryAnd().addAll((Collection<? extends Entry>) newValue);
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
		case SRA_DSLPackage.AND__ENTRY_AND:
			getEntryAnd().clear();
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
		case SRA_DSLPackage.AND__ENTRY_AND:
			return entryAnd != null && !entryAnd.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ANDImpl
