/**
 */
package sRA_DSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sRA_DSL.Defense;
import sRA_DSL.Entry;
import sRA_DSL.SRA_DSLFactory;
import sRA_DSL.SRA_DSLPackage;
import sRA_DSL.Threat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SRA_DSLPackageImpl extends EPackageImpl implements SRA_DSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

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
	 * @see sRA_DSL.SRA_DSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SRA_DSLPackageImpl() {
		super(eNS_URI, SRA_DSLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SRA_DSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SRA_DSLPackage init() {
		if (isInited)
			return (SRA_DSLPackage) EPackage.Registry.INSTANCE.getEPackage(SRA_DSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSRA_DSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SRA_DSLPackageImpl theSRA_DSLPackage = registeredSRA_DSLPackage instanceof SRA_DSLPackageImpl
				? (SRA_DSLPackageImpl) registeredSRA_DSLPackage
				: new SRA_DSLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSRA_DSLPackage.createPackageContents();

		// Initialize created meta-data
		theSRA_DSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSRA_DSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SRA_DSLPackage.eNS_URI, theSRA_DSLPackage);
		return theSRA_DSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSRA() {
		return sraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSRA_Threats() {
		return (EReference) sraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSRA_Defenses() {
		return (EReference) sraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSRA_CompDefenses() {
		return (EReference) sraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSRA_SubThreats() {
		return (EReference) sraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSRA_Entry() {
		return (EReference) sraEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSRA_NameSRAM() {
		return (EAttribute) sraEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSRA__SelectThreat() {
		return sraEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSRA__ComputeDefenses() {
		return sraEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSRA__InitSRA() {
		return sraEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_Defs() {
		return (EReference) entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_Thrs() {
		return (EReference) entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreat() {
		return threatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreat_NameTh() {
		return (EAttribute) threatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefense() {
		return defenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefense_NameDef() {
		return (EAttribute) defenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefense_CostDef() {
		return (EAttribute) defenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAND() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAND_EntryAnd() {
		return (EReference) andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOR() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOR_EntryOr() {
		return (EReference) orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNOT() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNOT_EntryNot() {
		return (EReference) notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRA_DSLFactory getSRA_DSLFactory() {
		return (SRA_DSLFactory) getEFactoryInstance();
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
		sraEClass = createEClass(SRA);
		createEReference(sraEClass, SRA__THREATS);
		createEReference(sraEClass, SRA__DEFENSES);
		createEReference(sraEClass, SRA__COMP_DEFENSES);
		createEReference(sraEClass, SRA__SUB_THREATS);
		createEReference(sraEClass, SRA__ENTRY);
		createEAttribute(sraEClass, SRA__NAME_SRAM);
		createEOperation(sraEClass, SRA___SELECT_THREAT);
		createEOperation(sraEClass, SRA___COMPUTE_DEFENSES);
		createEOperation(sraEClass, SRA___INIT_SRA);

		entryEClass = createEClass(ENTRY);
		createEReference(entryEClass, ENTRY__DEFS);
		createEReference(entryEClass, ENTRY__THRS);

		threatEClass = createEClass(THREAT);
		createEAttribute(threatEClass, THREAT__NAME_TH);

		defenseEClass = createEClass(DEFENSE);
		createEAttribute(defenseEClass, DEFENSE__NAME_DEF);
		createEAttribute(defenseEClass, DEFENSE__COST_DEF);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__ENTRY_AND);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__ENTRY_OR);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__ENTRY_NOT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		andEClass.getESuperTypes().add(this.getEntry());
		orEClass.getESuperTypes().add(this.getEntry());
		notEClass.getESuperTypes().add(this.getEntry());

		// Initialize classes, features, and operations; add parameters
		initEClass(sraEClass, sRA_DSL.SRA.class, "SRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSRA_Threats(), this.getThreat(), null, "threats", null, 0, -1, sRA_DSL.SRA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSRA_Defenses(), this.getDefense(), null, "defenses", null, 0, -1, sRA_DSL.SRA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSRA_CompDefenses(), this.getDefense(), null, "compDefenses", null, 0, -1, sRA_DSL.SRA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSRA_SubThreats(), this.getThreat(), null, "subThreats", null, 0, -1, sRA_DSL.SRA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSRA_Entry(), this.getEntry(), null, "entry", null, 0, 1, sRA_DSL.SRA.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSRA_NameSRAM(), ecorePackage.getEString(), "nameSRAM", null, 1, 1, sRA_DSL.SRA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSRA__SelectThreat(), null, "selectThreat", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSRA__ComputeDefenses(), null, "computeDefenses", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSRA__InitSRA(), null, "initSRA", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntry_Defs(), this.getDefense(), null, "defs", null, 0, -1, Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEntry_Thrs(), this.getThreat(), null, "thrs", null, 0, -1, Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(threatEClass, Threat.class, "Threat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreat_NameTh(), ecorePackage.getEString(), "nameTh", null, 1, 1, Threat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defenseEClass, Defense.class, "Defense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefense_NameDef(), ecorePackage.getEString(), "nameDef", null, 1, 1, Defense.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefense_CostDef(), ecorePackage.getEFloat(), "costDef", null, 1, 1, Defense.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, sRA_DSL.AND.class, "AND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAND_EntryAnd(), this.getEntry(), null, "entryAnd", null, 0, -1, sRA_DSL.AND.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, sRA_DSL.OR.class, "OR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOR_EntryOr(), this.getEntry(), null, "entryOr", null, 0, -1, sRA_DSL.OR.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(notEClass, sRA_DSL.NOT.class, "NOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNOT_EntryNot(), this.getEntry(), null, "entryNot", null, 0, 1, sRA_DSL.NOT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addAnnotation(this, source, new String[] { "association", "entry" });
		addAnnotation(getSRA_Threats(), source, new String[] { "association", "threats" });
		addAnnotation(getSRA_Defenses(), source, new String[] { "association", "defenses" });
		addAnnotation(getSRA_CompDefenses(), source, new String[] { "association", "compDefenses" });
		addAnnotation(getSRA_SubThreats(), source, new String[] { "association", "subThreats" });
		addAnnotation(getEntry_Defs(), source, new String[] { "association", "defs" });
		addAnnotation(getEntry_Thrs(), source, new String[] { "association", "thrs" });
		addAnnotation(getAND_EntryAnd(), source, new String[] { "association", "entryAnd" });
		addAnnotation(orEClass, source, new String[] { "alias", "Or" });
		addAnnotation(getOR_EntryOr(), source, new String[] { "association", "entryOr" });
		addAnnotation(getNOT_EntryNot(), source, new String[] { "association", "entryNot" });
	}

} //SRA_DSLPackageImpl
