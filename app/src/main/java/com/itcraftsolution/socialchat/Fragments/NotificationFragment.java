package com.itcraftsolution.socialchat.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itcraftsolution.socialchat.R;
import com.itcraftsolution.socialchat.databinding.FragmentNotificationBinding;

public class NotificationFragment extends Fragment {



    public NotificationFragment() {
        // Required empty public constructor
    }

    FragmentNotificationBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNotificationBinding.inflate(getLayoutInflater());


        return binding.getRoot();
    }
}