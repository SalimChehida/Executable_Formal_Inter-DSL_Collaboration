/**
 */
package sRA_DSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sRA_DSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SRA_DSLFactoryImpl extends EFactoryImpl implements SRA_DSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SRA_DSLFactory init() {
		try {
			SRA_DSLFactory theSRA_DSLFactory = (SRA_DSLFactory) EPackage.Registry.INSTANCE
					.getEFactory(SRA_DSLPackage.eNS_URI);
			if (theSRA_DSLFactory != null) {
				return theSRA_DSLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SRA_DSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRA_DSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SRA_DSLPackage.SRA:
			return createSRA();
		case SRA_DSLPackage.THREAT:
			return createThreat();
		case SRA_DSLPackage.DEFENSE:
			return createDefense();
		case SRA_DSLPackage.AND:
			return createAND();
		case SRA_DSLPackage.OR:
			return createOR();
		case SRA_DSLPackage.NOT:
			return createNOT();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRA createSRA() {
		SRAImpl sra = new SRAImpl();
		return sra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat createThreat() {
		ThreatImpl threat = new ThreatImpl();
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Defense createDefense() {
		DefenseImpl defense = new DefenseImpl();
		return defense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AND createAND() {
		ANDImpl and = new ANDImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OR createOR() {
		ORImpl or = new ORImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOT createNOT() {
		NOTImpl not = new NOTImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRA_DSLPackage getSRA_DSLPackage() {
		return (SRA_DSLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SRA_DSLPackage getPackage() {
		return SRA_DSLPackage.eINSTANCE;
	}

} //SRA_DSLFactoryImpl
