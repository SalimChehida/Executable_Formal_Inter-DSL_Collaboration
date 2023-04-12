/**
 */
package cM_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cM_DSL.CM#getInfrastructures <em>Infrastructures</em>}</li>
 *   <li>{@link cM_DSL.CM#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link cM_DSL.CM#getApplications <em>Applications</em>}</li>
 *   <li>{@link cM_DSL.CM#getSelectedConf <em>Selected Conf</em>}</li>
 *   <li>{@link cM_DSL.CM#getNameCMM <em>Name CMM</em>}</li>
 * </ul>
 *
 * @see cM_DSL.CM_DSLPackage#getCM()
 * @model
 * @generated
 */
public interface CM extends EObject {
	/**
	 * Returns the value of the '<em><b>Infrastructures</b></em>' containment reference list.
	 * The list contents are of type {@link cM_DSL.Infrastructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructures</em>' containment reference list.
	 * @see cM_DSL.CM_DSLPackage#getCM_Infrastructures()
	 * @model containment="true"
	 *        annotation="meeduse association='infrastructures'"
	 * @generated
	 */
	EList<Infrastructure> getInfrastructures();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link cM_DSL.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see cM_DSL.CM_DSLPackage#getCM_Configurations()
	 * @model containment="true"
	 *        annotation="meeduse association='configurations'"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link cM_DSL.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see cM_DSL.CM_DSLPackage#getCM_Applications()
	 * @model containment="true"
	 *        annotation="meeduse association='applications'"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Selected Conf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Conf</em>' reference.
	 * @see #setSelectedConf(Configuration)
	 * @see cM_DSL.CM_DSLPackage#getCM_SelectedConf()
	 * @model annotation="meeduse association='selectedConf'"
	 * @generated
	 */
	Configuration getSelectedConf();

	/**
	 * Sets the value of the '{@link cM_DSL.CM#getSelectedConf <em>Selected Conf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Conf</em>' reference.
	 * @see #getSelectedConf()
	 * @generated
	 */
	void setSelectedConf(Configuration value);

	/**
	 * Returns the value of the '<em><b>Name CMM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name CMM</em>' attribute.
	 * @see #setNameCMM(String)
	 * @see cM_DSL.CM_DSLPackage#getCM_NameCMM()
	 * @model required="true"
	 * @generated
	 */
	String getNameCMM();

	/**
	 * Sets the value of the '{@link cM_DSL.CM#getNameCMM <em>Name CMM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name CMM</em>' attribute.
	 * @see #getNameCMM()
	 * @generated
	 */
	void setNameCMM(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void selectConfig();

} // CM
