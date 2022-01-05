package com.itcraftsolution.socialchat.Model;

import android.widget.ImageView;
import android.widget.TextView;

public class Notification {
    private int NotificationDp;
    private String NotificationMsg, NotificationTime;

    public Notification(int notificationDp, String notificationMsg, String notificationTime) {
        NotificationDp = notificationDp;
        NotificationMsg = notificationMsg;
        NotificationTime = notificationTime;
    }

    public int getNotificationDp() {
        return NotificationDp;
    }

    public void setNotificationDp(int notificationDp) {
        NotificationDp = notificationDp;
    }

    public String getNotificationMsg() {
        return NotificationMsg;
    }

    public void setNotificationMsg(String notificationMsg) {
        NotificationMsg = notificationMsg;
    }

    public String getNotificationTime() {
        return NotificationTime;
    }

    public void setNotificationTime(String notificationTime) {
        NotificationTime = notificationTime;
    }
}
