package com.ambergleam.android.marta.data;

public class Adventure {

    private String mName;
    private String mStartTime;
    private String mStopTime;
    private String mStartLocation;
    private String mStopLocation;

    public Adventure(String name, String startTime, String stopTime, String startLocation, String stopLocation) {
        mName = name;
        mStartTime = startTime;
        mStopTime = stopTime;
        mStartLocation = startLocation;
        mStopLocation = stopLocation;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getStartTime() {
        return mStartTime;
    }

    public void setStartTime(String startTime) {
        mStartTime = startTime;
    }

    public String getStopTime() {
        return mStopTime;
    }

    public void setStopTime(String stopTime) {
        mStopTime = stopTime;
    }

    public String getStartLocation() {
        return mStartLocation;
    }

    public void setStartLocation(String startLocation) {
        mStartLocation = startLocation;
    }

    public String getStopLocation() {
        return mStopLocation;
    }

    public void setStopLocation(String stopLocation) {
        mStopLocation = stopLocation;
    }

    @Override
    public String toString() {
        return mName + "\n" + mStartTime + " - " + mStopTime + "\n" + mStartLocation + " - " + mStopLocation;
    }

}
