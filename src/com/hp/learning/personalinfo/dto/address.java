package com.hp.learning.personalinfo.dto;

public class address {

    private String street;
    private int houseNumber;
    private String buildingName;
    private String city;
    private String state;
    private int pincode;



    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        if(street != null && street.contains("-") || street.contains("_")) {
            this.street = street;
        }
        else{
            System.out.println("Invalid street number");
        }
    }

    public int getHouseNumber()
    {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber)
    {
        if(houseNumber > 0) {
            this.houseNumber = houseNumber;
        }
        else{
            System.out.println("invalid house number");
        }
    }

    public String getBuildingName()
    {
        return buildingName;
    }

    public void setBuildingName(String buildingName)
    {
        this.buildingName = buildingName;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        if(pincode >= 100000 && pincode <= 999999) {
            this.pincode = pincode;
        }
        else{
            System.out.println("Invalid Pincode");
        }
    }
}
