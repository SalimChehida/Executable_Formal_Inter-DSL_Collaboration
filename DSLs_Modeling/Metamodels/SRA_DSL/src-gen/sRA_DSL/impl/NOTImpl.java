/**
 */
package sRA_DSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sRA_DSL.Entry;
import sRA_DSL.NOT;
import sRA_DSL.SRA_DSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NOT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.impl.NOTImpl#getEntryNot <em>Entry Not</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NOTImpl extends EntryImpl implements NOT {
	/**
	 * The cached value of the '{@link #getEntryNot() <em>Entry Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryNot()
	 * @generated
	 * @ordered
	 */
	protected Entry entryNot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NOTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SRA_DSLPackage.Literals.NOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry getEntryNot() {
		return entryNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryNot(Entry newEntryNot, NotificationChain msgs) {
		Entry oldEntryNot = entryNot;
		entryNot = newEntryNot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SRA_DSLPackage.NOT__ENTRY_NOT, oldEntryNot, newEntryNot);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryNot(Entry newEntryNot) {
		if (newEntryNot != entryNot) {
			NotificationChain msgs = null;
			if (entryNot != null)
				msgs = ((InternalEObject) entryNot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SRA_DSLPackage.NOT__ENTRY_NOT, null, msgs);
			if (newEntryNot != null)
				msgs = ((InternalEObject) newEntryNot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SRA_DSLPackage.NOT__ENTRY_NOT, null, msgs);
			msgs = basicSetEntryNot(newEntryNot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SRA_DSLPackage.NOT__ENTRY_NOT, newEntryNot,
					newEntryNot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SRA_DSLPackage.NOT__ENTRY_NOT:
			return basicSetEntryNot(null, msgs);
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
		case SRA_DSLPackage.NOT__ENTRY_NOT:
			return getEntryNot();
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
		case SRA_DSLPackage.NOT__ENTRY_NOT:
			setEntryNot((Entry) newValue);
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
		case SRA_DSLPackage.NOT__ENTRY_NOT:
			setEntryNot((Entry) null);
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
		case SRA_DSLPackage.NOT__ENTRY_NOT:
			return entryNot != null;
		}
		return super.eIsSet(featureID);
	}

} //NOTImpl
