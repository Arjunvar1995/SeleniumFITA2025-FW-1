package redBus.pageObjects;

import org.openqa.selenium.By;
import redBus.abstractComponents.abstractComponents;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends abstractComponents{
	
	WebDriver driver;
	
	public homePage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(xpath="//div[text()='From']")
	WebElement fromLocationTextBox;
	
	@FindBy(xpath="//input[@id='srcDest']")
	WebElement fromLocationSendKeys;
	
	@FindBy(xpath="//div[text()='Koyambedu, Chennai']")
	WebElement fromLocationClick;
	
	@FindBy(xpath="//div[text()='Bangalore']")
	WebElement toLocationClick;
	
	@FindBy(xpath="//span[text()='Date of Journey']")
	WebElement dataDropdownClick;
	
	@FindBy(xpath="//span[text()='30']")
	WebElement dateClick;
	
	@FindBy(xpath="//button[text()='Search buses']")
	WebElement searchBusesButton;
	
	public void busSearchAction(String sourceLocation) {
		
		fromLocationTextBox.click();
		fromLocationSendKeys.sendKeys(sourceLocation);
		fromLocationClick.click();
		toLocationClick.click();
		dataDropdownClick.click();
		dateClick.click();
		searchBusesButton.click();
		
	}

}
