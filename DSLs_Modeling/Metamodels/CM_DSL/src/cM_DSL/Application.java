/**
 */
package cM_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cM_DSL.Application#getNameApp <em>Name App</em>}</li>
 *   <li>{@link cM_DSL.Application#getActions <em>Actions</em>}</li>
 *   <li>{@link cM_DSL.Application#getOpt_algo <em>Opt algo</em>}</li>
 * </ul>
 *
 * @see cM_DSL.CM_DSLPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Name App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name App</em>' attribute.
	 * @see #setNameApp(String)
	 * @see cM_DSL.CM_DSLPackage#getApplication_NameApp()
	 * @model required="true"
	 * @generated
	 */
	String getNameApp();

	/**
	 * Sets the value of the '{@link cM_DSL.Application#getNameApp <em>Name App</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name App</em>' attribute.
	 * @see #getNameApp()
	 * @generated
	 */
	void setNameApp(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link cM_DSL.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see cM_DSL.CM_DSLPackage#getApplication_Actions()
	 * @model annotation="meeduse association='actions'"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Opt algo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt algo</em>' reference.
	 * @see #setOpt_algo(OptimisationAlgo)
	 * @see cM_DSL.CM_DSLPackage#getApplication_Opt_algo()
	 * @model annotation="meeduse association='opt_algo'"
	 * @generated
	 */
	OptimisationAlgo getOpt_algo();

	/**
	 * Sets the value of the '{@link cM_DSL.Application#getOpt_algo <em>Opt algo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt algo</em>' reference.
	 * @see #getOpt_algo()
	 * @generated
	 */
	void setOpt_algo(OptimisationAlgo value);

} // Application
