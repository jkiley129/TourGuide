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

        sights.add(new Location(getString(R.string.sights_title_1), getString(R.string.sights_subTitle_1), R.drawable.ic_central_park));
        sights.add(new Location(getString(R.string.sights_title_2), getString(R.string.sights_subTitle_2), R.drawable.ic_world_trade));
        sights.add(new Location(getString(R.string.sights_title_3), getString(R.string.sights_subTitle_3), R.drawable.ic_empire_state));
        sights.add(new Location(getString(R.string.sights_title_4), getString(R.string.sights_subTitle_4), R.drawable.ic_statue_of_liberty));

        View rootView = inflater.inflate(R.layout.image_list, container, false);

        ArrayAdapter<Location> itemsAdapter = new LocationAdapter(getActivity(), sights);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
