package com.jello.urlconverter;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.simple.JSONObject;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;
import java.io.IOException;


public class Youtubeconvert {
    String link;
    String finalurl;

    public void setYoutubeurl(String url) {
        this.link = url;
    }
    public String getYoutubeurl() {
        return this.link;
    }

    public void setFinalurl(String finalurl) {
        this.finalurl = finalurl;
    }

    public String getFinalurl(){
        return this.finalurl;
    }

    public void Download() throws IOException {

       try{
           //Set url variable = to current link and pull information from it
           URL url_done = new URL(this.getFinalurl());
           HttpURLConnection conn = (HttpURLConnection)url_done.openConnection();
           conn.setRequestMethod("GET");
           int responseCode = conn.getResponseCode();
           // if the site can be reached we make a buffer reader and save the information to a sringbuffer
           if(responseCode == HttpURLConnection.HTTP_OK){
               BufferedReader in = new BufferedReader(new InputStreamReader(
                       conn.getInputStream()));
               String inputLine;
               StringBuffer response = new StringBuffer();
               while ((inputLine = in.readLine()) != null) {
                   response.append(inputLine);
               }
               in.close();
               System.out.println("Reached");
           } else{
               System.out.println("failed!");
           }
       } catch (MalformedURLException e) {
           System.out.println(e.getMessage());
       }
    }





}