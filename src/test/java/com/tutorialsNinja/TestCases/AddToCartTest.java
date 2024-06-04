package com.tutorialsNinja.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class AddToCartTest {

    public WebDriver driver;

    @BeforeClass
    public void loginSetup(CharSequence hp) {
      
       

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("benben@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Mali$ka15");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
      
	    	
    }
    @Test(priority = 1)
    public void addASingleItemToCart() {
    	driver.findElement(By.name("search")).sendKeys();
        driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
        driver.findElement(By.linkText("HP LP3065")).click();
        driver.findElement(By.id("button-cart")).click();
    }

    @Test(priority = 2)
    public void addMultipleItemsToCart() {
        driver.findElement(By.linkText("Laptops & Notebooks")).click();
        driver.findElement(By.linkText("Show All Laptops & Notebooks")).click();
        driver.findElement(By.linkText("MacBook")).click();
        driver.findElement(By.id("button-cart")).click();
    }

    @Test(priority = 3)
    public void removeTheItemFromTheCart() {
    	   driver.findElement(By.id("cart-total")).click();
           driver.findElement(By.linkText("View Cart")).click();
           driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
           driver.findElement(By.id("checkout-cart")).isDisplayed();
       }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}