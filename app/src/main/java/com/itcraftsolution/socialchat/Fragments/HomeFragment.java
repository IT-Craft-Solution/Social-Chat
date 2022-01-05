package com.itcraftsolution.socialchat.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itcraftsolution.socialchat.Adapter.HomePostRecyclerAdapter;
import com.itcraftsolution.socialchat.Adapter.HomeStoryRecyclerView;
import com.itcraftsolution.socialchat.Model.Post;
import com.itcraftsolution.socialchat.Model.Story;
import com.itcraftsolution.socialchat.R;
import com.itcraftsolution.socialchat.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

   FragmentHomeBinding binding;
    ArrayList<Story> stories;
    ArrayList<Post> posts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(getLayoutInflater());

        stories = new ArrayList<>();
        posts = new ArrayList<>();

        stories.add(new Story(R.drawable.deaf , R.drawable.profile , R.drawable.ic_like , "MR.Shadow"));
        stories.add(new Story(R.drawable.deaf , R.drawable.profile , R.drawable.ic_like_red , "Rumit kakadiya"));
        stories.add(new Story(R.drawable.deaf , R.drawable.profile , R.drawable.ic_like , "Vishal Makwana"));
        stories.add(new Story(R.drawable.deaf , R.drawable.profile , R.drawable.ic_like_red , "Akshay Kher"));
        stories.add(new Story(R.drawable.deaf , R.drawable.profile , R.drawable.ic_like_red , "Kiran Dhiyad"));
        stories.add(new Story(R.drawable.deaf , R.drawable.profile , R.drawable.ic_like , "MR.Shadow"));
        HomeStoryRecyclerView adapter = new HomeStoryRecyclerView(getContext() , stories);
        binding.rvHomeStory.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext() , RecyclerView.HORIZONTAL , false);
        binding.rvHomeStory.setLayoutManager(linearLayoutManager);
        binding.rvHomeStory.setNestedScrollingEnabled(false);

        posts.add(new Post(R.drawable.profile , R.drawable.logo , R.drawable.ic_bookmark , "IT Craft Solution" ,"It Company" ,"200" , "3", "50"  ));
        posts.add(new Post(R.drawable.profile , R.drawable.logo , R.drawable.ic_bookmark , "IT Craft Solution" ,"It Company" ,"200" , "3", "50"  ));
        posts.add(new Post(R.drawable.profile , R.drawable.logo , R.drawable.ic_bookmark , "IT Craft Solution" ,"It Company" ,"200" , "3", "50"  ));
        posts.add(new Post(R.drawable.profile , R.drawable.logo , R.drawable.ic_bookmark , "IT Craft Solution" ,"It Company" ,"200" , "3", "50"  ));
        posts.add(new Post(R.drawable.profile , R.drawable.logo , R.drawable.ic_bookmark , "IT Craft Solution" ,"It Company" ,"200" , "3", "50"  ));
        posts.add(new Post(R.drawable.profile , R.drawable.logo , R.drawable.ic_bookmark , "IT Craft Solution" ,"It Company" ,"200" , "3", "50"  ));
        posts.add(new Post(R.drawable.profile , R.drawable.logo , R.drawable.ic_bookmark , "IT Craft Solution" ,"It Company" ,"200" , "3", "50"  ));
        posts.add(new Post(R.drawable.profile , R.drawable.logo , R.drawable.ic_bookmark , "IT Craft Solution" ,"It Company" ,"200" , "3", "50"  ));

        HomePostRecyclerAdapter Postadapter = new HomePostRecyclerAdapter(getContext() , posts);
        binding.rvHomePost.setAdapter(Postadapter);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext());
        binding.rvHomePost.setLayoutManager(linearLayoutManager1);


        return binding.getRoot();
    }
}
