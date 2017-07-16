package com.recruitment.application.application.domain;


public class ContactsOptions {

    private Long resourceID;
    private String phoneNumber;
    private String facebookConnection;
    private String linkedInConnection;
    private String skypeConnection;

    public Long getResourceID() {
        return resourceID;
    }

    public void setResourceID(Long resourceID) {
        this.resourceID = resourceID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFacebookConnection() {
        return facebookConnection;
    }

    public void setFacebookConnection(String facebookConnection) {
        this.facebookConnection = facebookConnection;
    }

    public String getLinkedInConnection() {
        return linkedInConnection;
    }

    public void setLinkedInConnection(String linkedInConnection) {
        this.linkedInConnection = linkedInConnection;
    }

    public String getSkypeConnection() {
        return skypeConnection;
    }

    public void setSkypeConnection(String skypeConnection) {
        this.skypeConnection = skypeConnection;
    }

    @Override
    public String toString() {
        return "ContactsOptions{" +
                "resourceID=" + resourceID +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", facebookConnection='" + facebookConnection + '\'' +
                ", linkedInConnection='" + linkedInConnection + '\'' +
                ", skypeConnection='" + skypeConnection + '\'' +
                '}';
    }
}
