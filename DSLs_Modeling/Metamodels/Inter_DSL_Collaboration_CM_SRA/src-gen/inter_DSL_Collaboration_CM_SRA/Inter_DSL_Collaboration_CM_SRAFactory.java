/**
 */
package inter_DSL_Collaboration_CM_SRA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage
 * @generated
 */
public interface Inter_DSL_Collaboration_CM_SRAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Inter_DSL_Collaboration_CM_SRAFactory eINSTANCE = inter_DSL_Collaboration_CM_SRA.impl.Inter_DSL_Collaboration_CM_SRAFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>COMPOSITION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COMPOSITION</em>'.
	 * @generated
	 */
	COMPOSITION createCOMPOSITION();

	/**
	 * Returns a new object of class '<em>Secure Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secure Configuration</em>'.
	 * @generated
	 */
	SecureConfiguration createSecureConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Inter_DSL_Collaboration_CM_SRAPackage getInter_DSL_Collaboration_CM_SRAPackage();

} //Inter_DSL_Collaboration_CM_SRAFactory
