package com.jello.urlconverter;

import org.junit.rules.Timeout;

import java.io.*;
import java.net.*;
import java.util.concurrent.TimeoutException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;


public class Output {
    String processing;

    public void setProcessing(String processing) {
        this.processing = processing;
    }

    public String getProcessing() {
        return processing;
    }

    public void Timeout(){

    }


    public void finalStep() throws IOException{
        int serverchange = 1;
        boolean condition = true;

        while(condition == true){
            URL youtubelink = new URL(this.processing);
            HttpURLConnection conn = (HttpURLConnection)youtubelink.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();
            if(responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Reached");
                condition = false;
            }else {
                System.out.println("failed");
                String serverlink = youtubelink.toString();
                int index = 9;
                serverchange++;
                String ch = String.valueOf(serverchange);
                char c = ch.charAt(0);
                StringBuilder edited = new StringBuilder(serverlink);
                edited.setCharAt(9, c);
                String servpass = edited.toString();
                this.processing = servpass;
                System.out.println(this.processing);
            }

        }





//        for(int i = 0; i <= 6; i++){
//            if(responseCode == HttpURLConnection.HTTP_OK) {
//                System.out.println("Reached");
//                break;
//            }else{
//                String serverlink = youtubelink.toString();
//                int index = 9;
//                int serverchange = 1;
//                serverchange++;
//                char ch = (char) serverchange;
//                StringBuilder edited = new StringBuilder(serverlink);
//                edited.setCharAt(9, ch);
//                String servpass = edited.toString();
//                this.processing = servpass;
//                finalStep();
//
//            }
//        }
    }
}
