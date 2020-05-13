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

import java.io.IOException;
import java.net.URL;


public class Soundcloudscrapper {
    URL soundscrape;
    String clouddownload;

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

//    https://soundcloudtomp3.app/

    // Method to simulate automation and return soundcloud downloadable link
    public void soundScrape()throws IOException {
        Userinput userinput = new Userinput();
        WebDriverManager.chromedriver().version("81.0.4044.138").setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://soundcloudtomp3.app/");
        WebElement inputbox = driver.findElement(By.xpath("/html/body/div[2]/div/center/form/div/input"));
        inputbox.sendKeys(String.valueOf(this.soundscrape));
        WebElement downloadclick = driver.findElement(By.id("fd"));
        downloadclick.click();
        WebDriverWait wait = new WebDriverWait(driver, 50);
        WebElement soundprocess = driver.findElement(By.xpath("//*[@id=\"dlMP3\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dlMP3\"]"))).click();
        String downloadprep= soundprocess.getAttribute("onclick");
        this.clouddownload = downloadprep.substring(63, downloadprep.length() - 25);
        System.out.println(this.clouddownload);

    }

}