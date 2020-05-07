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

        // series of if statements to check if links is valid & a youtube or soundcloud link
        if (isValid(url1)){
            System.out.println("This url is valid! continuing...");
            Encoder encoder = new Encoder();
            if (url1.contains("youtube")){
                Youtubeconvert tube = new Youtubeconvert();
                System.out.println("sending to youtube class");
                encoder.setEncodedurl(url1);
                encoder.encode();
                tube.setFinalurl(encoder.getTubeurl());
                tube.Download();
                tube.urlFormation();
                Output output = new Output();
                output.setProcessing(tube.getFormated());
                output.finalStep();
//

            }else{
                System.out.println("This is not a soundcloud/youtube link, exiting program.");
                System.exit(0);
            }

        } else {
            System.out.println("Invalid url!... exiting program ");
            System.exit(0);
        }

    }
}
