package com.jello.urlconverter;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;

public class YoutubeScrapper {
    String youtubelink;
    URL linktoscrape;

    public void setYoutubelink(String youtubelink) {
        this.youtubelink = youtubelink;
    }

    public void setLinktoscrape(URL linktoscrape){
        this.linktoscrape = linktoscrape;
    }

    public String getYoutubelink() {
        return youtubelink;
    }

    public URL getLinktoscrape(){
        return this.linktoscrape;
    }

    public void tubeScrape() throws IOException {
        Userinput userinput = new Userinput();
        WebDriverManager.chromedriver().version("81.0.4044.138").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://ytmp3.cc/en13/");
        WebElement inputonweb = driver.findElement(By.id("input"));
        inputonweb.sendKeys(String.valueOf(this.linktoscrape));
        WebElement downloadbutton = driver.findElement(By.id("submit"));
        downloadbutton.click();
        WebDriverWait wait = new WebDriverWait(driver, 50);
        WebElement process = driver.findElement(By.xpath("//*[@id=\"buttons\"]/a[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"buttons\"]/a[1]"))).click();
        this.youtubelink = process.getAttribute("href");

    }


}
