/**
 */
package sRA_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sRA_DSL.Entry#getDefs <em>Defs</em>}</li>
 *   <li>{@link sRA_DSL.Entry#getThrs <em>Thrs</em>}</li>
 * </ul>
 *
 * @see sRA_DSL.SRA_DSLPackage#getEntry()
 * @model abstract="true"
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Defs</b></em>' reference list.
	 * The list contents are of type {@link sRA_DSL.Defense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defs</em>' reference list.
	 * @see sRA_DSL.SRA_DSLPackage#getEntry_Defs()
	 * @model annotation="meeduse association='defs'"
	 * @generated
	 */
	EList<Defense> getDefs();

	/**
	 * Returns the value of the '<em><b>Thrs</b></em>' reference list.
	 * The list contents are of type {@link sRA_DSL.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrs</em>' reference list.
	 * @see sRA_DSL.SRA_DSLPackage#getEntry_Thrs()
	 * @model annotation="meeduse association='thrs'"
	 * @generated
	 */
	EList<Threat> getThrs();

} // Entry
