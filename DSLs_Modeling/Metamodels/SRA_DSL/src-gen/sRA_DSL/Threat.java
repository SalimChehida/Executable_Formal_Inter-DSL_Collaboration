/**
 */
package sRA_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.Threat#getNameTh <em>Name Th</em>}</li>
 * </ul>
 *
 * @see sRA_DSL.SRA_DSLPackage#getThreat()
 * @model
 * @generated
 */
public interface Threat extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Th</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Th</em>' attribute.
	 * @see #setNameTh(String)
	 * @see sRA_DSL.SRA_DSLPackage#getThreat_NameTh()
	 * @model required="true"
	 * @generated
	 */
	String getNameTh();

	/**
	 * Sets the value of the '{@link sRA_DSL.Threat#getNameTh <em>Name Th</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Th</em>' attribute.
	 * @see #getNameTh()
	 * @generated
	 */
	void setNameTh(String value);

} // Threat
