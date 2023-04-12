/**
 */
package sRA_DSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AND</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.AND#getEntryAnd <em>Entry And</em>}</li>
 * </ul>
 *
 * @see sRA_DSL.SRA_DSLPackage#getAND()
 * @model
 * @generated
 */
public interface AND extends Entry {
	/**
	 * Returns the value of the '<em><b>Entry And</b></em>' containment reference list.
	 * The list contents are of type {@link sRA_DSL.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry And</em>' containment reference list.
	 * @see sRA_DSL.SRA_DSLPackage#getAND_EntryAnd()
	 * @model containment="true"
	 *        annotation="meeduse association='entryAnd'"
	 * @generated
	 */
	EList<Entry> getEntryAnd();

} // AND
