package example.com.fcmpushnotificationstutorial;

import android.app.Application;

import com.salesforce.androidsdk.app.SalesforceSDKManager;

public class MyApplication extends Application {
    private MyPushNotifications mMyPushNotifications;

    @Override
    public void onCreate() {
        super.onCreate();
        SalesforceSDKManager.initNative(getApplicationContext(),new KeyImpl(), MainActivity.class);

        SalesforceSDKManager.getInstance().setPushNotificationReceiver(mMyPushNotifications);
    }
}
