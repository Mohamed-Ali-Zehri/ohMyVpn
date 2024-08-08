package com.example.ohmyvpn;

import android.net.Uri;

public class Utilies {

    public  static String getImageUrl(int resourceId){
        return Uri.parse("android resourceId://" + R.class.getPackage().getName() + "/" + resourceId).toString();
    }
}
