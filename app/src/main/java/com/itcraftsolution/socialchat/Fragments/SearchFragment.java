package com.itcraftsolution.socialchat.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itcraftsolution.socialchat.R;
import com.itcraftsolution.socialchat.databinding.FragmentSearchBinding;

public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }

    FragmentSearchBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(getLayoutInflater());


        return binding.getRoot();
    }
}