package com.hp.learning.personalinfo.dto;

public class OfficeAddress extends address{
    private String officestreet;
    private String officebuildingName;
    private String officecity;
    private String officestate;
    private int officepincode;

    public String getOfficestreet() {
        return officestreet;
    }

    public void setOfficestreet(String officestreet) {
        this.officestreet = officestreet;
    }

    public String getOfficebuildingName() {
        return officebuildingName;
    }

    public void setOfficebuildingName(String officebuildingName) {
        this.officebuildingName = officebuildingName;
    }

    public String getOfficecity() {
        return officecity;
    }

    public void setOfficecity(String officecity) {
        this.officecity = officecity;
    }

    public String getOfficestate() {
        return officestate;
    }

    public void setOfficestate(String officestate) {
        this.officestate = officestate;
    }

    public int getOfficepincode() {
        return officepincode;
    }

    public void setOfficepincode(int officepincode) {
        this.officepincode = officepincode;
    }
}
