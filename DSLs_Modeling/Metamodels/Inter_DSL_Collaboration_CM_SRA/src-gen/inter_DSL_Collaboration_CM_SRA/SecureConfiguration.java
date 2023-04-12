/**
 */
package inter_DSL_Collaboration_CM_SRA;

import cM_DSL.Configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import sRA_DSL.Defense;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secure Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getValidConfig <em>Valid Config</em>}</li>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getValidDefenses <em>Valid Defenses</em>}</li>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getNameSecConf <em>Name Sec Conf</em>}</li>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#isIsValidSecConf <em>Is Valid Sec Conf</em>}</li>
 * </ul>
 *
 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage#getSecureConfiguration()
 * @model
 * @generated
 */
public interface SecureConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Valid Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Config</em>' reference.
	 * @see #setValidConfig(Configuration)
	 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage#getSecureConfiguration_ValidConfig()
	 * @model required="true"
	 *        annotation="meeduse association='validConfig'"
	 * @generated
	 */
	Configuration getValidConfig();

	/**
	 * Sets the value of the '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getValidConfig <em>Valid Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Config</em>' reference.
	 * @see #getValidConfig()
	 * @generated
	 */
	void setValidConfig(Configuration value);

	/**
	 * Returns the value of the '<em><b>Valid Defenses</b></em>' reference list.
	 * The list contents are of type {@link sRA_DSL.Defense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Defenses</em>' reference list.
	 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage#getSecureConfiguration_ValidDefenses()
	 * @model annotation="meeduse association='validDefenses'"
	 * @generated
	 */
	EList<Defense> getValidDefenses();

	/**
	 * Returns the value of the '<em><b>Name Sec Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Sec Conf</em>' attribute.
	 * @see #setNameSecConf(String)
	 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage#getSecureConfiguration_NameSecConf()
	 * @model required="true"
	 * @generated
	 */
	String getNameSecConf();

	/**
	 * Sets the value of the '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#getNameSecConf <em>Name Sec Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Sec Conf</em>' attribute.
	 * @see #getNameSecConf()
	 * @generated
	 */
	void setNameSecConf(String value);

	/**
	 * Returns the value of the '<em><b>Is Valid Sec Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Valid Sec Conf</em>' attribute.
	 * @see #setIsValidSecConf(boolean)
	 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage#getSecureConfiguration_IsValidSecConf()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsValidSecConf();

	/**
	 * Sets the value of the '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration#isIsValidSecConf <em>Is Valid Sec Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid Sec Conf</em>' attribute.
	 * @see #isIsValidSecConf()
	 * @generated
	 */
	void setIsValidSecConf(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createSecureConfig();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void affectValidDefenses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void approveSecureConfig();

} // SecureConfiguration
