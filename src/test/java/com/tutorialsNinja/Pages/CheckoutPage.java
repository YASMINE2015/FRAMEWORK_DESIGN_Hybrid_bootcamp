package com.tutorialsNinja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CheckoutPage {


	public WebDriver driver; 
    

@FindBy(id = "input-shipping-firstname")
private WebElement txtbx_FirstName;

@FindBy(id = "input-shipping-lastname")
private WebElement txtbx_LastName;

@FindBy(id ="input-shipping-company")
private WebElement txtbx_company;

@FindBy(id ="input-shipping-address1")
private WebElement txtbx_address1;

@FindBy(id ="input-shipping-address2")
private WebElement txtbx_address2;


@FindBy(id ="input-shipping-city")
private WebElement txtbx_city;


@FindBy(id ="input-shipping-postcode")
private WebElement txtbx_postcode;


@FindBy(id ="input-shipping-country")
private WebElement txtbx_country;


@FindBy(id ="input-shipping-zone")
private WebElement txtbx_state;

@FindBy(id = "button_paymengt-address")
private WebElement continuebutton;

@FindBy(id = "button-shipping-address")
private WebElement checkbox_delivery ;

@FindBy(id = "button_shipping-address")
private WebElement continuebutton1;


@FindBy(id = "button-shipping-method")
private WebElement checkbox_deliveryMethod;

@FindBy(xpath ="//a[@class = 'agree']")
private WebElement chkbx_AcceptTermsAndCondition;

@FindBy(id = "button_payment-method")
private WebElement continuebutton2;

@FindBy(id = "button-confirm")
private WebElement  confirmOrder;


public  CheckoutPage (WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
 }
	public void enterFirstname (String firstname) {
	txtbx_FirstName.sendKeys(firstname);
	
	}
	
	public void enterlastname (String Lastname) {
	txtbx_LastName.sendKeys(Lastname);
	}	
	public void enter_company(String company) {
	txtbx_company.sendKeys(company);
	}
	public void enter_address1(String address1) {
	txtbx_address1.sendKeys(address1);
	}			
	public void enter_address2(String address2) {
		txtbx_address2.sendKeys(address2);
	}				
     				
	public void enter_postcode(String postcode) {
		txtbx_postcode.sendKeys(postcode);
	
}
	public void enter_city(String country) {
		txtbx_country.sendKeys(country);
     }
	public void enter_state(String state) {
		txtbx_state.sendKeys(state);
}
	public void clickOnContinueButton() {
		continuebutton.click();
	}
	public void enter_delivery(String delivery) {
		checkbox_delivery.sendKeys(delivery);
	}
		public void clickOnContinueButton1() {
			continuebutton1.click();	
	
}
	public void enter_deliverymethod(String deliverymethod) {
		checkbox_deliveryMethod.sendKeys(deliverymethod);
	}
	public void enter_AcceptTermsAndCondition(String AcceptTermsAndCondition  ) {
		chkbx_AcceptTermsAndCondition.sendKeys(AcceptTermsAndCondition);
}
	public void clickOnContinueButton2() {
		continuebutton2.click();
	}
	public void enter_confirmOrder() {
	confirmOrder.click();
}
	
	public String retrievePrivacyPolicyWarningMessage(WebElement privacyPolicyWarningMessage) {
		String text = privacyPolicyWarningMessage.getText();
		return text;
	}

	public String retrieveFirstnameWarningMessage(WebElement firstnameWarningMessage) {
		String text = firstnameWarningMessage.getText();
		return text;
	}

	public String retrieveLastnameWarningMessage(WebElement lastnameWarningMessage) {
		String text = lastnameWarningMessage.getText();
		return text;
	}

	public String retrievecompanhyWarningMessage(WebElement company) {
		String text = company.getText();
		return text;
	}

	public String retrieveAddress1WarningMessage(WebElement Address1WarningMessage) {
		String text = Address1WarningMessage.getText();
		return text;
	}


	public String retrievecityWarningMessage(WebElement cityWarningMessage) {
		String text = cityWarningMessage.getText();
		return text;
	}

	public String retrievePostcodeWarningMessage(WebElement postcodeWarningMessage) {
		String text = postcodeWarningMessage.getText();
		return text;
	}

	public String retrieveWrongcountryWarningMessage(WebElement wrongCountryWarningMessage) {
		String text = wrongCountryWarningMessage.getText();
		return text;
	}

	public AccountPage combiningMandatoryDetailsToNavigateToAccountSuccessPage(String firstnameText, 
			  String firstname 	,String lastname, String company, String address1, String address2, String postcode, String country,
				String state,String continuebutton, String delivery, String continueButton,
				String deliverymethod , String AcceptTermsAndCondition,  
				String continuebutton2 , String confirmOrder ) 
			{ 
		
		


		txtbx_FirstName.sendKeys(firstname);
		txtbx_LastName.sendKeys(lastname);
	    txtbx_company.sendKeys(company);
		txtbx_address1.sendKeys(address1);
		txtbx_address2.sendKeys(address2);
		txtbx_postcode.sendKeys(postcode);
		txtbx_country.sendKeys(country);
	    txtbx_state.sendKeys(state);
	    
		checkbox_delivery.sendKeys(delivery);
		 continuebutton1.click();	
	     checkbox_deliveryMethod.sendKeys(deliverymethod);
		chkbx_AcceptTermsAndCondition.click();
		 enter_confirmOrder();
		
		
		return new AccountPage(driver);
	}

	public AcountSuccessPage combiningAllDetailsToNavigateToAccountSuccessPage(String firstnameText, 
		  String firstname 	,String lastname, String company, String address1, String address2, String postcode, String country,
		String state,String continuebutton, String delivery, String continueButton1,
		String deliverymethod , String AcceptTermsAndCondition,  
		String continuebutton2 , String confirmOrder ) 
	{


		txtbx_FirstName.sendKeys(firstname);
		txtbx_LastName.sendKeys(lastname);
	    txtbx_company.sendKeys(company);
		txtbx_address1.sendKeys(address1);
		txtbx_address2.sendKeys(address2);
		txtbx_postcode.sendKeys(postcode);
		txtbx_country.sendKeys(country);
	    txtbx_state.sendKeys(state);
	    checkbox_delivery.sendKeys(delivery);
		 continuebutton1.click();	
	     checkbox_deliveryMethod.sendKeys(deliverymethod);
		chkbx_AcceptTermsAndCondition.click();
		 enter_confirmOrder();
		 return new AcountSuccessPage();

	}
	public boolean retrieveAllWarningMessages(String expectedPrivacyPolicyWarning, String expectedFirstNameWarning, String expectedLastNameWarning,String expectedCompanyWarning,String expectedAddress1Warning,
			String expectedAddress2Warning, String expectedPostcodeWarning, String expectedCountryWarning, String expectedStateWarning, String expectedDeliveryWarning, String expectedConfirmOrderWarning, WebElement firstnameWarningMessage, WebElement privacyPolicyWarningMessage, WebElement lastnameWarningMessage, WebElement companyWarningMessage, WebElement address1WarningMessage, WebElement address2WarningMessage, WebElement postcodeWarningMessage, WebElement countryWarningMessage, WebElement stateWarningMessage, WebElement confirmOrderWarningMessage, WebElement deliveryWarningMessage1) {
   

		boolean privacyPolicyWarningStatus = privacyPolicyWarningMessage.getText().contains(expectedPrivacyPolicyWarning);
		boolean firstNameWaningStatus = firstnameWarningMessage.getText().contains(expectedFirstNameWarning);
		boolean lastNameWarningStatus = lastnameWarningMessage.getText().contains(expectedLastNameWarning);
		boolean companyWarningStatus = companyWarningMessage.getText().contains(expectedCompanyWarning);
		boolean address1WarningStatus = address1WarningMessage.getText().contains(expectedAddress1Warning);
		boolean address2WarningStatus = address2WarningMessage.getText().contains(expectedAddress2Warning);
		boolean postcodeWarningStatus = postcodeWarningMessage.getText().contains(expectedPostcodeWarning);
		boolean countryWarningStatus = countryWarningMessage.getText().contains(expectedCountryWarning);
		boolean stateWarningStatus = stateWarningMessage.getText().contains(expectedStateWarning);
		boolean deliveryWarningStatus = deliveryWarningMessage1.getText().contains(expectedDeliveryWarning);		
		boolean confirmOrderWarningStatus = confirmOrderWarningMessage.getText().contains(expectedConfirmOrderWarning);
				
		return privacyPolicyWarningStatus && firstNameWaningStatus && lastNameWarningStatus && companyWarningStatus && address1WarningStatus
				&& address2WarningStatus && postcodeWarningStatus && countryWarningStatus && stateWarningStatus && deliveryWarningStatus && confirmOrderWarningStatus;
				
			
	}
}
