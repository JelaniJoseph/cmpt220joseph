package com.jello.urlconverter;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Scrapper {

    public void testWebsite() throws IOException {

        WebDriverManager.chromedriver().version("81.0.4044.138").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mp3downy.com/MP3-converter?apikey=1234567890");
        WebElement inputonweb = driver.findElement(By.id("txtUrl"));
        inputonweb.sendKeys("https://www.youtube.com/watch?v=s85jNzBNdpA");
        WebElement downloadbutton = driver.findElement(By.id("btnDownload"));
        downloadbutton.click();

//            downloadbutton.wait(10000);
//        WebElement finalbutton = driver.findElement(By.id("downloadButton"));
//        WebDriverWait wait = new WebDriverWait(driver,30);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("downloadButton")));
        driver.findElement(By.id("downloadButton")).click();
        System.out.println(driver.getPageSource());


//        driver.findElement(By.xpath("//*[@id=\"downloadButton\"]")).click();
//        finalbutton.click();

    }

    public static void main(String[] args) throws IOException {
        Scrapper scrapper = new Scrapper();
        scrapper.testWebsite();

    }

}
