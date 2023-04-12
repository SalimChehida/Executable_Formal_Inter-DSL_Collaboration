/**
 */
package cM_DSL.impl;

import cM_DSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CM_DSLFactoryImpl extends EFactoryImpl implements CM_DSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CM_DSLFactory init() {
		try {
			CM_DSLFactory theCM_DSLFactory = (CM_DSLFactory)EPackage.Registry.INSTANCE.getEFactory(CM_DSLPackage.eNS_URI);
			if (theCM_DSLFactory != null) {
				return theCM_DSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CM_DSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM_DSLFactoryImpl() {
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
			case CM_DSLPackage.CM: return createCM();
			case CM_DSLPackage.CONFIGURATION: return createConfiguration();
			case CM_DSLPackage.INFRASTRUCTURE: return createInfrastructure();
			case CM_DSLPackage.APPLICATION: return createApplication();
			case CM_DSLPackage.OPTIMISATION_ALGO: return createOptimisationAlgo();
			case CM_DSLPackage.ACTION: return createAction();
			case CM_DSLPackage.COMMUNICATION: return createCommunication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM createCM() {
		CMImpl cm = new CMImpl();
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure createInfrastructure() {
		InfrastructureImpl infrastructure = new InfrastructureImpl();
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisationAlgo createOptimisationAlgo() {
		OptimisationAlgoImpl optimisationAlgo = new OptimisationAlgoImpl();
		return optimisationAlgo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM_DSLPackage getCM_DSLPackage() {
		return (CM_DSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CM_DSLPackage getPackage() {
		return CM_DSLPackage.eINSTANCE;
	}

} //CM_DSLFactoryImpl
