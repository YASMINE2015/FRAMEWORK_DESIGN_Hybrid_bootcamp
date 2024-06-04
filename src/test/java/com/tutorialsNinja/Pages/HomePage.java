package com.tutorialsNinja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {

	

	public WebDriver driver;

	@FindBy(linkText = "My Account")
	private WebElement myAccountDropdown;
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;

	@FindBy(linkText = "Register")
	private WebElement registerOption;

	@FindBy(name = "search")
	private WebElement searchBox;

	@FindBy(css = "button.btn.btn-default.btn-lg")
	private WebElement SearchButton;

	
	@FindBy(css = "hidden-xs hidden-sm hidden-md")
	private WebElement AddToCart;
	
	@FindBy(css = "hidden-xs hidden-sm hidden-md")
	private WebElement Checkout;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}


	public LoginPage combiningTwoActionsToNavigateToLoginPage() {
		myAccountDropdown.click();	
		loginOption.click();
		return new LoginPage(driver);		
	}

	public RegisterPage combiningTwoActionsToNavigateToRegisterPage() {
		myAccountDropdown.click();	
		registerOption.click();
		return new RegisterPage(driver);		
	}

	public void enterProductName(String validProductText) {
		searchBox.sendKeys(validProductText);
	}

	public ProductPage clickOnSearchButton() {
		SearchButton.click();
		return new ProductPage(driver);
	}

	public ProductPage navigateToProductPage(String validProductText) {
		searchBox.sendKeys(validProductText);
		SearchButton.click();
		return new ProductPage(driver);
	}


	public AddToCartPage AddToCartPage(){
	
		searchBox.click();
		SearchButton.click();
		return new AddToCartPage(driver);	
	}


	public  CheckoutPage combiningTwoActionsToNavigateToCheckoutPage () {
		myAccountDropdown.click();	
		Checkout.click();
		return new CheckoutPage(driver);
		
	}


	
	}
