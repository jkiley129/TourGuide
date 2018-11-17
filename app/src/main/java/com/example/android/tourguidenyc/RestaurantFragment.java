package com.example.android.tourguidenyc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    // MARK: - Properties
    final ArrayList<Location> restaurants = new ArrayList<Location>();

    public RestaurantFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        restaurants.add(new Location(getString(R.string.restaurants_title_1), getString(R.string.restaurants_subTitle_1)));
        restaurants.add(new Location(getString(R.string.restaurants_title_2), getString(R.string.restaurants_subTitle_2)));
        restaurants.add(new Location(getString(R.string.restaurants_title_3), getString(R.string.restaurants_subTitle_3)));
        restaurants.add(new Location(getString(R.string.restaurants_title_4), getString(R.string.restaurants_subTitle_4)));

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayAdapter<Location> itemsAdapter = new LocationAdapter(getActivity(), restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
