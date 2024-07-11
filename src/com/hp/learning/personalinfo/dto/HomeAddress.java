package com.hp.learning.personalinfo.dto;

public class HomeAddress extends address {
    private String homestreet;
    private int homehouseNumber;
    private String homebuildingName;
    private String homecity;
    private String homestate;
    private int homepincode;

    public String getHomestreet() {
        return homestreet;
    }

    public void setHomestreet(String homestreet) {
        this.homestreet = homestreet;
    }

    public int getHomehouseNumber() {
        return homehouseNumber;
    }

    public void setHomehouseNumber(int homehouseNumber) {
        this.homehouseNumber = homehouseNumber;
    }

    public String getHomebuildingName() {
        return homebuildingName;
    }

    public void setHomebuildingName(String homebuildingName) {
        this.homebuildingName = homebuildingName;
    }

    public String getHomecity() {
        return homecity;
    }

    public void setHomecity(String homecity) {
        this.homecity = homecity;
    }

    public String getHomestate() {
        return homestate;
    }

    public void setHomestate(String homestate) {
        this.homestate = homestate;
    }

    public int getHomepincode() {
        return homepincode;
    }

    public void setHomepincode(int homepincode) {
        this.homepincode = homepincode;
    }
}