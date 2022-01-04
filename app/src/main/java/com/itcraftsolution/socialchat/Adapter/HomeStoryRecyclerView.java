package com.itcraftsolution.socialchat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.itcraftsolution.socialchat.Model.Story;
import com.itcraftsolution.socialchat.R;

import java.util.ArrayList;

public class HomeStoryRecyclerView extends RecyclerView.Adapter<HomeStoryRecyclerView.viewHolder> {

    Context context;
    ArrayList<Story> stories;

    public HomeStoryRecyclerView(Context context, ArrayList<Story> stories) {
        this.context = context;
        this.stories = stories;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_story_sample , parent , false);
        return new viewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    Story story = stories.get(position);
    holder.storyimg.setImageResource(story.getStory());
    holder.profile.setImageResource(story.getProfile());
    holder.like.setImageResource(story.getLike());
    holder.name.setText(story.getName());
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView storyimg , profile , like;
        TextView name;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            storyimg = itemView.findViewById(R.id.igStoryPhoto);
            profile = itemView.findViewById(R.id.igStoryDp);
            like = itemView.findViewById(R.id.igStoryLike);
            name = itemView.findViewById(R.id.txStoryName);

        }
    }
}
