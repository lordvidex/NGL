package com.example.drawertournament;


import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

import androidx.cursoradapter.widget.CursorAdapter;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;


public class CurrentTournamentFragment extends Fragment{


    public CurrentTournamentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_current_tournament, container, false);
        View emptyView = getActivity().findViewById(R.id.empty_view);
        ListView currentTournamentListView = getActivity().findViewById(R.id.listview_current_tournaments);
        return fragmentView;
    }
}
