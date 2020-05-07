package com.jello.urlconverter;

import org.apache.commons.text.StringEscapeUtils;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Youtubeconvert {
    String link;
    String finalurl;
    String uuid;
    String formated;

    //getters for all methods
    public String getYoutubeurl() {
        return this.link;
    }
    public String getFinalurl(){
        return this.finalurl;
    }
    public String getFormated(){
        return this.formated;
    }
    public String getUuid(){
        return this.uuid;
    }

    //setters for all methods
    public void setYoutubeurl(String url) {
        this.link = url;
    }
    public void setFinalurl(String finalurl) {
        this.finalurl = finalurl;
    }
    public void setUuid(String uuid){
        this.uuid = uuid;
    }
    public void setFormated(String formated){
        this.formated = formated;
    }

    // Main method for getting uuid and verifying site again
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
               String strresponse = response.toString();
               // saves data to an array list string type and takes out the uuid for the link
               ArrayList<String> list= new ArrayList<String>(Arrays.asList(strresponse.split(",")));
               String x = list.get(1);
               String identifier = x.substring(5, x.length() - 1);
               this.uuid = identifier;
           } else{
               System.out.println("failed!");
           }
       } catch (MalformedURLException e) {
           System.out.println(e.getMessage());
       }
    }
    //method to create last url for testing
    public void urlFormation(){
        System.out.println("Please copy and paste the entire youtube video title here: ");
        String in = new Scanner(System.in).nextLine();
        String x = in;
        String specialchar = StringEscapeUtils.escapeHtml4(x);
        String encodedtitle = URLEncoder.encode(specialchar, StandardCharsets.UTF_8)
                .replace("+", "%20").replace("『", "%E3%80%8");
        this.formated = ("https://s1.loader.to/downloads2/" + this.uuid + "/" + encodedtitle + ".mp3");
//        System.out.println(this.getFormated());

    }










}