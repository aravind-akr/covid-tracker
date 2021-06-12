package com.aravind.covidtracker.models;

public class LocationStats {

    private String state;
    private String country;
    private long latestTotalCases;
    private int diffFromPreviousDay;

    public int getDiffFromPreviousDay() {
        return diffFromPreviousDay;
    }

    public void setDiffFromPreviousDay(int diffFromPreviousDay) {
        this.diffFromPreviousDay = diffFromPreviousDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(long latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
