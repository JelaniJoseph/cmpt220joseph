package com.jello.urlconverter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

public class Soundcloudconvert {
    // attributes
    final static int size = 1024;
    // string that contains initial user input
    String soundurl = "";

    public void setSoundurl(String url){
        this.soundurl = url;
    }

    public String getSoundurl(){
        return this.soundurl;
    }

    // Method to search web for url, and download contents using stream
    public void download(String url){
        try {
            URL link = new URL(this.soundurl);
            java.net.URLConnection conn = new URL(this.soundurl).openConnection();
            System.out.println("Site was reached");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}