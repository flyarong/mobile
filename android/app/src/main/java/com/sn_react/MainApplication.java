package com.sn_react;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.WindowManager;

import com.chirag.RNMail.RNMail;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.oblador.keychain.KeychainPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.controllers.ActivityCallbacks;
import com.tectiv3.aes.RCTAesPackage;

import java.util.Arrays;
import java.util.List;

//import com.facebook.react.ReactApplication;

public class MainApplication extends NavigationApplication {

  @Override
  public boolean isDebug() {
    // Make sure you are using BuildConfig from your own application
    return BuildConfig.DEBUG;
  }


    protected List<ReactPackage> getPackages() {
      return Arrays.asList(
//            new MainReactPackage(),
            new KeychainPackage(),
            new VectorIconsPackage(),
            new RCTAesPackage(),
            new RNMail()
      );
    }

  @Override
  @Nullable
  public List<ReactPackage> createAdditionalReactPackages() {
    return getPackages();
  }

  @Override
  public void onCreate() {
    super.onCreate();

    registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
      @Override
      public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
      }

      @Override
      public void onActivityStarted(Activity activity) {

      }

      @Override
      public void onActivityResumed(Activity activity) {

      }

      @Override
      public void onActivityPaused(Activity activity) {

      }

      @Override
      public void onActivityStopped(Activity activity) {

      }

      public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

      }

      @Override
      public void onActivityDestroyed(Activity activity) {

      }
    });

    SoLoader.init(this, /* native exopackage */ false);
  }
}
