/**
 */
package cM_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cM_DSL.Configuration#getNameConf <em>Name Conf</em>}</li>
 *   <li>{@link cM_DSL.Configuration#getQoS <em>Qo S</em>}</li>
 *   <li>{@link cM_DSL.Configuration#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link cM_DSL.Configuration#getInfr <em>Infr</em>}</li>
 *   <li>{@link cM_DSL.Configuration#getApp <em>App</em>}</li>
 * </ul>
 *
 * @see cM_DSL.CM_DSLPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Conf</em>' attribute.
	 * @see #setNameConf(String)
	 * @see cM_DSL.CM_DSLPackage#getConfiguration_NameConf()
	 * @model required="true"
	 * @generated
	 */
	String getNameConf();

	/**
	 * Sets the value of the '{@link cM_DSL.Configuration#getNameConf <em>Name Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Conf</em>' attribute.
	 * @see #getNameConf()
	 * @generated
	 */
	void setNameConf(String value);

	/**
	 * Returns the value of the '<em><b>Qo S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qo S</em>' attribute.
	 * @see #setQoS(float)
	 * @see cM_DSL.CM_DSLPackage#getConfiguration_QoS()
	 * @model required="true"
	 * @generated
	 */
	float getQoS();

	/**
	 * Sets the value of the '{@link cM_DSL.Configuration#getQoS <em>Qo S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qo S</em>' attribute.
	 * @see #getQoS()
	 * @generated
	 */
	void setQoS(float value);

	/**
	 * Returns the value of the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Valid</em>' attribute.
	 * @see #setIsValid(boolean)
	 * @see cM_DSL.CM_DSLPackage#getConfiguration_IsValid()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsValid();

	/**
	 * Sets the value of the '{@link cM_DSL.Configuration#isIsValid <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid</em>' attribute.
	 * @see #isIsValid()
	 * @generated
	 */
	void setIsValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Infr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infr</em>' reference.
	 * @see #setInfr(Infrastructure)
	 * @see cM_DSL.CM_DSLPackage#getConfiguration_Infr()
	 * @model required="true"
	 *        annotation="meeduse association='infr'"
	 * @generated
	 */
	Infrastructure getInfr();

	/**
	 * Sets the value of the '{@link cM_DSL.Configuration#getInfr <em>Infr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infr</em>' reference.
	 * @see #getInfr()
	 * @generated
	 */
	void setInfr(Infrastructure value);

	/**
	 * Returns the value of the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' reference.
	 * @see #setApp(Application)
	 * @see cM_DSL.CM_DSLPackage#getConfiguration_App()
	 * @model required="true"
	 *        annotation="meeduse association='app'"
	 * @generated
	 */
	Application getApp();

	/**
	 * Sets the value of the '{@link cM_DSL.Configuration#getApp <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' reference.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(Application value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="meeduse body='result := aConfiguration'"
	 * @generated
	 */
	Configuration validateConfig();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setQoS();

} // Configuration
