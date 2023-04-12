/**
 */
package sRA_DSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sRA_DSL.SRA_DSLPackage
 * @generated
 */
public interface SRA_DSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SRA_DSLFactory eINSTANCE = sRA_DSL.impl.SRA_DSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SRA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SRA</em>'.
	 * @generated
	 */
	SRA createSRA();

	/**
	 * Returns a new object of class '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat</em>'.
	 * @generated
	 */
	Threat createThreat();

	/**
	 * Returns a new object of class '<em>Defense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defense</em>'.
	 * @generated
	 */
	Defense createDefense();

	/**
	 * Returns a new object of class '<em>AND</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND</em>'.
	 * @generated
	 */
	AND createAND();

	/**
	 * Returns a new object of class '<em>OR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR</em>'.
	 * @generated
	 */
	OR createOR();

	/**
	 * Returns a new object of class '<em>NOT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NOT</em>'.
	 * @generated
	 */
	NOT createNOT();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SRA_DSLPackage getSRA_DSLPackage();

} //SRA_DSLFactory
