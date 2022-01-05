package com.itcraftsolution.socialchat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.itcraftsolution.socialchat.Model.Notification;
import com.itcraftsolution.socialchat.R;

import java.util.ArrayList;

public class NotificationRecyclerAdapter extends RecyclerView.Adapter<NotificationRecyclerAdapter.viewHolder> {

    Context context;
    ArrayList<Notification> notifications;

    public NotificationRecyclerAdapter(Context context, ArrayList<Notification> notifications) {
        this.context = context;
        this.notifications = notifications;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_notification_sample , parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        Notification notification = notifications.get(position);
        holder.Dp.setImageResource(notification.getNotificationDp());
        holder.NotificationMsg.setText(notification.getNotificationMsg());
        holder.NotificationTime.setText(notification.getNotificationTime());
    }

    @Override
    public int getItemCount() {
        return notifications.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView Dp;
        TextView NotificationMsg, NotificationTime;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            Dp = itemView.findViewById(R.id.igNotificationDp);
            NotificationMsg = itemView.findViewById(R.id.txNotificationMsg);
            NotificationTime = itemView.findViewById(R.id.txNotificationTime);
        }
    }
}
