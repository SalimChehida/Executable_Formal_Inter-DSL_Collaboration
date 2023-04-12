/**
 */
package inter_DSL_Collaboration_CM_SRA.provider;

import inter_DSL_Collaboration_CM_SRA.Inter_DSL_Collaboration_CM_SRAPackage;
import inter_DSL_Collaboration_CM_SRA.SecureConfiguration;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link inter_DSL_Collaboration_CM_SRA.SecureConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecureConfigurationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecureConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addValidConfigPropertyDescriptor(object);
			addValidDefensesPropertyDescriptor(object);
			addNameSecConfPropertyDescriptor(object);
			addIsValidSecConfPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Valid Config feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidConfigPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecureConfiguration_validConfig_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecureConfiguration_validConfig_feature",
								"_UI_SecureConfiguration_type"),
						Inter_DSL_Collaboration_CM_SRAPackage.Literals.SECURE_CONFIGURATION__VALID_CONFIG, true, false,
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Valid Defenses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidDefensesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecureConfiguration_validDefenses_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecureConfiguration_validDefenses_feature",
								"_UI_SecureConfiguration_type"),
						Inter_DSL_Collaboration_CM_SRAPackage.Literals.SECURE_CONFIGURATION__VALID_DEFENSES, true,
						false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Name Sec Conf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameSecConfPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecureConfiguration_nameSecConf_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecureConfiguration_nameSecConf_feature",
								"_UI_SecureConfiguration_type"),
						Inter_DSL_Collaboration_CM_SRAPackage.Literals.SECURE_CONFIGURATION__NAME_SEC_CONF, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Valid Sec Conf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsValidSecConfPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecureConfiguration_isValidSecConf_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SecureConfiguration_isValidSecConf_feature", "_UI_SecureConfiguration_type"),
						Inter_DSL_Collaboration_CM_SRAPackage.Literals.SECURE_CONFIGURATION__IS_VALID_SEC_CONF, true,
						false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns SecureConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SecureConfiguration"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SecureConfiguration) object).getNameSecConf();
		return label == null || label.length() == 0 ? getString("_UI_SecureConfiguration_type")
				: getString("_UI_SecureConfiguration_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SecureConfiguration.class)) {
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__NAME_SEC_CONF:
		case Inter_DSL_Collaboration_CM_SRAPackage.SECURE_CONFIGURATION__IS_VALID_SEC_CONF:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Inter_DSL_Collaboration_CM_SRAEditPlugin.INSTANCE;
	}

}
