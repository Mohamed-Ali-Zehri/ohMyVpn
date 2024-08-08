package com.example.ohmyvpn.Model;

public class Servers {
    private String ServerCountry;
    private String flagUrl ;
    private String Ovpn ;
    private String OvpnUserName;
    private String OvpnPassword;

    public Servers(String serverCountry, String flagUrl, String ovpn, String ovpnUserName, String ovpnPassword) {
        ServerCountry = serverCountry;
        this.flagUrl = flagUrl;
        Ovpn = ovpn;
        OvpnUserName = ovpnUserName;
        OvpnPassword = ovpnPassword;
    }

    public Servers(){

    }

    public String getServerCountry() {
        return ServerCountry;
    }

    public void setServerCountry(String serverCountry) {
        ServerCountry = serverCountry;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }

    public String getOvpn() {
        return Ovpn;
    }

    public void setOvpn(String ovpn) {
        Ovpn = ovpn;
    }

    public String getOvpnUserName() {
        return OvpnUserName;
    }

    public void setOvpnUserName(String ovpnUserName) {
        OvpnUserName = ovpnUserName;
    }

    public String getOvpnPassword() {
        return OvpnPassword;
    }

    public void setOvpnPassword(String ovpnPassword) {
        OvpnPassword = ovpnPassword;
    }
}
