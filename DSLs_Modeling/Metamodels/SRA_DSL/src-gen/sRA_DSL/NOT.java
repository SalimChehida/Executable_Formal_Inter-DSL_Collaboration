/**
 */
package sRA_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NOT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.NOT#getEntryNot <em>Entry Not</em>}</li>
 * </ul>
 *
 * @see sRA_DSL.SRA_DSLPackage#getNOT()
 * @model
 * @generated
 */
public interface NOT extends Entry {
	/**
	 * Returns the value of the '<em><b>Entry Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Not</em>' containment reference.
	 * @see #setEntryNot(Entry)
	 * @see sRA_DSL.SRA_DSLPackage#getNOT_EntryNot()
	 * @model containment="true"
	 *        annotation="meeduse association='entryNot'"
	 * @generated
	 */
	Entry getEntryNot();

	/**
	 * Sets the value of the '{@link sRA_DSL.NOT#getEntryNot <em>Entry Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Not</em>' containment reference.
	 * @see #getEntryNot()
	 * @generated
	 */
	void setEntryNot(Entry value);

} // NOT
