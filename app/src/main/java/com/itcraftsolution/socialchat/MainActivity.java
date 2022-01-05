package com.itcraftsolution.socialchat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.iammert.library.readablebottombar.ReadableBottomBar;
import com.itcraftsolution.socialchat.Fragments.AddPostFragment;
import com.itcraftsolution.socialchat.Fragments.HomeFragment;
import com.itcraftsolution.socialchat.Fragments.NotificationFragment;
import com.itcraftsolution.socialchat.Fragments.ProfileFragment;
import com.itcraftsolution.socialchat.Fragments.SearchFragment;
import com.itcraftsolution.socialchat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frMainContainer , new HomeFragment());
        fragmentTransaction.commit();

        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                switch (i)
                {

                    case 1:
                        fragmentTransaction.replace(R.id.frMainContainer, new SearchFragment());
                        break;

                    case 2:
                        fragmentTransaction.replace(R.id.frMainContainer, new AddPostFragment());
                        break;

                    case 3:
                        fragmentTransaction.replace(R.id.frMainContainer, new NotificationFragment());
                        break;
                    case 4:
                        fragmentTransaction.replace(R.id.frMainContainer, new ProfileFragment());
                        break;

                    default:
                        fragmentTransaction.replace(R.id.frMainContainer, new HomeFragment());
                        break;
                }
                fragmentTransaction.commit();
            }
        });
    }
}