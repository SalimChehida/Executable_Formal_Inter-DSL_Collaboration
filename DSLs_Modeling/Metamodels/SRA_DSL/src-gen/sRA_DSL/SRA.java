/**
 */
package sRA_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SRA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.SRA#getThreats <em>Threats</em>}</li>
 *   <li>{@link sRA_DSL.SRA#getDefenses <em>Defenses</em>}</li>
 *   <li>{@link sRA_DSL.SRA#getCompDefenses <em>Comp Defenses</em>}</li>
 *   <li>{@link sRA_DSL.SRA#getSubThreats <em>Sub Threats</em>}</li>
 *   <li>{@link sRA_DSL.SRA#getEntry <em>Entry</em>}</li>
 *   <li>{@link sRA_DSL.SRA#getNameSRAM <em>Name SRAM</em>}</li>
 * </ul>
 *
 * @see sRA_DSL.SRA_DSLPackage#getSRA()
 * @model
 * @generated
 */
public interface SRA extends EObject {
	/**
	 * Returns the value of the '<em><b>Threats</b></em>' containment reference list.
	 * The list contents are of type {@link sRA_DSL.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' containment reference list.
	 * @see sRA_DSL.SRA_DSLPackage#getSRA_Threats()
	 * @model containment="true"
	 *        annotation="meeduse association='threats'"
	 * @generated
	 */
	EList<Threat> getThreats();

	/**
	 * Returns the value of the '<em><b>Defenses</b></em>' containment reference list.
	 * The list contents are of type {@link sRA_DSL.Defense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defenses</em>' containment reference list.
	 * @see sRA_DSL.SRA_DSLPackage#getSRA_Defenses()
	 * @model containment="true"
	 *        annotation="meeduse association='defenses'"
	 * @generated
	 */
	EList<Defense> getDefenses();

	/**
	 * Returns the value of the '<em><b>Comp Defenses</b></em>' reference list.
	 * The list contents are of type {@link sRA_DSL.Defense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Defenses</em>' reference list.
	 * @see sRA_DSL.SRA_DSLPackage#getSRA_CompDefenses()
	 * @model annotation="meeduse association='compDefenses'"
	 * @generated
	 */
	EList<Defense> getCompDefenses();

	/**
	 * Returns the value of the '<em><b>Sub Threats</b></em>' reference list.
	 * The list contents are of type {@link sRA_DSL.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Threats</em>' reference list.
	 * @see sRA_DSL.SRA_DSLPackage#getSRA_SubThreats()
	 * @model annotation="meeduse association='subThreats'"
	 * @generated
	 */
	EList<Threat> getSubThreats();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Entry)
	 * @see sRA_DSL.SRA_DSLPackage#getSRA_Entry()
	 * @model containment="true"
	 * @generated
	 */
	Entry getEntry();

	/**
	 * Sets the value of the '{@link sRA_DSL.SRA#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Entry value);

	/**
	 * Returns the value of the '<em><b>Name SRAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name SRAM</em>' attribute.
	 * @see #setNameSRAM(String)
	 * @see sRA_DSL.SRA_DSLPackage#getSRA_NameSRAM()
	 * @model required="true"
	 * @generated
	 */
	String getNameSRAM();

	/**
	 * Sets the value of the '{@link sRA_DSL.SRA#getNameSRAM <em>Name SRAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name SRAM</em>' attribute.
	 * @see #getNameSRAM()
	 * @generated
	 */
	void setNameSRAM(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void selectThreat();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void computeDefenses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initSRA();

} // SRA
