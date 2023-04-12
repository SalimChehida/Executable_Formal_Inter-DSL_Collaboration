/**
 */
package sRA_DSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sRA_DSL.Defense;
import sRA_DSL.SRA_DSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.impl.DefenseImpl#getNameDef <em>Name Def</em>}</li>
 *   <li>{@link sRA_DSL.impl.DefenseImpl#getCostDef <em>Cost Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefenseImpl extends MinimalEObjectImpl.Container implements Defense {
	/**
	 * The default value of the '{@link #getNameDef() <em>Name Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDef()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_DEF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameDef() <em>Name Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDef()
	 * @generated
	 * @ordered
	 */
	protected String nameDef = NAME_DEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostDef() <em>Cost Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDef()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_DEF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostDef() <em>Cost Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDef()
	 * @generated
	 * @ordered
	 */
	protected float costDef = COST_DEF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SRA_DSLPackage.Literals.DEFENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameDef() {
		return nameDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameDef(String newNameDef) {
		String oldNameDef = nameDef;
		nameDef = newNameDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SRA_DSLPackage.DEFENSE__NAME_DEF, oldNameDef,
					nameDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCostDef() {
		return costDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostDef(float newCostDef) {
		float oldCostDef = costDef;
		costDef = newCostDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SRA_DSLPackage.DEFENSE__COST_DEF, oldCostDef,
					costDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SRA_DSLPackage.DEFENSE__NAME_DEF:
			return getNameDef();
		case SRA_DSLPackage.DEFENSE__COST_DEF:
			return getCostDef();
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
		case SRA_DSLPackage.DEFENSE__NAME_DEF:
			setNameDef((String) newValue);
			return;
		case SRA_DSLPackage.DEFENSE__COST_DEF:
			setCostDef((Float) newValue);
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
		case SRA_DSLPackage.DEFENSE__NAME_DEF:
			setNameDef(NAME_DEF_EDEFAULT);
			return;
		case SRA_DSLPackage.DEFENSE__COST_DEF:
			setCostDef(COST_DEF_EDEFAULT);
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
		case SRA_DSLPackage.DEFENSE__NAME_DEF:
			return NAME_DEF_EDEFAULT == null ? nameDef != null : !NAME_DEF_EDEFAULT.equals(nameDef);
		case SRA_DSLPackage.DEFENSE__COST_DEF:
			return costDef != COST_DEF_EDEFAULT;
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
		result.append(" (nameDef: ");
		result.append(nameDef);
		result.append(", costDef: ");
		result.append(costDef);
		result.append(')');
		return result.toString();
	}

} //DefenseImpl
