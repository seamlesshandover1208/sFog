package com.example.androidtemplate.mo;

/**
 *
 */
public class WifiInfoc {

    private String ssid;
    private String password;

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public WifiInfoc(String ssid, String password) {
        this.ssid = ssid;
        this.password = password;
    }

    @Override
    public String toString() {
        return "WifiInfoc{" +
                "ssid='" + ssid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
