package com.example.android.tourguidenyc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SightsFragment extends Fragment {

    // MARK: - Properties
    final ArrayList<Location> sights = new ArrayList<Location>();

    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        sights.add(new Location("Central Park", "A must visit for any trip to NYC. Escape the hustle and bustle without leaving town."));
        sights.add(new Location("World Trade Center Memorial", "A sobering site commemorating a tragic event"));
        sights.add(new Location("Empire State Building", "Who doesn't love this NYC architectural landmark?"));
        sights.add(new Location("Statue of Liberty", "Make sure you pick a warm day to go see Lady Liberty from a boat"));

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayAdapter<Location> itemsAdapter = new LocationAdapter(getActivity(), sights);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
