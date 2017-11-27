package com.example.umasubbiah.tourguideapp;

/**
 * Created by umasubbiah on 30/06/17.
 */


public class Entry {
    private String mShort_desc;

    private String mName;

    private String mLongDesc = null;

    private String mSplDesc = null;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int icon = 0;

    //Tips
    public Entry(String tip) {
        mName = tip;
    }


    //Things to do
    public Entry(String name, String short_desc, int icon) {
        mShort_desc = short_desc;
        mName = name;
        this.icon = icon;
    }

    //Places
    public Entry(String short_desc, String name, String spl_desc, int image, int icon) {
        mShort_desc = short_desc;
        mName = name;
        mSplDesc = spl_desc;
        this.icon = icon;
        mImageResourceId = image;
    }

    public String getName() {
        return mName;
    }

    public String getShortDesc() {
        return mShort_desc;
    }

    public String getLongDesc() {
        return mLongDesc;
    }

    public String getSplDesc() {
        return mSplDesc;
    }

    public int getIcon() {
        return icon;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasLong() {
        return mLongDesc != null;
    }
}

