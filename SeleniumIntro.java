package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

    @Test

    public void test1(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
        searchField.sendKeys("Selenium cookbook" + Keys.ENTER);
        String googleTitle = driver.getTitle();
        System.out.println("Google search result page's title: "+ googleTitle);
    }



   @Test
    
    public void test2(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver2 = new ChromeDriver();
        driver2.get("http://www.techtorialacademy.com/");
    }



   @Test
    
    public void test3(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver3 = new ChromeDriver();
        driver3.get("https://www.cnn.com/");
    }




}
