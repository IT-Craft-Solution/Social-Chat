package com.itcraftsolution.socialchat.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itcraftsolution.socialchat.Adapter.ProfileFriendsRecyclerAdapter;
import com.itcraftsolution.socialchat.Model.ProfileFriends;
import com.itcraftsolution.socialchat.R;
import com.itcraftsolution.socialchat.databinding.FragmentProfileBinding;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }
    ArrayList<ProfileFriends> profileFriends;
    FragmentProfileBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(getLayoutInflater());
        profileFriends = new ArrayList<>();

        profileFriends.add(new ProfileFriends(R.drawable.logo));
        profileFriends.add(new ProfileFriends(R.drawable.logo));
        profileFriends.add(new ProfileFriends(R.drawable.logo));
        profileFriends.add(new ProfileFriends(R.drawable.logo));
        profileFriends.add(new ProfileFriends(R.drawable.logo));
        profileFriends.add(new ProfileFriends(R.drawable.logo));
        profileFriends.add(new ProfileFriends(R.drawable.logo));
        profileFriends.add(new ProfileFriends(R.drawable.profile));

        ProfileFriendsRecyclerAdapter adapter = new ProfileFriendsRecyclerAdapter(getContext() , profileFriends);
        binding.rvProfileFriends.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL , false);
        binding.rvProfileFriends.setLayoutManager(linearLayoutManager);

        return binding.getRoot();
    }
}