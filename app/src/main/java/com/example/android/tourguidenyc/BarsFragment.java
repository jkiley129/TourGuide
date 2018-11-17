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

        bars.add(new Location(getString(R.string.bars_title_1), getString(R.string.bars_subTitle_1)));
        bars.add(new Location(getString(R.string.bars_title_2), getString(R.string.bars_subTitle_2)));
        bars.add(new Location(getString(R.string.bars_title_3), getString(R.string.bars_subTitle_3)));
        bars.add(new Location(getString(R.string.bars_title_4), getString(R.string.bars_subTitle_4)));

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayAdapter<Location> itemsAdapter = new LocationAdapter(getActivity(), bars);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
