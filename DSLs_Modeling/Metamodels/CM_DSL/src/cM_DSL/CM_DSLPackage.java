/**
 */
package cM_DSL;

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
 * @see cM_DSL.CM_DSLFactory
 * @model kind="package"
 * @generated
 */
public interface CM_DSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cM_DSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cM_DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cM_DSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CM_DSLPackage eINSTANCE = cM_DSL.impl.CM_DSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link cM_DSL.impl.CMImpl <em>CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cM_DSL.impl.CMImpl
	 * @see cM_DSL.impl.CM_DSLPackageImpl#getCM()
	 * @generated
	 */
	int CM = 0;

	/**
	 * The feature id for the '<em><b>Infrastructures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__INFRASTRUCTURES = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__CONFIGURATIONS = 1;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__APPLICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Selected Conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__SELECTED_CONF = 3;

	/**
	 * The feature id for the '<em><b>Name CMM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__NAME_CMM = 4;

	/**
	 * The number of structural features of the '<em>CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Select Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM___SELECT_CONFIG = 0;

	/**
	 * The number of operations of the '<em>CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link cM_DSL.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cM_DSL.impl.ConfigurationImpl
	 * @see cM_DSL.impl.CM_DSLPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Name Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME_CONF = 0;

	/**
	 * The feature id for the '<em><b>Qo S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__QO_S = 1;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__IS_VALID = 2;

	/**
	 * The feature id for the '<em><b>Infr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INFR = 3;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__APP = 4;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Validate Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___VALIDATE_CONFIG = 0;

	/**
	 * The operation id for the '<em>Set Qo S</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___SET_QO_S = 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link cM_DSL.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cM_DSL.impl.InfrastructureImpl
	 * @see cM_DSL.impl.CM_DSLPackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Name Inf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__NAME_INF = 0;

	/**
	 * The feature id for the '<em><b>Communications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__COMMUNICATIONS = 1;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cM_DSL.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cM_DSL.impl.ApplicationImpl
	 * @see cM_DSL.impl.CM_DSLPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Name App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME_APP = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Opt algo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__OPT_ALGO = 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cM_DSL.impl.OptimisationAlgoImpl <em>Optimisation Algo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cM_DSL.impl.OptimisationAlgoImpl
	 * @see cM_DSL.impl.CM_DSLPackageImpl#getOptimisationAlgo()
	 * @generated
	 */
	int OPTIMISATION_ALGO = 4;

	/**
	 * The number of structural features of the '<em>Optimisation Algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ALGO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Optimisation Algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_ALGO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cM_DSL.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cM_DSL.impl.ActionImpl
	 * @see cM_DSL.impl.CM_DSLPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cM_DSL.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cM_DSL.impl.CommunicationImpl
	 * @see cM_DSL.impl.CM_DSLPackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 6;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link cM_DSL.CM <em>CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM</em>'.
	 * @see cM_DSL.CM
	 * @generated
	 */
	EClass getCM();

	/**
	 * Returns the meta object for the containment reference list '{@link cM_DSL.CM#getInfrastructures <em>Infrastructures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructures</em>'.
	 * @see cM_DSL.CM#getInfrastructures()
	 * @see #getCM()
	 * @generated
	 */
	EReference getCM_Infrastructures();

	/**
	 * Returns the meta object for the containment reference list '{@link cM_DSL.CM#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see cM_DSL.CM#getConfigurations()
	 * @see #getCM()
	 * @generated
	 */
	EReference getCM_Configurations();

	/**
	 * Returns the meta object for the containment reference list '{@link cM_DSL.CM#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see cM_DSL.CM#getApplications()
	 * @see #getCM()
	 * @generated
	 */
	EReference getCM_Applications();

	/**
	 * Returns the meta object for the reference '{@link cM_DSL.CM#getSelectedConf <em>Selected Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Conf</em>'.
	 * @see cM_DSL.CM#getSelectedConf()
	 * @see #getCM()
	 * @generated
	 */
	EReference getCM_SelectedConf();

	/**
	 * Returns the meta object for the attribute '{@link cM_DSL.CM#getNameCMM <em>Name CMM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name CMM</em>'.
	 * @see cM_DSL.CM#getNameCMM()
	 * @see #getCM()
	 * @generated
	 */
	EAttribute getCM_NameCMM();

	/**
	 * Returns the meta object for the '{@link cM_DSL.CM#selectConfig() <em>Select Config</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select Config</em>' operation.
	 * @see cM_DSL.CM#selectConfig()
	 * @generated
	 */
	EOperation getCM__SelectConfig();

	/**
	 * Returns the meta object for class '{@link cM_DSL.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see cM_DSL.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link cM_DSL.Configuration#getNameConf <em>Name Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Conf</em>'.
	 * @see cM_DSL.Configuration#getNameConf()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_NameConf();

	/**
	 * Returns the meta object for the attribute '{@link cM_DSL.Configuration#getQoS <em>Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qo S</em>'.
	 * @see cM_DSL.Configuration#getQoS()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_QoS();

	/**
	 * Returns the meta object for the attribute '{@link cM_DSL.Configuration#isIsValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see cM_DSL.Configuration#isIsValid()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_IsValid();

	/**
	 * Returns the meta object for the reference '{@link cM_DSL.Configuration#getInfr <em>Infr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Infr</em>'.
	 * @see cM_DSL.Configuration#getInfr()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Infr();

	/**
	 * Returns the meta object for the reference '{@link cM_DSL.Configuration#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App</em>'.
	 * @see cM_DSL.Configuration#getApp()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_App();

	/**
	 * Returns the meta object for the '{@link cM_DSL.Configuration#validateConfig() <em>Validate Config</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Config</em>' operation.
	 * @see cM_DSL.Configuration#validateConfig()
	 * @generated
	 */
	EOperation getConfiguration__ValidateConfig();

	/**
	 * Returns the meta object for the '{@link cM_DSL.Configuration#setQoS() <em>Set Qo S</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Qo S</em>' operation.
	 * @see cM_DSL.Configuration#setQoS()
	 * @generated
	 */
	EOperation getConfiguration__SetQoS();

	/**
	 * Returns the meta object for class '{@link cM_DSL.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see cM_DSL.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for the attribute '{@link cM_DSL.Infrastructure#getNameInf <em>Name Inf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Inf</em>'.
	 * @see cM_DSL.Infrastructure#getNameInf()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EAttribute getInfrastructure_NameInf();

	/**
	 * Returns the meta object for the reference list '{@link cM_DSL.Infrastructure#getCommunications <em>Communications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communications</em>'.
	 * @see cM_DSL.Infrastructure#getCommunications()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Communications();

	/**
	 * Returns the meta object for class '{@link cM_DSL.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see cM_DSL.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link cM_DSL.Application#getNameApp <em>Name App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name App</em>'.
	 * @see cM_DSL.Application#getNameApp()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_NameApp();

	/**
	 * Returns the meta object for the reference list '{@link cM_DSL.Application#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see cM_DSL.Application#getActions()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Actions();

	/**
	 * Returns the meta object for the reference '{@link cM_DSL.Application#getOpt_algo <em>Opt algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opt algo</em>'.
	 * @see cM_DSL.Application#getOpt_algo()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Opt_algo();

	/**
	 * Returns the meta object for class '{@link cM_DSL.OptimisationAlgo <em>Optimisation Algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimisation Algo</em>'.
	 * @see cM_DSL.OptimisationAlgo
	 * @generated
	 */
	EClass getOptimisationAlgo();

	/**
	 * Returns the meta object for class '{@link cM_DSL.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see cM_DSL.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link cM_DSL.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see cM_DSL.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CM_DSLFactory getCM_DSLFactory();

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
		 * The meta object literal for the '{@link cM_DSL.impl.CMImpl <em>CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cM_DSL.impl.CMImpl
		 * @see cM_DSL.impl.CM_DSLPackageImpl#getCM()
		 * @generated
		 */
		EClass CM = eINSTANCE.getCM();

		/**
		 * The meta object literal for the '<em><b>Infrastructures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM__INFRASTRUCTURES = eINSTANCE.getCM_Infrastructures();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM__CONFIGURATIONS = eINSTANCE.getCM_Configurations();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM__APPLICATIONS = eINSTANCE.getCM_Applications();

		/**
		 * The meta object literal for the '<em><b>Selected Conf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CM__SELECTED_CONF = eINSTANCE.getCM_SelectedConf();

		/**
		 * The meta object literal for the '<em><b>Name CMM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM__NAME_CMM = eINSTANCE.getCM_NameCMM();

		/**
		 * The meta object literal for the '<em><b>Select Config</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CM___SELECT_CONFIG = eINSTANCE.getCM__SelectConfig();

		/**
		 * The meta object literal for the '{@link cM_DSL.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cM_DSL.impl.ConfigurationImpl
		 * @see cM_DSL.impl.CM_DSLPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name Conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME_CONF = eINSTANCE.getConfiguration_NameConf();

		/**
		 * The meta object literal for the '<em><b>Qo S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__QO_S = eINSTANCE.getConfiguration_QoS();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__IS_VALID = eINSTANCE.getConfiguration_IsValid();

		/**
		 * The meta object literal for the '<em><b>Infr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INFR = eINSTANCE.getConfiguration_Infr();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__APP = eINSTANCE.getConfiguration_App();

		/**
		 * The meta object literal for the '<em><b>Validate Config</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___VALIDATE_CONFIG = eINSTANCE.getConfiguration__ValidateConfig();

		/**
		 * The meta object literal for the '<em><b>Set Qo S</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___SET_QO_S = eINSTANCE.getConfiguration__SetQoS();

		/**
		 * The meta object literal for the '{@link cM_DSL.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cM_DSL.impl.InfrastructureImpl
		 * @see cM_DSL.impl.CM_DSLPackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Name Inf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRASTRUCTURE__NAME_INF = eINSTANCE.getInfrastructure_NameInf();

		/**
		 * The meta object literal for the '<em><b>Communications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__COMMUNICATIONS = eINSTANCE.getInfrastructure_Communications();

		/**
		 * The meta object literal for the '{@link cM_DSL.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cM_DSL.impl.ApplicationImpl
		 * @see cM_DSL.impl.CM_DSLPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name App</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME_APP = eINSTANCE.getApplication_NameApp();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ACTIONS = eINSTANCE.getApplication_Actions();

		/**
		 * The meta object literal for the '<em><b>Opt algo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__OPT_ALGO = eINSTANCE.getApplication_Opt_algo();

		/**
		 * The meta object literal for the '{@link cM_DSL.impl.OptimisationAlgoImpl <em>Optimisation Algo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cM_DSL.impl.OptimisationAlgoImpl
		 * @see cM_DSL.impl.CM_DSLPackageImpl#getOptimisationAlgo()
		 * @generated
		 */
		EClass OPTIMISATION_ALGO = eINSTANCE.getOptimisationAlgo();

		/**
		 * The meta object literal for the '{@link cM_DSL.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cM_DSL.impl.ActionImpl
		 * @see cM_DSL.impl.CM_DSLPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link cM_DSL.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cM_DSL.impl.CommunicationImpl
		 * @see cM_DSL.impl.CM_DSLPackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

	}

} //CM_DSLPackage
