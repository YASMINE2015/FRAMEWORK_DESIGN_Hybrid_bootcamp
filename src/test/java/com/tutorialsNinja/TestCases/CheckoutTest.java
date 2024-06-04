package com.tutorialsNinja.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialsNinja.TestBase.TestBase;
import com.tutorialsNinja.TestData.ExcelCode;


public class CheckoutTest extends TestBase {


	public CheckoutTest() throws Exception {
		super();
		
	}


	public WebDriver driver;
    

    @BeforeMethod
    public void registerSetup() {
        driver.get("https://tutorialsninja.com/demo");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Checkout")).click();
    }

	
	

	@Test(priority=1, dataProvider = "TNCheckout", dataProviderClass = ExcelCode.class)
	public void verifyCheckoutWithDetails(String firstname, String lastname, String address1, String city, String postcode, String country, String State) {
	
		    driver.findElement(By.id("shipping-firstname")).sendKeys("firstname");
		    driver.findElement(By.id("shipping-lastname")).sendKeys("lastname");

		    driver.findElement(By.id("shipping-address")).sendKeys("adress1");
		    driver.findElement(By.id("shipping-city")).sendKeys("city");
		    driver.findElement(By.id("shipping-postcode")).sendKeys("postcode");
		    driver.findElement(By.id("shipping-country")).sendKeys("country");
		    driver.findElement(By.id("shipping-zone")).sendKeys("state"); 
            driver.findElement(By.id("button-continue")).click();
            
            
        	driver.findElement(By.id("button-payment-method")).click();
	        driver.findElement(By.id("button-shipping-method")).click();
    	    driver.findElement(By.id("shipping-method")).click();
            driver.findElement(By.id("button-shipping-method")).click();

             Assert.assertTrue(driver.findElement(By.cssSelector("div#shipping-method")).isDisplayed(), "Shipping method step not displayed");
}


	@Test(priority=2)
	public void verifycheckoutWithNoDetails() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualFirstNameWarningMessage = driver.findElement(By.cssSelector("input#input-shipping-firstname+div")).getText();
		String expectedFirstNameWarningMessage = dataProp.getProperty("firstNameWarning");
		Assert.assertTrue(actualFirstNameWarningMessage.contains(expectedFirstNameWarningMessage));
		
		
		String actualLastNameWarningMessage = driver.findElement(By.cssSelector("input#input-shipping-lastname+div")).getText();
		String expectedLastNameWarningMessage = dataProp.getProperty("lastNameWarning");
		Assert.assertTrue(actualLastNameWarningMessage.contains(expectedLastNameWarningMessage));

		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = dataProp.getProperty("privacyPolicyWarning");
		Assert.assertEquals(actualPrivacyPolicyWarningMessage, expectedPrivacyPolicyWarningMessage);

		
		
		String actualAddress1WarningMessage = driver.findElement(By.cssSelector("input#input-shipping-address-1+div")).getText();
		String expectedAddress1WarningMessage = dataProp.getProperty("invalidAddress1Warning");
		Assert.assertTrue(actualAddress1WarningMessage.contains(actualAddress1WarningMessage));

		String actualPostCodeWarningMessage = driver.findElement(By.cssSelector("input#input-shipping-postcode+div")).getText();
		String expectedPostCodeWarningMessage = dataProp.getProperty("PostCodeWarning");
		Assert.assertEquals(actualPostCodeWarningMessage,actualPostCodeWarningMessage);

		String actualStateWarningMessage = driver.findElement(By.cssSelector("input#input-shipping-zone+div")).getText();
		String expectedStateWarningMessage = dataProp.getProperty("StateWarning");
		Assert.assertTrue(actualStateWarningMessage.contains(expectedStateWarningMessage));
		
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
