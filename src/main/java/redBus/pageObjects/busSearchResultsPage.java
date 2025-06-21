package redBus.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import redBus.abstractComponents.abstractComponents;

public class busSearchResultsPage extends abstractComponents{
	
	WebDriver driver;
	
	public busSearchResultsPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[text()='Departure time']")
	WebElement sortByDeparture;
	
	@FindBy(xpath="//div[contains(@class,'travelsName___')]")
	List<WebElement> busListsPF;
	
	public void sortByDepartureAction() {
		
		sortByDeparture.click();
		
	}
	
	public void scrollingAndFindingBusAction(String busName, int x, int y) throws InterruptedException {
		
		Thread.sleep(1500);
		
		int i=0;
		
		outer:
		while(i<500) {
			
			javaScriptExecutor("window.scrollBy("+x+","+y+")");
			
			List<WebElement> busLists=busListsPF;
			
			int index=1;
			
			inner:
			for(WebElement busList:busLists) {
				
				if(busList.getText().equalsIgnoreCase(busName)) {
					
					System.out.println("Found "+busName);
					
					Thread.sleep(1500);
					javaScriptExecutorScrollToView("arguments[0].scrollIntoView(false);",busList);
					
					driver.findElement(By.xpath("(//button[text()='View seats'])["+index+"]")).click();
					
					break outer;
					
				}
				
				index++;
				
			}
			
			i++;
			
		}
		
	}

}
