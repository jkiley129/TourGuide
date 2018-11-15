package com.example.android.tourguidenyc;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourGuideAdapter extends ArrayAdapter<Location> {

    // MARK:- Properties

    private static final String LOG_TAG = TourGuideAdapter.class.getSimpleName();

    public TourGuideAdapter(Activity context, ArrayList<Location> locations, int categoryColor) {
        super(context, 0, locations);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_item, parent, false);
        }

        Location local_location = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(local_location.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(local_location.getDefaultTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (local_location.hasImage()) {
            imageView.setImageResource(local_location.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
