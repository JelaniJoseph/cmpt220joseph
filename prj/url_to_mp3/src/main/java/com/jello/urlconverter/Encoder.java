package com.jello.urlconverter;

import org.apache.commons.text.StringEscapeUtils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Encoder {
    String encodedurl;
    String tubeurl;

    public void setEncodedurl(String encodedurl) {
        this.encodedurl = encodedurl;
    }
    public String getEncodedurl(){
        return this.encodedurl;
    }

    public void encode(){
        String x = URLEncoder.encode(this.encodedurl, StandardCharsets.UTF_8);
        this.tubeurl = "https://loader.to/ajax/?function=d&b=1&s=1&e=1&f=mp3&u=" + x;
    }

    public void setTubeurl(String x){
        this.tubeurl = this.tubeurl;
    }

    public String getTubeurl() {
        return tubeurl;
    }

}

