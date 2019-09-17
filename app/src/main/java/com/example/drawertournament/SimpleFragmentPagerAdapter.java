package com.example.drawertournament;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) {
            return new CurrentTournamentFragment();
        } else {
            return new FinishedTournamentFragment();
            }
        };

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return mContext.getString(R.string.now);
        }else{
            return mContext.getString(R.string.done);
        }
    }
}
