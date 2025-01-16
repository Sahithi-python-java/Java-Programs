package com.sahithi.hrentities;

public class Phone {

    private int id;
    private String areaCode;
    private String countryCode;
    private String number;

    public Phone(int id, String areaCode, String countryCode, String number) {
        this.id = id;
        this.areaCode = areaCode;
        this.countryCode = countryCode;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getNumber() {
        return number;
    }
}
