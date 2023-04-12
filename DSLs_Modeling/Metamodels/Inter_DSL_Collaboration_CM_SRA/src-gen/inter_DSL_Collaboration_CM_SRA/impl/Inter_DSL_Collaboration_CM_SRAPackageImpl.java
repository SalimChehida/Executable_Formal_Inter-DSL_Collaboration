/**
 */
package inter_DSL_Collaboration_CM_SRA.impl;

import cM_DSL.CM_DSLPackage;

import inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAFactory;
import inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage;
import inter_DSL_Collaboration_CM_SRA.SecureConfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sRA_DSL.SRA_DSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Inter_DSL_Collaboration_CM_SRAPackageImpl extends EPackageImpl
		implements Inter_DSL_Collaboration_CM_SRAPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secureConfigurationEClass = null;

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
	 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Inter_DSL_Collaboration_CM_SRAPackageImpl() {
		super(eNS_URI, Inter_DSL_Collaboration_CM_SRAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Inter_DSL_Collaboration_CM_SRAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Inter_DSL_Collaboration_CM_SRAPackage init() {
		if (isInited)
			return (Inter_DSL_Collaboration_CM_SRAPackage) EPackage.Registry.INSTANCE
					.getEPackage(Inter_DSL_Collaboration_CM_SRAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInter_DSL_Collaboration_CM_SRAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Inter_DSL_Collaboration_CM_SRAPackageImpl theInter_DSL_Collaboration_CM_SRAPackage = registeredInter_DSL_Collaboration_CM_SRAPackage instanceof Inter_DSL_Collaboration_CM_SRAPackageImpl
				? (Inter_DSL_Collaboration_CM_SRAPackageImpl) registeredInter_DSL_Collaboration_CM_SRAPackage
				: new Inter_DSL_Collaboration_CM_SRAPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CM_DSLPackage.eINSTANCE.eClass();
		SRA_DSLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInter_DSL_Collaboration_CM_SRAPackage.createPackageContents();

		// Initialize created meta-data
		theInter_DSL_Collaboration_CM_SRAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInter_DSL_Collaboration_CM_SRAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Inter_DSL_Collaboration_CM_SRAPackage.eNS_URI,
				theInter_DSL_Collaboration_CM_SRAPackage);
		return theInter_DSL_Collaboration_CM_SRAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOMPOSITION() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOMPOSITION_Sra() {
		return (EReference) compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOMPOSITION_Cm() {
		return (EReference) compositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOMPOSITION_SecureConfigs() {
		return (EReference) compositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecureConfiguration() {
		return secureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecureConfiguration_ValidConfig() {
		return (EReference) secureConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecureConfiguration_ValidDefenses() {
		return (EReference) secureConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecureConfiguration_NameSecConf() {
		return (EAttribute) secureConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecureConfiguration_IsValidSecConf() {
		return (EAttribute) secureConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecureConfiguration__CreateSecureConfig() {
		return secureConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecureConfiguration__AffectValidDefenses() {
		return secureConfigurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecureConfiguration__ApproveSecureConfig() {
		return secureConfigurationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inter_DSL_Collaboration_CM_SRAFactory getInter_DSL_Collaboration_CM_SRAFactory() {
		return (Inter_DSL_Collaboration_CM_SRAFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		compositionEClass = createEClass(COMPOSITION);
		createEReference(compositionEClass, COMPOSITION__SRA);
		createEReference(compositionEClass, COMPOSITION__CM);
		createEReference(compositionEClass, COMPOSITION__SECURE_CONFIGS);

		secureConfigurationEClass = createEClass(SECURE_CONFIGURATION);
		createEReference(secureConfigurationEClass, SECURE_CONFIGURATION__VALID_CONFIG);
		createEReference(secureConfigurationEClass, SECURE_CONFIGURATION__VALID_DEFENSES);
		createEAttribute(secureConfigurationEClass, SECURE_CONFIGURATION__NAME_SEC_CONF);
		createEAttribute(secureConfigurationEClass, SECURE_CONFIGURATION__IS_VALID_SEC_CONF);
		createEOperation(secureConfigurationEClass, SECURE_CONFIGURATION___CREATE_SECURE_CONFIG);
		createEOperation(secureConfigurationEClass, SECURE_CONFIGURATION___AFFECT_VALID_DEFENSES);
		createEOperation(secureConfigurationEClass, SECURE_CONFIGURATION___APPROVE_SECURE_CONFIG);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SRA_DSLPackage theSRA_DSLPackage = (SRA_DSLPackage) EPackage.Registry.INSTANCE
				.getEPackage(SRA_DSLPackage.eNS_URI);
		CM_DSLPackage theCM_DSLPackage = (CM_DSLPackage) EPackage.Registry.INSTANCE.getEPackage(CM_DSLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(compositionEClass, inter_DSL_Collaboration_CM_SRA.COMPOSITION.class, "COMPOSITION", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOMPOSITION_Sra(), theSRA_DSLPackage.getSRA(), null, "sra", null, 1, 1,
				inter_DSL_Collaboration_CM_SRA.COMPOSITION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOMPOSITION_Cm(), theCM_DSLPackage.getCM(), null, "cm", null, 1, 1,
				inter_DSL_Collaboration_CM_SRA.COMPOSITION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOMPOSITION_SecureConfigs(), this.getSecureConfiguration(), null, "secureConfigs", null, 0,
				-1, inter_DSL_Collaboration_CM_SRA.COMPOSITION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secureConfigurationEClass, SecureConfiguration.class, "SecureConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecureConfiguration_ValidConfig(), theCM_DSLPackage.getConfiguration(), null, "validConfig",
				null, 1, 1, SecureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecureConfiguration_ValidDefenses(), theSRA_DSLPackage.getDefense(), null, "validDefenses",
				null, 0, -1, SecureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecureConfiguration_NameSecConf(), ecorePackage.getEString(), "nameSecConf", null, 1, 1,
				SecureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecureConfiguration_IsValidSecConf(), ecorePackage.getEBoolean(), "isValidSecConf", null, 1,
				1, SecureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSecureConfiguration__CreateSecureConfig(), null, "createSecureConfig", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getSecureConfiguration__AffectValidDefenses(), null, "affectValidDefenses", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getSecureConfiguration__ApproveSecureConfig(), null, "approveSecureConfig", 1, 1, IS_UNIQUE,
				IS_ORDERED);

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
		addAnnotation(getCOMPOSITION_Sra(), source, new String[] { "association", "sra" });
		addAnnotation(getCOMPOSITION_Cm(), source, new String[] { "association", "cm" });
		addAnnotation(getCOMPOSITION_SecureConfigs(), source, new String[] { "association", "secureConfigs" });
		addAnnotation(getSecureConfiguration_ValidConfig(), source, new String[] { "association", "validConfig" });
		addAnnotation(getSecureConfiguration_ValidDefenses(), source, new String[] { "association", "validDefenses" });
	}

} //Inter_DSL_Collaboration_CM_SRAPackageImpl
