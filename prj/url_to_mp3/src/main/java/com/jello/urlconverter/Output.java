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
    File destination;

    public void setProcessing(String processing) {
        this.processing = processing;
    }

    public String getProcessing() {
        return processing;
    }

    public void setDestination(File destination){
        this.destination = destination;
    }

    public File getDestination(){
        return this.destination;
    }

    public void connection(){
        
    }


    public void finalStep() throws IOException{
        int serverchange = 1;
        boolean condition = true;

        while(condition == true){
            URL youtubelink = new URL(this.processing);
            System.out.println(youtubelink);
            HttpURLConnection conn = (HttpURLConnection)youtubelink.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();
            // if website is reached save data to mp3 file and output
            if(responseCode == HttpURLConnection.HTTP_OK) {
                URL finallink = new URL(this.processing);
                HttpURLConnection connect = (HttpURLConnection)finallink.openConnection();
                double filesize = (double)connect.getContentLengthLong();
                BufferedInputStream in = new BufferedInputStream(connect.getInputStream());
                FileOutputStream filehere = new FileOutputStream(this.destination);
                BufferedOutputStream bout = new BufferedOutputStream(filehere, 1024);
                byte [] data = new byte[1024];
                double downloaded = 0.00;
                int read = 0;
                double percentdownloaded = 0.00;
                //second while loop to propperly read data within if statement
                while((read = in.read(data, 0, 1024)) >= 0){
                    bout.write(data, 0, read);
                    downloaded += read;
                    percentdownloaded = (downloaded * 100) / filesize;
                    String percent = String.format("%.4f", percentdownloaded);
                    System.out.println("Downloaded" + percent + "% of a file");
                }
                bout.close();
                in.close();
                System.out.println("Downloaded Complete");
                condition = false;
                // else statement below to loop through and change url to a different server.
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

    }
}
