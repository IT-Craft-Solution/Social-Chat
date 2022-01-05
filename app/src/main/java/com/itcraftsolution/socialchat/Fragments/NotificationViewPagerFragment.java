package com.itcraftsolution.socialchat.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.itcraftsolution.socialchat.Adapter.NotificationRecyclerAdapter;
import com.itcraftsolution.socialchat.Model.Notification;
import com.itcraftsolution.socialchat.R;
import com.itcraftsolution.socialchat.databinding.FragmentNotificationViewPagerBinding;

import java.util.ArrayList;


public class NotificationViewPagerFragment extends Fragment {


    public NotificationViewPagerFragment() {
        // Required empty public constructor
    }

    FragmentNotificationViewPagerBinding binding;
    ArrayList<Notification> notifications;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNotificationViewPagerBinding.inflate(getLayoutInflater());
        notifications = new ArrayList<>();

        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));
        notifications.add(new Notification(R.drawable.deaf , "Following You" , "2 Hours"));

        NotificationRecyclerAdapter adapter = new NotificationRecyclerAdapter(getContext() , notifications);
        binding.rvNotification.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        binding.rvNotification.setLayoutManager(linearLayoutManager);

        return binding.getRoot();
    }
}
