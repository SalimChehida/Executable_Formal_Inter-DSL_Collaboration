/**
 */
package inter_DSL_Collaboration_CM_SRA;

import cM_DSL.CM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import sRA_DSL.SRA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COMPOSITION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.COMPOSITION#getSra <em>Sra</em>}</li>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.COMPOSITION#getCm <em>Cm</em>}</li>
 *   <li>{@link inter_DSL_Collaboration_CM_SRA.COMPOSITION#getSecureConfigs <em>Secure Configs</em>}</li>
 * </ul>
 *
 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage#getCOMPOSITION()
 * @model
 * @generated
 */
public interface COMPOSITION extends EObject {
	/**
	 * Returns the value of the '<em><b>Sra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sra</em>' reference.
	 * @see #setSra(SRA)
	 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage#getCOMPOSITION_Sra()
	 * @model required="true"
	 *        annotation="meeduse association='sra'"
	 * @generated
	 */
	SRA getSra();

	/**
	 * Sets the value of the '{@link inter_DSL_Collaboration_CM_SRA.COMPOSITION#getSra <em>Sra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sra</em>' reference.
	 * @see #getSra()
	 * @generated
	 */
	void setSra(SRA value);

	/**
	 * Returns the value of the '<em><b>Cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cm</em>' reference.
	 * @see #setCm(CM)
	 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage#getCOMPOSITION_Cm()
	 * @model required="true"
	 *        annotation="meeduse association='cm'"
	 * @generated
	 */
	CM getCm();

	/**
	 * Sets the value of the '{@link inter_DSL_Collaboration_CM_SRA.COMPOSITION#getCm <em>Cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cm</em>' reference.
	 * @see #getCm()
	 * @generated
	 */
	void setCm(CM value);

	/**
	 * Returns the value of the '<em><b>Secure Configs</b></em>' containment reference list.
	 * The list contents are of type {@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure Configs</em>' containment reference list.
	 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage#getCOMPOSITION_SecureConfigs()
	 * @model containment="true"
	 *        annotation="meeduse association='secureConfigs'"
	 * @generated
	 */
	EList<SecureConfiguration> getSecureConfigs();

} // COMPOSITION
