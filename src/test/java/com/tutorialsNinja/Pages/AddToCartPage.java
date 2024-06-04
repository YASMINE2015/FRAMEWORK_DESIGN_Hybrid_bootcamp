package com.tutorialsNinja.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	@FindBy(css = "hidden-xs hidden-sm hidden-md\")")
	private WebElement addToCartButton;


	@FindBy(xpath = "//p[text() = 'There is no product that matches the search criteria.']")
	private WebElement cartIconLocator;


	private WebDriver driver;

	

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void AddToCart()  {
	 ((WebElement) driver.findElements(By.id("button-cart"))).click();
	}


	public int getCartItemCount() {
		
		return 0;
	}

}
