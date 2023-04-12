/**
 */
package cM_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cM_DSL.Infrastructure#getNameInf <em>Name Inf</em>}</li>
 *   <li>{@link cM_DSL.Infrastructure#getCommunications <em>Communications</em>}</li>
 * </ul>
 *
 * @see cM_DSL.CM_DSLPackage#getInfrastructure()
 * @model
 * @generated
 */
public interface Infrastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Inf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Inf</em>' attribute.
	 * @see #setNameInf(String)
	 * @see cM_DSL.CM_DSLPackage#getInfrastructure_NameInf()
	 * @model required="true"
	 * @generated
	 */
	String getNameInf();

	/**
	 * Sets the value of the '{@link cM_DSL.Infrastructure#getNameInf <em>Name Inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Inf</em>' attribute.
	 * @see #getNameInf()
	 * @generated
	 */
	void setNameInf(String value);

	/**
	 * Returns the value of the '<em><b>Communications</b></em>' reference list.
	 * The list contents are of type {@link cM_DSL.Communication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communications</em>' reference list.
	 * @see cM_DSL.CM_DSLPackage#getInfrastructure_Communications()
	 * @model annotation="meeduse association='communications'"
	 * @generated
	 */
	EList<Communication> getCommunications();

} // Infrastructure
