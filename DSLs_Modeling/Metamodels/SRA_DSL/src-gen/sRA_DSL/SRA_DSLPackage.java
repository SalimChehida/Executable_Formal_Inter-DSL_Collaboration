/**
 */
package sRA_DSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sRA_DSL.SRA_DSLFactory
 * @model kind="package"
 *        annotation="meeduse association='entry'"
 * @generated
 */
public interface SRA_DSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sRA_DSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sRA_DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sRA_DSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SRA_DSLPackage eINSTANCE = sRA_DSL.impl.SRA_DSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link sRA_DSL.impl.SRAImpl <em>SRA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sRA_DSL.impl.SRAImpl
	 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getSRA()
	 * @generated
	 */
	int SRA = 0;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA__THREATS = 0;

	/**
	 * The feature id for the '<em><b>Defenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA__DEFENSES = 1;

	/**
	 * The feature id for the '<em><b>Comp Defenses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA__COMP_DEFENSES = 2;

	/**
	 * The feature id for the '<em><b>Sub Threats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA__SUB_THREATS = 3;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA__ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Name SRAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA__NAME_SRAM = 5;

	/**
	 * The number of structural features of the '<em>SRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Select Threat</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA___SELECT_THREAT = 0;

	/**
	 * The operation id for the '<em>Compute Defenses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA___COMPUTE_DEFENSES = 1;

	/**
	 * The operation id for the '<em>Init SRA</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA___INIT_SRA = 2;

	/**
	 * The number of operations of the '<em>SRA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRA_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link sRA_DSL.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sRA_DSL.impl.EntryImpl
	 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__DEFS = 0;

	/**
	 * The feature id for the '<em><b>Thrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__THRS = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sRA_DSL.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sRA_DSL.impl.ThreatImpl
	 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 2;

	/**
	 * The feature id for the '<em><b>Name Th</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__NAME_TH = 0;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sRA_DSL.impl.DefenseImpl <em>Defense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sRA_DSL.impl.DefenseImpl
	 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getDefense()
	 * @generated
	 */
	int DEFENSE = 3;

	/**
	 * The feature id for the '<em><b>Name Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENSE__NAME_DEF = 0;

	/**
	 * The feature id for the '<em><b>Cost Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENSE__COST_DEF = 1;

	/**
	 * The number of structural features of the '<em>Defense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Defense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sRA_DSL.impl.ANDImpl <em>AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sRA_DSL.impl.ANDImpl
	 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getAND()
	 * @generated
	 */
	int AND = 4;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__DEFS = ENTRY__DEFS;

	/**
	 * The feature id for the '<em><b>Thrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__THRS = ENTRY__THRS;

	/**
	 * The feature id for the '<em><b>Entry And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ENTRY_AND = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sRA_DSL.impl.ORImpl <em>OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sRA_DSL.impl.ORImpl
	 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getOR()
	 * @generated
	 */
	int OR = 5;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__DEFS = ENTRY__DEFS;

	/**
	 * The feature id for the '<em><b>Thrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__THRS = ENTRY__THRS;

	/**
	 * The feature id for the '<em><b>Entry Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ENTRY_OR = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sRA_DSL.impl.NOTImpl <em>NOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sRA_DSL.impl.NOTImpl
	 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getNOT()
	 * @generated
	 */
	int NOT = 6;

	/**
	 * The feature id for the '<em><b>Defs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__DEFS = ENTRY__DEFS;

	/**
	 * The feature id for the '<em><b>Thrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__THRS = ENTRY__THRS;

	/**
	 * The feature id for the '<em><b>Entry Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ENTRY_NOT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link sRA_DSL.SRA <em>SRA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRA</em>'.
	 * @see sRA_DSL.SRA
	 * @generated
	 */
	EClass getSRA();

	/**
	 * Returns the meta object for the containment reference list '{@link sRA_DSL.SRA#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threats</em>'.
	 * @see sRA_DSL.SRA#getThreats()
	 * @see #getSRA()
	 * @generated
	 */
	EReference getSRA_Threats();

	/**
	 * Returns the meta object for the containment reference list '{@link sRA_DSL.SRA#getDefenses <em>Defenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defenses</em>'.
	 * @see sRA_DSL.SRA#getDefenses()
	 * @see #getSRA()
	 * @generated
	 */
	EReference getSRA_Defenses();

	/**
	 * Returns the meta object for the reference list '{@link sRA_DSL.SRA#getCompDefenses <em>Comp Defenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comp Defenses</em>'.
	 * @see sRA_DSL.SRA#getCompDefenses()
	 * @see #getSRA()
	 * @generated
	 */
	EReference getSRA_CompDefenses();

	/**
	 * Returns the meta object for the reference list '{@link sRA_DSL.SRA#getSubThreats <em>Sub Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Threats</em>'.
	 * @see sRA_DSL.SRA#getSubThreats()
	 * @see #getSRA()
	 * @generated
	 */
	EReference getSRA_SubThreats();

	/**
	 * Returns the meta object for the containment reference '{@link sRA_DSL.SRA#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see sRA_DSL.SRA#getEntry()
	 * @see #getSRA()
	 * @generated
	 */
	EReference getSRA_Entry();

	/**
	 * Returns the meta object for the attribute '{@link sRA_DSL.SRA#getNameSRAM <em>Name SRAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name SRAM</em>'.
	 * @see sRA_DSL.SRA#getNameSRAM()
	 * @see #getSRA()
	 * @generated
	 */
	EAttribute getSRA_NameSRAM();

	/**
	 * Returns the meta object for the '{@link sRA_DSL.SRA#selectThreat() <em>Select Threat</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select Threat</em>' operation.
	 * @see sRA_DSL.SRA#selectThreat()
	 * @generated
	 */
	EOperation getSRA__SelectThreat();

	/**
	 * Returns the meta object for the '{@link sRA_DSL.SRA#computeDefenses() <em>Compute Defenses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Defenses</em>' operation.
	 * @see sRA_DSL.SRA#computeDefenses()
	 * @generated
	 */
	EOperation getSRA__ComputeDefenses();

	/**
	 * Returns the meta object for the '{@link sRA_DSL.SRA#initSRA() <em>Init SRA</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init SRA</em>' operation.
	 * @see sRA_DSL.SRA#initSRA()
	 * @generated
	 */
	EOperation getSRA__InitSRA();

	/**
	 * Returns the meta object for class '{@link sRA_DSL.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see sRA_DSL.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the reference list '{@link sRA_DSL.Entry#getDefs <em>Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defs</em>'.
	 * @see sRA_DSL.Entry#getDefs()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Defs();

	/**
	 * Returns the meta object for the reference list '{@link sRA_DSL.Entry#getThrs <em>Thrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thrs</em>'.
	 * @see sRA_DSL.Entry#getThrs()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Thrs();

	/**
	 * Returns the meta object for class '{@link sRA_DSL.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see sRA_DSL.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for the attribute '{@link sRA_DSL.Threat#getNameTh <em>Name Th</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Th</em>'.
	 * @see sRA_DSL.Threat#getNameTh()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_NameTh();

	/**
	 * Returns the meta object for class '{@link sRA_DSL.Defense <em>Defense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defense</em>'.
	 * @see sRA_DSL.Defense
	 * @generated
	 */
	EClass getDefense();

	/**
	 * Returns the meta object for the attribute '{@link sRA_DSL.Defense#getNameDef <em>Name Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Def</em>'.
	 * @see sRA_DSL.Defense#getNameDef()
	 * @see #getDefense()
	 * @generated
	 */
	EAttribute getDefense_NameDef();

	/**
	 * Returns the meta object for the attribute '{@link sRA_DSL.Defense#getCostDef <em>Cost Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Def</em>'.
	 * @see sRA_DSL.Defense#getCostDef()
	 * @see #getDefense()
	 * @generated
	 */
	EAttribute getDefense_CostDef();

	/**
	 * Returns the meta object for class '{@link sRA_DSL.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND</em>'.
	 * @see sRA_DSL.AND
	 * @generated
	 */
	EClass getAND();

	/**
	 * Returns the meta object for the containment reference list '{@link sRA_DSL.AND#getEntryAnd <em>Entry And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry And</em>'.
	 * @see sRA_DSL.AND#getEntryAnd()
	 * @see #getAND()
	 * @generated
	 */
	EReference getAND_EntryAnd();

	/**
	 * Returns the meta object for class '{@link sRA_DSL.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR</em>'.
	 * @see sRA_DSL.OR
	 * @generated
	 */
	EClass getOR();

	/**
	 * Returns the meta object for the containment reference list '{@link sRA_DSL.OR#getEntryOr <em>Entry Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Or</em>'.
	 * @see sRA_DSL.OR#getEntryOr()
	 * @see #getOR()
	 * @generated
	 */
	EReference getOR_EntryOr();

	/**
	 * Returns the meta object for class '{@link sRA_DSL.NOT <em>NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOT</em>'.
	 * @see sRA_DSL.NOT
	 * @generated
	 */
	EClass getNOT();

	/**
	 * Returns the meta object for the containment reference '{@link sRA_DSL.NOT#getEntryNot <em>Entry Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Not</em>'.
	 * @see sRA_DSL.NOT#getEntryNot()
	 * @see #getNOT()
	 * @generated
	 */
	EReference getNOT_EntryNot();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SRA_DSLFactory getSRA_DSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sRA_DSL.impl.SRAImpl <em>SRA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sRA_DSL.impl.SRAImpl
		 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getSRA()
		 * @generated
		 */
		EClass SRA = eINSTANCE.getSRA();

		/**
		 * The meta object literal for the '<em><b>Threats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRA__THREATS = eINSTANCE.getSRA_Threats();

		/**
		 * The meta object literal for the '<em><b>Defenses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRA__DEFENSES = eINSTANCE.getSRA_Defenses();

		/**
		 * The meta object literal for the '<em><b>Comp Defenses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRA__COMP_DEFENSES = eINSTANCE.getSRA_CompDefenses();

		/**
		 * The meta object literal for the '<em><b>Sub Threats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRA__SUB_THREATS = eINSTANCE.getSRA_SubThreats();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRA__ENTRY = eINSTANCE.getSRA_Entry();

		/**
		 * The meta object literal for the '<em><b>Name SRAM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRA__NAME_SRAM = eINSTANCE.getSRA_NameSRAM();

		/**
		 * The meta object literal for the '<em><b>Select Threat</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRA___SELECT_THREAT = eINSTANCE.getSRA__SelectThreat();

		/**
		 * The meta object literal for the '<em><b>Compute Defenses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRA___COMPUTE_DEFENSES = eINSTANCE.getSRA__ComputeDefenses();

		/**
		 * The meta object literal for the '<em><b>Init SRA</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SRA___INIT_SRA = eINSTANCE.getSRA__InitSRA();

		/**
		 * The meta object literal for the '{@link sRA_DSL.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sRA_DSL.impl.EntryImpl
		 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Defs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__DEFS = eINSTANCE.getEntry_Defs();

		/**
		 * The meta object literal for the '<em><b>Thrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__THRS = eINSTANCE.getEntry_Thrs();

		/**
		 * The meta object literal for the '{@link sRA_DSL.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sRA_DSL.impl.ThreatImpl
		 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '<em><b>Name Th</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__NAME_TH = eINSTANCE.getThreat_NameTh();

		/**
		 * The meta object literal for the '{@link sRA_DSL.impl.DefenseImpl <em>Defense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sRA_DSL.impl.DefenseImpl
		 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getDefense()
		 * @generated
		 */
		EClass DEFENSE = eINSTANCE.getDefense();

		/**
		 * The meta object literal for the '<em><b>Name Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFENSE__NAME_DEF = eINSTANCE.getDefense_NameDef();

		/**
		 * The meta object literal for the '<em><b>Cost Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFENSE__COST_DEF = eINSTANCE.getDefense_CostDef();

		/**
		 * The meta object literal for the '{@link sRA_DSL.impl.ANDImpl <em>AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sRA_DSL.impl.ANDImpl
		 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getAND()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAND();

		/**
		 * The meta object literal for the '<em><b>Entry And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__ENTRY_AND = eINSTANCE.getAND_EntryAnd();

		/**
		 * The meta object literal for the '{@link sRA_DSL.impl.ORImpl <em>OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sRA_DSL.impl.ORImpl
		 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getOR()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOR();

		/**
		 * The meta object literal for the '<em><b>Entry Or</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__ENTRY_OR = eINSTANCE.getOR_EntryOr();

		/**
		 * The meta object literal for the '{@link sRA_DSL.impl.NOTImpl <em>NOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sRA_DSL.impl.NOTImpl
		 * @see sRA_DSL.impl.SRA_DSLPackageImpl#getNOT()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNOT();

		/**
		 * The meta object literal for the '<em><b>Entry Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__ENTRY_NOT = eINSTANCE.getNOT_EntryNot();

	}

} //SRA_DSLPackage
