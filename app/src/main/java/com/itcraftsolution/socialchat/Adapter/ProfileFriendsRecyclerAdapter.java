package com.itcraftsolution.socialchat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.itcraftsolution.socialchat.Model.ProfileFriends;
import com.itcraftsolution.socialchat.R;

import java.util.ArrayList;

public class ProfileFriendsRecyclerAdapter extends RecyclerView.Adapter<ProfileFriendsRecyclerAdapter.viewHolder> {

    Context context;
    ArrayList<ProfileFriends> profileFriends;

    public ProfileFriendsRecyclerAdapter(Context context, ArrayList<ProfileFriends> profileFriends) {
        this.context = context;
        this.profileFriends = profileFriends;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_profile_friends , parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    ProfileFriends profileFriend = profileFriends.get(position);
    holder.profileImage.setImageResource(profileFriend.getImage());
    }

    @Override
    public int getItemCount() {
        return profileFriends.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView profileImage;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.igProfileFriendsSample);
        }
    }
}
