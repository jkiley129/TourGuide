package com.example.android.tourguidenyc;

public class Location {

    // MARK:- Properties
    private String mLocationName;
    private String mDescription;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String locationName, String description) {
        mLocationName = locationName;
        mDescription = description;
    }

    public Location(String locationName, String description, int imageResourceID) {
        mLocationName = locationName;
        mDescription = description;
        mImageResourceID = imageResourceID;
    }

    public String getName() { return mLocationName; }

    public String getDescription() { return mDescription; }

    public int getImageResourceID() { return mImageResourceID; }

    public boolean hasImage() { return mImageResourceID != NO_IMAGE_PROVIDED; }


}
