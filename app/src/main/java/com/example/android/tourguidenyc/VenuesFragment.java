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

        venues.add(new Location(getString(R.string.venue_title_1), getString(R.string.venue_subTitle_1)));
        venues.add(new Location(getString(R.string.venue_title_2), getString(R.string.venue_subTitle_2)));
        venues.add(new Location(getString(R.string.venue_title_3), getString(R.string.venue_subTitle_3)));
        venues.add(new Location(getString(R.string.venue_title_4), getString(R.string.venue_subTitle_4)));

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayAdapter<Location> itemsAdapter = new LocationAdapter(getActivity(), venues);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
