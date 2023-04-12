/**
 */
package sRA_DSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.OR#getEntryOr <em>Entry Or</em>}</li>
 * </ul>
 *
 * @see sRA_DSL.SRA_DSLPackage#getOR()
 * @model annotation="meeduse alias='Or'"
 * @generated
 */
public interface OR extends Entry {
	/**
	 * Returns the value of the '<em><b>Entry Or</b></em>' containment reference list.
	 * The list contents are of type {@link sRA_DSL.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Or</em>' containment reference list.
	 * @see sRA_DSL.SRA_DSLPackage#getOR_EntryOr()
	 * @model containment="true"
	 *        annotation="meeduse association='entryOr'"
	 * @generated
	 */
	EList<Entry> getEntryOr();

} // OR
