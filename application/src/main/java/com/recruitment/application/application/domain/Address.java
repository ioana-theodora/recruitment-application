package com.recruitment.application.application.domain;


public class Address {

    private Long resourceId;
    //TODO this needs to be a FK from a specific table
    private String country;
    //TODO this needs to be a FK from a specific table
    private String region;
    private String locality;
    private String street;
    private String number;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "resourceId=" + resourceId +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", locality='" + locality + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
