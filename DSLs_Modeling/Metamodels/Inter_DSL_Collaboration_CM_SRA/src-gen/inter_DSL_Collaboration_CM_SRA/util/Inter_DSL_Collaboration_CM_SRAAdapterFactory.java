/**
 */
package inter_DSL_Collaboration_CM_SRA.util;

import inter_DSL_Collaboration_CM_SRA.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage
 * @generated
 */
public class Inter_DSL_Collaboration_CM_SRAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Inter_DSL_Collaboration_CM_SRAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inter_DSL_Collaboration_CM_SRAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Inter_DSL_Collaboration_CM_SRAPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Inter_DSL_Collaboration_CM_SRASwitch<Adapter> modelSwitch = new Inter_DSL_Collaboration_CM_SRASwitch<Adapter>() {
		@Override
		public Adapter caseCOMPOSITION(COMPOSITION object) {
			return createCOMPOSITIONAdapter();
		}

		@Override
		public Adapter caseSecureConfiguration(SecureConfiguration object) {
			return createSecureConfigurationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link inter_DSL_Collaboration_CM_SRA.COMPOSITION <em>COMPOSITION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inter_DSL_Collaboration_CM_SRA.COMPOSITION
	 * @generated
	 */
	public Adapter createCOMPOSITIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration <em>Secure Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inter_DSL_Collaboration_CM_SRA.SecureConfiguration
	 * @generated
	 */
	public Adapter createSecureConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Inter_DSL_Collaboration_CM_SRAAdapterFactory
