package com.example.drawertournament;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FinishedTournamentFragment extends Fragment {

    public FinishedTournamentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_finished_tournament, container, false);
        View emptyView = getActivity().findViewById(R.id.empty_view_finished);
        ListView finishedTournamentListView = getActivity().findViewById(R.id.listview_finished_tournaments);
        return fragmentView;
    }

}
