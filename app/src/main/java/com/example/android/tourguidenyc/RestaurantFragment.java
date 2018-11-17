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

        restaurants.add(new Location("Sushi by Bou", "A casual Omakase Sushi bar with reasonable prices and amazing Sushi"));
        restaurants.add(new Location("Pylos", "A Greek Restaurant in the East Village with authentic Greek cuisine and unique decor"));
        restaurants.add(new Location("KazuNori", "A casual handroll Sushi bar from the people who did SugarFish"));
        restaurants.add(new Location("Mala Project", "Chinese hot pot with amazing spices and unique flavors"));

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayAdapter<Location> itemsAdapter = new LocationAdapter(getActivity(), restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
