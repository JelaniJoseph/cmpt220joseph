package com.jello.urlconverter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Soundcloudscrapper {
    URL soundscrape;
    String clouddownload;

    final String regex = "\\w*\\((.*)\\)";

    public void setSoundscrape(URL soundscrape){
        this.soundscrape = soundscrape;
    }

    public URL getSoundscrape(){
        return this.soundscrape;
    }
    public void setClouddownload(String clouddownload){
        this.clouddownload = clouddownload;
    }
    public String getClouddownload(){
        return this.clouddownload;
    }


    // Method to simulate automation and return soundcloud downloadable link
    public void soundScrape()throws IOException {
        Userinput userinput = new Userinput();
        WebDriverManager.chromedriver().version("81.0.4044.138").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://sclouddownloader.net/");
        WebElement inputbox = driver.findElement(By.xpath("/html/body/div[2]/div/center/form/div/input"));
        inputbox.sendKeys(String.valueOf(this.soundscrape));
        WebElement downloadclick = driver.findElement(By.xpath("/html/body/div[2]/div/center/form/div/div"));
        downloadclick.click();
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[1]/center/a[1]"))).click();
        WebElement soundprocess = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/center/a[1]"));
        String downloadprep= soundprocess.getAttribute("onclick");
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(downloadprep);
        String downloadparam = "";
        if (matcher.find()) {
            downloadparam = matcher.group(1);
        }
        String[] lastprep = downloadparam.split(",");
        String holder = lastprep[0];
        String FILE_URL= holder;
        String test = FILE_URL.substring(1, FILE_URL.length()-1);
        this.clouddownload = holder;


    }



}