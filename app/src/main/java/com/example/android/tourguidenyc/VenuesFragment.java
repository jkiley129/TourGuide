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
public class VenuesFragment extends Fragment {

    // MARK: - Properties
    final ArrayList<Location> venues = new ArrayList<Location>();

    public VenuesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        venues.add(new Location("Bowery Ballroom", "A small and intimate concert space in the heart of the Lower East Side. One of the best in the world."));
        venues.add(new Location("Brooklyn Steel", "The newest concert venue in Brooklyn. Books hot indie acts."));
        venues.add(new Location("Output", "The best techno club in the world with arguably the best soundsystem on the planet"));
        venues.add(new Location("Beacon Theater", "A beautiful old theater in the heart of the Upper West Side. Books comedians as well as legacy acts."));

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayAdapter<Location> itemsAdapter = new LocationAdapter(getActivity(), venues);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
