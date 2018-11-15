package com.example.android.tourguidenyc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    // MARK: - Properties
    final ArrayList<Location> restaurants = new ArrayList<Location>();

    public RestaurantFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        return rootView;
    }
}
