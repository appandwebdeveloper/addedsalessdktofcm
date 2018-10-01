package example.com.fcmpushnotificationstutorial;

import android.os.Bundle;
import android.util.Log;

import com.salesforce.androidsdk.push.PushNotificationInterface;

public class MyPushNotifications implements PushNotificationInterface {

    @Override
    public void onPushMessageReceived(Bundle message) {
        String text = message.getString("Message");
        Log.d("messagell",text);
    }
}
