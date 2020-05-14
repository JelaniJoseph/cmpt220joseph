package com.jello.urlconverter;

import org.junit.rules.Timeout;

import java.io.*;
import java.net.*;
import java.util.Scanner;
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
    public void fileSelection() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a file name");
        String filename = scan.nextLine();

        try {
            System.out.println("Please enter your computer User, for ex 'Jelani;");
            String pathbuild = scan.nextLine().trim();
            String finalpath = "C:\\Users\\" + pathbuild + "\\Desktop\\";
            File file = new File(finalpath + filename + ".mp3");
            System.out.println("path=" + file.getAbsolutePath());
            file.createNewFile();
            System.out.println("File created");
            this.destination = file;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to create file");
        }

    }


    public void downloadDesktop() throws IOException{
        URL youtubelink = new URL(this.processing);
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

            // else statement below to loop through and change url to a different server.
        }else {
            System.out.println("failed");

        }


    }

}