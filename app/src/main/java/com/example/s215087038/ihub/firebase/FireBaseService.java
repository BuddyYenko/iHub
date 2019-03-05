package com.example.s215087038.ihub.firebase;

import android.app.NotificationManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.HashMap;
import java.util.Map;
public class FireBaseService extends FirebaseMessagingService {

    private static final String NOTI_GROUP_ID = "GROUP";

    private static final int NOTI_ID_GROUP = 1;
    private static final int NOTI_ID_PRIVATE = 2;
    private static final int NOTI_ID_MATCH = 3;
    private static final int NOTI_ID_ACCEPT = 4;

    private static final String TAG = "FireBaseService";

    private NotificationManager notificationManager;

    private Map<String, Integer> notificationList = new HashMap<>();

    public FireBaseService() {
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        Log.d(TAG, "From: " + remoteMessage.getFrom());

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());

            if (/* Check if data needs to be processed by long running job */ true) {
                // For long-running tasks (10 seconds or more) use Firebase Job Dispatcher.
                //scheduleJob();
            } else {
                // Handle message within 10 seconds
                //handleNow();
            }

        }

        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }
    }
}
