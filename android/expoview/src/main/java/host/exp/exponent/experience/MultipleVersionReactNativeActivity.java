// Copyright 2015-present 650 Industries. All rights reserved.

package host.exp.exponent.experience;

// Implement for each version.
public class MultipleVersionReactNativeActivity extends ReactNativeActivity implements
    // The 4-space indentation is used by android-build-aar.sh.
    // WHEN_DISTRIBUTING_REMOVE_FROM_HERE
    // WHEN_PREPARING_SHELL_REMOVE_FROM_HERE
    // BEGIN_SDK_36
    abi36_0_0.com.facebook.react.modules.core.DefaultHardwareBackBtnHandler,
    abi36_0_0.com.facebook.react.modules.core.PermissionAwareActivity,
    // END_SDK_36
    // BEGIN_SDK_37
    abi37_0_0.com.facebook.react.modules.core.DefaultHardwareBackBtnHandler,
    abi37_0_0.com.facebook.react.modules.core.PermissionAwareActivity,
    // END_SDK_37
    // BEGIN_SDK_38
    abi38_0_0.com.facebook.react.modules.core.DefaultHardwareBackBtnHandler,
    abi38_0_0.com.facebook.react.modules.core.PermissionAwareActivity,
    // END_SDK_38
    // ADD_NEW_SDKS_HERE
    // WHEN_PREPARING_SHELL_REMOVE_TO_HERE
    // WHEN_DISTRIBUTING_REMOVE_TO_HERE
    com.facebook.react.modules.core.DefaultHardwareBackBtnHandler {

    // WHEN_DISTRIBUTING_REMOVE_FROM_HERE
    // WHEN_PREPARING_SHELL_REMOVE_FROM_HERE
    // BEGIN_SDK_36
    @Override
    public void requestPermissions(String[] strings, int i, abi36_0_0.com.facebook.react.modules.core.PermissionListener permissionListener) {
      super.requestPermissions(strings, i, permissionListener::onRequestPermissionsResult);
    }
    // END_SDK_36
    // BEGIN_SDK_37
    @Override
    public void requestPermissions(String[] strings, int i, abi37_0_0.com.facebook.react.modules.core.PermissionListener permissionListener) {
      super.requestPermissions(strings, i, permissionListener::onRequestPermissionsResult);
    }
    // END_SDK_37
    // BEGIN_SDK_38
    @Override
    public void requestPermissions(String[] strings, int i, abi38_0_0.com.facebook.react.modules.core.PermissionListener permissionListener) {
      super.requestPermissions(strings, i, permissionListener::onRequestPermissionsResult);
    }
    // END_SDK_38
    // ADD_NEW_PERMISSION_AWARE_ACTIVITY_IMPLEMENTATION_HERE
    // WHEN_PREPARING_SHELL_REMOVE_TO_HERE
    // WHEN_DISTRIBUTING_REMOVE_TO_HERE
}
