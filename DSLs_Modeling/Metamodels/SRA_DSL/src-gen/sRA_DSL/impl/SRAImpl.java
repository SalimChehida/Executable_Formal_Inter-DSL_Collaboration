/**
 */
package sRA_DSL.impl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sRA_DSL.Defense;
import sRA_DSL.Entry;
import sRA_DSL.SRA;
import sRA_DSL.SRA_DSLPackage;
import sRA_DSL.Threat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SRA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.impl.SRAImpl#getThreats <em>Threats</em>}</li>
 *   <li>{@link sRA_DSL.impl.SRAImpl#getDefenses <em>Defenses</em>}</li>
 *   <li>{@link sRA_DSL.impl.SRAImpl#getCompDefenses <em>Comp Defenses</em>}</li>
 *   <li>{@link sRA_DSL.impl.SRAImpl#getSubThreats <em>Sub Threats</em>}</li>
 *   <li>{@link sRA_DSL.impl.SRAImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link sRA_DSL.impl.SRAImpl#getNameSRAM <em>Name SRAM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SRAImpl extends MinimalEObjectImpl.Container implements SRA {
	/**
	 * The cached value of the '{@link #getThreats() <em>Threats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreats()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> threats;

	/**
	 * The cached value of the '{@link #getDefenses() <em>Defenses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefenses()
	 * @generated
	 * @ordered
	 */
	protected EList<Defense> defenses;

	/**
	 * The cached value of the '{@link #getCompDefenses() <em>Comp Defenses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompDefenses()
	 * @generated
	 * @ordered
	 */
	protected EList<Defense> compDefenses;

	/**
	 * The cached value of the '{@link #getSubThreats() <em>Sub Threats</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubThreats()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> subThreats;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Entry entry;

	/**
	 * The default value of the '{@link #getNameSRAM() <em>Name SRAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSRAM()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSRAM() <em>Name SRAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSRAM()
	 * @generated
	 * @ordered
	 */
	protected String nameSRAM = NAME_SRAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SRAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SRA_DSLPackage.Literals.SRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threat> getThreats() {
		if (threats == null) {
			threats = new EObjectContainmentEList<Threat>(Threat.class, this, SRA_DSLPackage.SRA__THREATS);
		}
		return threats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Defense> getDefenses() {
		if (defenses == null) {
			defenses = new EObjectContainmentEList<Defense>(Defense.class, this, SRA_DSLPackage.SRA__DEFENSES);
		}
		return defenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Defense> getCompDefenses() {
		if (compDefenses == null) {
			compDefenses = new EObjectResolvingEList<Defense>(Defense.class, this, SRA_DSLPackage.SRA__COMP_DEFENSES);
		}
		return compDefenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threat> getSubThreats() {
		if (subThreats == null) {
			subThreats = new EObjectResolvingEList<Threat>(Threat.class, this, SRA_DSLPackage.SRA__SUB_THREATS);
		}
		return subThreats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Entry newEntry, NotificationChain msgs) {
		Entry oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SRA_DSLPackage.SRA__ENTRY,
					oldEntry, newEntry);
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
	public void setEntry(Entry newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject) entry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SRA_DSLPackage.SRA__ENTRY, null, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject) newEntry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SRA_DSLPackage.SRA__ENTRY, null, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SRA_DSLPackage.SRA__ENTRY, newEntry, newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSRAM() {
		return nameSRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSRAM(String newNameSRAM) {
		String oldNameSRAM = nameSRAM;
		nameSRAM = newNameSRAM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SRA_DSLPackage.SRA__NAME_SRAM, oldNameSRAM,
					nameSRAM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void selectThreat() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void computeDefenses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initSRA() {
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
		case SRA_DSLPackage.SRA__THREATS:
			return ((InternalEList<?>) getThreats()).basicRemove(otherEnd, msgs);
		case SRA_DSLPackage.SRA__DEFENSES:
			return ((InternalEList<?>) getDefenses()).basicRemove(otherEnd, msgs);
		case SRA_DSLPackage.SRA__ENTRY:
			return basicSetEntry(null, msgs);
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
		case SRA_DSLPackage.SRA__THREATS:
			return getThreats();
		case SRA_DSLPackage.SRA__DEFENSES:
			return getDefenses();
		case SRA_DSLPackage.SRA__COMP_DEFENSES:
			return getCompDefenses();
		case SRA_DSLPackage.SRA__SUB_THREATS:
			return getSubThreats();
		case SRA_DSLPackage.SRA__ENTRY:
			return getEntry();
		case SRA_DSLPackage.SRA__NAME_SRAM:
			return getNameSRAM();
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
		case SRA_DSLPackage.SRA__THREATS:
			getThreats().clear();
			getThreats().addAll((Collection<? extends Threat>) newValue);
			return;
		case SRA_DSLPackage.SRA__DEFENSES:
			getDefenses().clear();
			getDefenses().addAll((Collection<? extends Defense>) newValue);
			return;
		case SRA_DSLPackage.SRA__COMP_DEFENSES:
			getCompDefenses().clear();
			getCompDefenses().addAll((Collection<? extends Defense>) newValue);
			return;
		case SRA_DSLPackage.SRA__SUB_THREATS:
			getSubThreats().clear();
			getSubThreats().addAll((Collection<? extends Threat>) newValue);
			return;
		case SRA_DSLPackage.SRA__ENTRY:
			setEntry((Entry) newValue);
			return;
		case SRA_DSLPackage.SRA__NAME_SRAM:
			setNameSRAM((String) newValue);
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
		case SRA_DSLPackage.SRA__THREATS:
			getThreats().clear();
			return;
		case SRA_DSLPackage.SRA__DEFENSES:
			getDefenses().clear();
			return;
		case SRA_DSLPackage.SRA__COMP_DEFENSES:
			getCompDefenses().clear();
			return;
		case SRA_DSLPackage.SRA__SUB_THREATS:
			getSubThreats().clear();
			return;
		case SRA_DSLPackage.SRA__ENTRY:
			setEntry((Entry) null);
			return;
		case SRA_DSLPackage.SRA__NAME_SRAM:
			setNameSRAM(NAME_SRAM_EDEFAULT);
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
		case SRA_DSLPackage.SRA__THREATS:
			return threats != null && !threats.isEmpty();
		case SRA_DSLPackage.SRA__DEFENSES:
			return defenses != null && !defenses.isEmpty();
		case SRA_DSLPackage.SRA__COMP_DEFENSES:
			return compDefenses != null && !compDefenses.isEmpty();
		case SRA_DSLPackage.SRA__SUB_THREATS:
			return subThreats != null && !subThreats.isEmpty();
		case SRA_DSLPackage.SRA__ENTRY:
			return entry != null;
		case SRA_DSLPackage.SRA__NAME_SRAM:
			return NAME_SRAM_EDEFAULT == null ? nameSRAM != null : !NAME_SRAM_EDEFAULT.equals(nameSRAM);
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
		case SRA_DSLPackage.SRA___SELECT_THREAT:
			selectThreat();
			return null;
		case SRA_DSLPackage.SRA___COMPUTE_DEFENSES:
			computeDefenses();
			return null;
		case SRA_DSLPackage.SRA___INIT_SRA:
			initSRA();
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
		result.append(" (nameSRAM: ");
		result.append(nameSRAM);
		result.append(')');
		return result.toString();
	}

} //SRAImpl
