/**
 */
package sRA_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.Defense#getNameDef <em>Name Def</em>}</li>
 *   <li>{@link sRA_DSL.Defense#getCostDef <em>Cost Def</em>}</li>
 * </ul>
 *
 * @see sRA_DSL.SRA_DSLPackage#getDefense()
 * @model
 * @generated
 */
public interface Defense extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Def</em>' attribute.
	 * @see #setNameDef(String)
	 * @see sRA_DSL.SRA_DSLPackage#getDefense_NameDef()
	 * @model required="true"
	 * @generated
	 */
	String getNameDef();

	/**
	 * Sets the value of the '{@link sRA_DSL.Defense#getNameDef <em>Name Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Def</em>' attribute.
	 * @see #getNameDef()
	 * @generated
	 */
	void setNameDef(String value);

	/**
	 * Returns the value of the '<em><b>Cost Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Def</em>' attribute.
	 * @see #setCostDef(float)
	 * @see sRA_DSL.SRA_DSLPackage#getDefense_CostDef()
	 * @model required="true"
	 * @generated
	 */
	float getCostDef();

	/**
	 * Sets the value of the '{@link sRA_DSL.Defense#getCostDef <em>Cost Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Def</em>' attribute.
	 * @see #getCostDef()
	 * @generated
	 */
	void setCostDef(float value);

} // Defense
