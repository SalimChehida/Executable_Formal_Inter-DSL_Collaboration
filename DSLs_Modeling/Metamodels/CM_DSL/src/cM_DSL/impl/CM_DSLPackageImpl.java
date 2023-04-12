/**
 */
package cM_DSL.impl;

import cM_DSL.Action;
import cM_DSL.Application;
import cM_DSL.CM_DSLFactory;
import cM_DSL.CM_DSLPackage;
import cM_DSL.Communication;
import cM_DSL.Configuration;
import cM_DSL.Infrastructure;
import cM_DSL.OptimisationAlgo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CM_DSLPackageImpl extends EPackageImpl implements CM_DSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimisationAlgoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cM_DSL.CM_DSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CM_DSLPackageImpl() {
		super(eNS_URI, CM_DSLFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CM_DSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CM_DSLPackage init() {
		if (isInited) return (CM_DSLPackage)EPackage.Registry.INSTANCE.getEPackage(CM_DSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCM_DSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CM_DSLPackageImpl theCM_DSLPackage = registeredCM_DSLPackage instanceof CM_DSLPackageImpl ? (CM_DSLPackageImpl)registeredCM_DSLPackage : new CM_DSLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCM_DSLPackage.createPackageContents();

		// Initialize created meta-data
		theCM_DSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCM_DSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CM_DSLPackage.eNS_URI, theCM_DSLPackage);
		return theCM_DSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCM() {
		return cmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCM_Infrastructures() {
		return (EReference)cmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCM_Configurations() {
		return (EReference)cmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCM_Applications() {
		return (EReference)cmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCM_SelectedConf() {
		return (EReference)cmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCM_NameCMM() {
		return (EAttribute)cmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCM__SelectConfig() {
		return cmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_NameConf() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_QoS() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_IsValid() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Infr() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_App() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguration__ValidateConfig() {
		return configurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguration__SetQoS() {
		return configurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructure() {
		return infrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfrastructure_NameInf() {
		return (EAttribute)infrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Communications() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_NameApp() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Actions() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Opt_algo() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimisationAlgo() {
		return optimisationAlgoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunication() {
		return communicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM_DSLFactory getCM_DSLFactory() {
		return (CM_DSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cmEClass = createEClass(CM);
		createEReference(cmEClass, CM__INFRASTRUCTURES);
		createEReference(cmEClass, CM__CONFIGURATIONS);
		createEReference(cmEClass, CM__APPLICATIONS);
		createEReference(cmEClass, CM__SELECTED_CONF);
		createEAttribute(cmEClass, CM__NAME_CMM);
		createEOperation(cmEClass, CM___SELECT_CONFIG);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__NAME_CONF);
		createEAttribute(configurationEClass, CONFIGURATION__QO_S);
		createEAttribute(configurationEClass, CONFIGURATION__IS_VALID);
		createEReference(configurationEClass, CONFIGURATION__INFR);
		createEReference(configurationEClass, CONFIGURATION__APP);
		createEOperation(configurationEClass, CONFIGURATION___VALIDATE_CONFIG);
		createEOperation(configurationEClass, CONFIGURATION___SET_QO_S);

		infrastructureEClass = createEClass(INFRASTRUCTURE);
		createEAttribute(infrastructureEClass, INFRASTRUCTURE__NAME_INF);
		createEReference(infrastructureEClass, INFRASTRUCTURE__COMMUNICATIONS);

		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME_APP);
		createEReference(applicationEClass, APPLICATION__ACTIONS);
		createEReference(applicationEClass, APPLICATION__OPT_ALGO);

		optimisationAlgoEClass = createEClass(OPTIMISATION_ALGO);

		actionEClass = createEClass(ACTION);

		communicationEClass = createEClass(COMMUNICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cmEClass, cM_DSL.CM.class, "CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCM_Infrastructures(), this.getInfrastructure(), null, "infrastructures", null, 0, -1, cM_DSL.CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCM_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1, cM_DSL.CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCM_Applications(), this.getApplication(), null, "applications", null, 0, -1, cM_DSL.CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCM_SelectedConf(), this.getConfiguration(), null, "selectedConf", null, 0, 1, cM_DSL.CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCM_NameCMM(), ecorePackage.getEString(), "nameCMM", null, 1, 1, cM_DSL.CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCM__SelectConfig(), null, "selectConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_NameConf(), ecorePackage.getEString(), "nameConf", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_QoS(), ecorePackage.getEFloat(), "QoS", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_IsValid(), ecorePackage.getEBoolean(), "isValid", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Infr(), this.getInfrastructure(), null, "infr", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_App(), this.getApplication(), null, "app", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConfiguration__ValidateConfig(), this.getConfiguration(), "validateConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConfiguration__SetQoS(), null, "setQoS", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfrastructure_NameInf(), ecorePackage.getEString(), "nameInf", null, 1, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructure_Communications(), this.getCommunication(), null, "communications", null, 0, -1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_NameApp(), ecorePackage.getEString(), "nameApp", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Actions(), this.getAction(), null, "actions", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Opt_algo(), this.getOptimisationAlgo(), null, "opt_algo", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimisationAlgoEClass, OptimisationAlgo.class, "OptimisationAlgo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationEClass, Communication.class, "Communication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// meeduse
		createMeeduseAnnotations();
	}

	/**
	 * Initializes the annotations for <b>meeduse</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMeeduseAnnotations() {
		String source = "meeduse";
		addAnnotation
		  (getCM_Infrastructures(),
		   source,
		   new String[] {
			   "association", "infrastructures"
		   });
		addAnnotation
		  (getCM_Configurations(),
		   source,
		   new String[] {
			   "association", "configurations"
		   });
		addAnnotation
		  (getCM_Applications(),
		   source,
		   new String[] {
			   "association", "applications"
		   });
		addAnnotation
		  (getCM_SelectedConf(),
		   source,
		   new String[] {
			   "association", "selectedConf"
		   });
		addAnnotation
		  (getConfiguration__ValidateConfig(),
		   source,
		   new String[] {
			   "body", "result := aConfiguration"
		   });
		addAnnotation
		  (getConfiguration_Infr(),
		   source,
		   new String[] {
			   "association", "infr"
		   });
		addAnnotation
		  (getConfiguration_App(),
		   source,
		   new String[] {
			   "association", "app"
		   });
		addAnnotation
		  (getInfrastructure_Communications(),
		   source,
		   new String[] {
			   "association", "communications"
		   });
		addAnnotation
		  (getApplication_Actions(),
		   source,
		   new String[] {
			   "association", "actions"
		   });
		addAnnotation
		  (getApplication_Opt_algo(),
		   source,
		   new String[] {
			   "association", "opt_algo"
		   });
	}

} //CM_DSLPackageImpl
