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

public class BarsFragment extends Fragment {

    // MARK: - Properties
    final ArrayList<Location> bars = new ArrayList<Location>();

    public BarsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        bars.add(new Location("Patent Pending", "A new speakeasy that is a coffee shop by day, and a cocktail bar at night"));
        bars.add(new Location("Up & Up", "A great cocktail bar in the heart of Greewich Village"));
        bars.add(new Location("Dante", "A trendy Italian restaurant that serves Negroni's on tap"));
        bars.add(new Location("Bathtub Gin", "A hidden speakeasy with a literal bathtub that is great for a photo op"));

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayAdapter<Location> itemsAdapter = new LocationAdapter(getActivity(), bars);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
