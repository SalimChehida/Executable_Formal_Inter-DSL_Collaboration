/**
 */
package inter_DSL_Collaboration_CM_SRA.impl;

import inter_DSL_Collaboration_CM_SRA.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Inter_DSL_Collaboration_CM_SRAFactoryImpl extends EFactoryImpl
		implements Inter_DSL_Collaboration_CM_SRAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Inter_DSL_Collaboration_CM_SRAFactory init() {
		try {
			Inter_DSL_Collaboration_CM_SRAFactory theInter_DSL_Collaboration_CM_SRAFactory = (Inter_DSL_Collaboration_CM_SRAFactory) EPackage.Registry.INSTANCE
					.getEFactory(Inter_DSL_Collaboration_CM_SRAPackage.eNS_URI);
			if (theInter_DSL_Collaboration_CM_SRAFactory != null) {
				return theInter_DSL_Collaboration_CM_SRAFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Inter_DSL_Collaboration_CM_SRAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inter_DSL_Collaboration_CM_SRAFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Inter_DSL_Collaboration_CM_SRAPackage.COMPOSITION:
			return createCOMPOSITION();
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION:
			return createSecureConfiguration();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COMPOSITION createCOMPOSITION() {
		COMPOSITIONImpl composition = new COMPOSITIONImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecureConfiguration createSecureConfiguration() {
		SecureConfigurationImpl secureConfiguration = new SecureConfigurationImpl();
		return secureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inter_DSL_Collaboration_CM_SRAPackage getInter_DSL_Collaboration_CM_SRAPackage() {
		return (Inter_DSL_Collaboration_CM_SRAPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Inter_DSL_Collaboration_CM_SRAPackage getPackage() {
		return Inter_DSL_Collaboration_CM_SRAPackage.eINSTANCE;
	}

} //Inter_DSL_Collaboration_CM_SRAFactoryImpl
