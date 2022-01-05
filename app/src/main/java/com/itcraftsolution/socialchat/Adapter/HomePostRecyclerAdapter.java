package com.itcraftsolution.socialchat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.itcraftsolution.socialchat.Model.Post;
import com.itcraftsolution.socialchat.R;

import java.util.ArrayList;

public class HomePostRecyclerAdapter extends RecyclerView.Adapter<HomePostRecyclerAdapter.viewHolder> {

    Context context;
    ArrayList<Post> posts;

    public HomePostRecyclerAdapter(Context context, ArrayList<Post> posts) {
        this.context = context;
        this.posts = posts;
    }

    @NonNull
    @Override
    public HomePostRecyclerAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_post_sample , parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomePostRecyclerAdapter.viewHolder holder, int position) {

        Post post = posts.get(position);
        holder.ProfileDp.setImageResource(post.getProfile());
        holder.PostImage.setImageResource(post.getPost());
        holder.Save.setImageResource(post.getSave());
        holder.Name.setText(post.getName());
        holder.Bio.setText(post.getBio());
        holder.Like.setText(post.getLike());
        holder.Comment.setText(post.getComment());
        holder.Share.setText(post.getShare());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView ProfileDp, PostImage, Save;
        TextView Name, Bio, Like , Comment , Share;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            ProfileDp = itemView.findViewById(R.id.igPostDp);
            PostImage = itemView.findViewById(R.id.igPostImage);
            Save = itemView.findViewById(R.id.igPostSave);
            Name = itemView.findViewById(R.id.txPostName);
            Bio = itemView.findViewById(R.id.txPostBio);
            Like = itemView.findViewById(R.id.txPostLike);
            Comment = itemView.findViewById(R.id.txPostComment);
            Share = itemView.findViewById(R.id.txPostShare);

        }
    }
}
