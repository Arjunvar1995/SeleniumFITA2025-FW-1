package redBus.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import redBus.abstractComponents.abstractComponents;

public class busAndPassengerDetailsPage extends abstractComponents{
	
	WebDriver driver;
	
	public busAndPassengerDetailsPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[@id='4UB']")
	WebElement seatSelection;
	
	@FindBy(xpath="//button[text()='Select boarding & dropping points']")
	WebElement boardDropClick;
	
	@FindBy(xpath="(//label[contains(@class,'customRadio___')])[1]")
	WebElement boardingPoint;
	
	@FindBy(xpath="(//label[contains(@class,'customRadio___')])[24]")
	WebElement droppingPoint;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement enterEmail;
	
	@FindBy(xpath="//input[@placeholder='Phone']")
	WebElement enterPhone;
	
	@FindBy(xpath="//label[text()='State of Residence']//following-sibling::input")
	WebElement stateDD;
	
	@FindBy(xpath="//div[text()='Tamil Nadu']")
	WebElement stateSelection;
	
	@FindBy(xpath="//input[@placeholder='Enter your Name']")
	WebElement enterName;
	
	@FindBy(xpath="//input[@placeholder='Enter Age']")
	WebElement enterAge;
	
	@FindBy(xpath="//label[text()='Male']")
	WebElement genderSelection;
	
	@FindBy(xpath="//div[text()='Don’t add redBus Assurance']")
	WebElement assuranceCheckBox;
	
	@FindBy(xpath="//button[text()='Continue booking']")
	WebElement continueBookingButton;
	
	public void selectingBusDetailsAction() {
		
		seatSelection.click();
		boardDropClick.click();
		boardingPoint.click();
		droppingPoint.click();
		
	}
	
	public void enteringPassengerDetailsAction(String email, String phoneNum, String name, String age) {
		
		enterEmail.sendKeys(email);
		
		enterPhone.sendKeys(phoneNum);
		
		stateDD.click();
				
		stateSelection.click();
				
		enterName.sendKeys(name);
		
		enterAge.sendKeys(age);
		
		genderSelection.click();
		
		assuranceCheckBox.click();
		
		continueBookingButton.click();
		
	}

}
