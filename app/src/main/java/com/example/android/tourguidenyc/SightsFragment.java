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

        sights.add(new Location("Central Park", "A must visit for any trip to NYC. Escape the hustle and bustle.", R.drawable.ic_central_park));
        sights.add(new Location("World Trade Center Memorial", "A sobering site commemorating a tragic event", R.drawable.ic_world_trade));
        sights.add(new Location("Empire State Building", "Who doesn't love this NYC architectural landmark?", R.drawable.ic_empire_state));
        sights.add(new Location("Statue of Liberty", "Pick a warm day to go see Lady Liberty from a boat", R.drawable.ic_statue_of_liberty));

        View rootView = inflater.inflate(R.layout.image_list, container, false);

        ArrayAdapter<Location> itemsAdapter = new LocationAdapter(getActivity(), sights);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
