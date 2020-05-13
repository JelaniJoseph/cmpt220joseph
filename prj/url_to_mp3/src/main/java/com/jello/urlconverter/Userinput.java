package com.jello.urlconverter;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;


public class Userinput {
    String youtube_url;
    String soundcloud_url;

    //Returns true if url is valid
    public static boolean isValid(String url){
        /* Try creating a valid URL */
        try {
            new URL(url).toURI();
            return true;
        }
        // If there was an Exception
        // while creating URL object
        catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a URL: ");
        String url1 = new Scanner(System.in).next();
        // series of if statements to check if links is valid & a youtube  link
        if (isValid(url1)){
            System.out.println("This url is valid! continuing...");
            if (url1.contains("youtube")){
                URL tubeurl = new URL(url1);
                YoutubeScrapper youtubescrapper = new YoutubeScrapper();
                System.out.println("sending to youtube class");
                youtubescrapper.setLinktoscrape(tubeurl);
                youtubescrapper.tubeScrape();
                Output output = new Output();
                output.setProcessing(youtubescrapper.getYoutubelink());
                File out = new File("C:\\Users\\Jelani\\Desktop\\ test.mp3");
                output.setDestination(out);
                output.downloadDesktop();
//

            }else if (url1.contains("soundcloud")){
                URL cloudurl = new URL(url1);
                Soundcloudscrapper soundcloudscrapper = new Soundcloudscrapper();
                System.out.println("Sending to soundcloud class...");
                soundcloudscrapper.setSoundscrape(cloudurl);
                soundcloudscrapper.soundScrape();
                Output output = new Output();
                output.setProcessing(soundcloudscrapper.getClouddownload());
                File out = new File("C:\\Users\\Jelani\\Desktop\\ cloud.mp3");
                output.setDestination(out);
                output.downloadDesktop();

            } else{
                System.out.println("This is not a youtube link, exiting program.");
                System.exit(0);
            }

        } else {
            System.out.println("Invalid url!... exiting program ");
            System.exit(0);
        }

    }
}
