package com.itcraftsolution.socialchat.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.itcraftsolution.socialchat.Fragments.NotificationViewPagerFragment;
import com.itcraftsolution.socialchat.Fragments.requestViewPagerFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new requestViewPagerFragment();

            default:
                return new NotificationViewPagerFragment();

        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;

        if (position == 0) {
        title = "Notifications";
        }
        else if(position == 1)
        {
            title = "Requests";
        }

        return title;

    }
}
