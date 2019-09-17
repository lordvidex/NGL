package com.example.drawertournament;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
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
}
