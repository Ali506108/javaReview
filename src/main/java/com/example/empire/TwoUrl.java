package com.example.empire;

public class TwoUrl {

    private String urlTitle;
    private String address;
    private String phoneNumber;

    public TwoUrl(String urlTitle, String address, String phoneNumber) {
        this.urlTitle = urlTitle;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public TwoUrl(){}

    public String getUrlTitle() {
        return urlTitle;
    }

    public void setUrlTitle(String urlTitle) {
        this.urlTitle = urlTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "TwoUrl{" +
                "urlTitle='" + urlTitle + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
