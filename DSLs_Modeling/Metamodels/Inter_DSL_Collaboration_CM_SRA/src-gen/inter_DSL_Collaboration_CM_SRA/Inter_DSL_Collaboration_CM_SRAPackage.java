/**
 */
package inter_DSL_Collaboration_CM_SRA;

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
 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAFactory
 * @model kind="package"
 * @generated
 */
public interface Inter_DSL_Collaboration_CM_SRAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inter_DSL_Collaboration_CM_SRA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/inter_DSL_Collaboration_CM_SRA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inter_DSL_Collaboration_CM_SRA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Inter_DSL_Collaboration_CM_SRAPackage eINSTANCE = inter_DSL_Collaboration_CM_SRA.impl.Inter_DSL_Collaboration_CM_SRAPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link inter_DSL_Collaboration_CM_SRA.impl.COMPOSITIONImpl <em>COMPOSITION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inter_DSL_Collaboration_CM_SRA.impl.COMPOSITIONImpl
	 * @see inter_DSL_Collaboration_CM_SRA.impl.Inter_DSL_Collaboration_CM_SRAPackageImpl#getCOMPOSITION()
	 * @generated
	 */
	int COMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Sra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SRA = 0;

	/**
	 * The feature id for the '<em><b>Cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__CM = 1;

	/**
	 * The feature id for the '<em><b>Secure Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SECURE_CONFIGS = 2;

	/**
	 * The number of structural features of the '<em>COMPOSITION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>COMPOSITION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link inter_DSL_Collaboration_CM_SRA.impl.SecureConfigurationImpl <em>Secure Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inter_DSL_Collaboration_CM_SRA.impl.SecureConfigurationImpl
	 * @see inter_DSL_Collaboration_CM_SRA.impl.Inter_DSL_Collaboration_CM_SRAPackageImpl#getSecureConfiguration()
	 * @generated
	 */
	int SECURE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Valid Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONFIGURATION__VALID_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Valid Defenses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONFIGURATION__VALID_DEFENSES = 1;

	/**
	 * The feature id for the '<em><b>Name Sec Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONFIGURATION__NAME_SEC_CONF = 2;

	/**
	 * The feature id for the '<em><b>Is Valid Sec Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONFIGURATION__IS_VALID_SEC_CONF = 3;

	/**
	 * The number of structural features of the '<em>Secure Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Create Secure Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONFIGURATION___CREATE_SECURE_CONFIG = 0;

	/**
	 * The operation id for the '<em>Affect Valid Defenses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONFIGURATION___AFFECT_VALID_DEFENSES = 1;

	/**
	 * The operation id for the '<em>Approve Secure Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONFIGURATION___APPROVE_SECURE_CONFIG = 2;

	/**
	 * The number of operations of the '<em>Secure Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONFIGURATION_OPERATION_COUNT = 3;

	/**
	 * Returns the meta object for class '{@link inter_DSL_Collaboration_CM_SRA.COMPOSITION <em>COMPOSITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COMPOSITION</em>'.
	 * @see inter_DSL_Collaboration_CM_SRA.COMPOSITION
	 * @generated
	 */
	EClass getCOMPOSITION();

	/**
	 * Returns the meta object for the reference '{@link inter_DSL_Collaboration_CM_SRA.COMPOSITION#getSra <em>Sra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sra</em>'.
	 * @see inter_DSL_Collaboration_CM_SRA.COMPOSITION#getSra()
	 * @see #getCOMPOSITION()
	 * @generated
	 */
	EReference getCOMPOSITION_Sra();

	/**
	 * Returns the meta object for the reference '{@link inter_DSL_Collaboration_CM_SRA.COMPOSITION#getCm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cm</em>'.
	 * @see inter_DSL_Collaboration_CM_SRA.COMPOSITION#getCm()
	 * @see #getCOMPOSITION()
	 * @generated
	 */
	EReference getCOMPOSITION_Cm();

	/**
	 * Returns the meta object for the containment reference list '{@link inter_DSL_Collaboration_CM_SRA.COMPOSITION#getSecureConfigs <em>Secure Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secure Configs</em>'.
	 * @see inter_DSL_Collaboration_CM_SRA.COMPOSITION#getSecureConfigs()
	 * @see #getCOMPOSITION()
	 * @generated
	 */
	EReference getCOMPOSITION_SecureConfigs();

	/**
	 * Returns the meta object for class '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration <em>Secure Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secure Configuration</em>'.
	 * @see inter_DSL_Collaboration_CM_SRA.SecureConfiguration
	 * @generated
	 */
	EClass getSecureConfiguration();

	/**
	 * Returns the meta object for the reference '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getValidConfig <em>Valid Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valid Config</em>'.
	 * @see inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getValidConfig()
	 * @see #getSecureConfiguration()
	 * @generated
	 */
	EReference getSecureConfiguration_ValidConfig();

	/**
	 * Returns the meta object for the reference list '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getValidDefenses <em>Valid Defenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Defenses</em>'.
	 * @see inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getValidDefenses()
	 * @see #getSecureConfiguration()
	 * @generated
	 */
	EReference getSecureConfiguration_ValidDefenses();

	/**
	 * Returns the meta object for the attribute '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getNameSecConf <em>Name Sec Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Sec Conf</em>'.
	 * @see inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getNameSecConf()
	 * @see #getSecureConfiguration()
	 * @generated
	 */
	EAttribute getSecureConfiguration_NameSecConf();

	/**
	 * Returns the meta object for the attribute '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#isIsValidSecConf <em>Is Valid Sec Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid Sec Conf</em>'.
	 * @see inter_DSL_Collaboration_CM_SRA.SecureConfiguration#isIsValidSecConf()
	 * @see #getSecureConfiguration()
	 * @generated
	 */
	EAttribute getSecureConfiguration_IsValidSecConf();

	/**
	 * Returns the meta object for the '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#createSecureConfig() <em>Create Secure Config</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Secure Config</em>' operation.
	 * @see inter_DSL_Collaboration_CM_SRA.SecureConfiguration#createSecureConfig()
	 * @generated
	 */
	EOperation getSecureConfiguration__CreateSecureConfig();

	/**
	 * Returns the meta object for the '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#affectValidDefenses() <em>Affect Valid Defenses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Affect Valid Defenses</em>' operation.
	 * @see inter_DSL_Collaboration_CM_SRA.SecureConfiguration#affectValidDefenses()
	 * @generated
	 */
	EOperation getSecureConfiguration__AffectValidDefenses();

	/**
	 * Returns the meta object for the '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#approveSecureConfig() <em>Approve Secure Config</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Approve Secure Config</em>' operation.
	 * @see inter_DSL_Collaboration_CM_SRA.SecureConfiguration#approveSecureConfig()
	 * @generated
	 */
	EOperation getSecureConfiguration__ApproveSecureConfig();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Inter_DSL_Collaboration_CM_SRAFactory getInter_DSL_Collaboration_CM_SRAFactory();

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
		 * The meta object literal for the '{@link inter_DSL_Collaboration_CM_SRA.impl.COMPOSITIONImpl <em>COMPOSITION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inter_DSL_Collaboration_CM_SRA.impl.COMPOSITIONImpl
		 * @see inter_DSL_Collaboration_CM_SRA.impl.Inter_DSL_Collaboration_CM_SRAPackageImpl#getCOMPOSITION()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getCOMPOSITION();

		/**
		 * The meta object literal for the '<em><b>Sra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__SRA = eINSTANCE.getCOMPOSITION_Sra();

		/**
		 * The meta object literal for the '<em><b>Cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__CM = eINSTANCE.getCOMPOSITION_Cm();

		/**
		 * The meta object literal for the '<em><b>Secure Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__SECURE_CONFIGS = eINSTANCE.getCOMPOSITION_SecureConfigs();

		/**
		 * The meta object literal for the '{@link inter_DSL_Collaboration_CM_SRA.impl.SecureConfigurationImpl <em>Secure Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inter_DSL_Collaboration_CM_SRA.impl.SecureConfigurationImpl
		 * @see inter_DSL_Collaboration_CM_SRA.impl.Inter_DSL_Collaboration_CM_SRAPackageImpl#getSecureConfiguration()
		 * @generated
		 */
		EClass SECURE_CONFIGURATION = eINSTANCE.getSecureConfiguration();

		/**
		 * The meta object literal for the '<em><b>Valid Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURE_CONFIGURATION__VALID_CONFIG = eINSTANCE.getSecureConfiguration_ValidConfig();

		/**
		 * The meta object literal for the '<em><b>Valid Defenses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURE_CONFIGURATION__VALID_DEFENSES = eINSTANCE.getSecureConfiguration_ValidDefenses();

		/**
		 * The meta object literal for the '<em><b>Name Sec Conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURE_CONFIGURATION__NAME_SEC_CONF = eINSTANCE.getSecureConfiguration_NameSecConf();

		/**
		 * The meta object literal for the '<em><b>Is Valid Sec Conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURE_CONFIGURATION__IS_VALID_SEC_CONF = eINSTANCE.getSecureConfiguration_IsValidSecConf();

		/**
		 * The meta object literal for the '<em><b>Create Secure Config</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECURE_CONFIGURATION___CREATE_SECURE_CONFIG = eINSTANCE.getSecureConfiguration__CreateSecureConfig();

		/**
		 * The meta object literal for the '<em><b>Affect Valid Defenses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECURE_CONFIGURATION___AFFECT_VALID_DEFENSES = eINSTANCE
				.getSecureConfiguration__AffectValidDefenses();

		/**
		 * The meta object literal for the '<em><b>Approve Secure Config</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECURE_CONFIGURATION___APPROVE_SECURE_CONFIG = eINSTANCE
				.getSecureConfiguration__ApproveSecureConfig();

	}

} //Inter_DSL_Collaboration_CM_SRAPackage
