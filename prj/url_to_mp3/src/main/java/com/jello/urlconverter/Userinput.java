package com.jello.urlconverter;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Userinput {
    String youtube_url;
    String soundcloud_url;

    public Userinput() {
    }

    public static boolean isValid(String url) {
        try {
            (new URL(url)).toURI();
            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a URL: ");
        String url1 = (new Scanner(System.in)).next();
        if (isValid(url1)) {
            System.out.println("This url is valid! continuing...");
            URL cloudurl;
            Output output;
            if (url1.contains("youtube")) {
                cloudurl = new URL(url1);
                YoutubeScrapper youtubescrapper = new YoutubeScrapper();
                System.out.println("sending to youtube class");
                youtubescrapper.setLinktoscrape(cloudurl);
                youtubescrapper.tubeScrape();
                output = new Output();
                output.fileSelection();
                output.setProcessing(youtubescrapper.getYoutubelink());
                output.downloadDesktop();
            } else if (url1.contains("soundcloud")) {
                cloudurl = new URL(url1);
                Soundcloudscrapper soundcloudscrapper = new Soundcloudscrapper();
                System.out.println("Sending to soundcloud class...");
                soundcloudscrapper.setSoundscrape(cloudurl);
                soundcloudscrapper.soundScrape();
                output = new Output();
                output.fileSelection();
                output.setProcessing(soundcloudscrapper.getClouddownload());
                output.downloadDesktop();
            } else {
                System.out.println("This is not a youtube link, exiting program.");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid url!... exiting program ");
            System.exit(0);
        }

    }
}