package RedBus.test;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
public class E2EBusTicketFlow {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(@class,'labelCityWrapper')]")).click();
		
		driver.findElement(By.xpath("//input[@id='srcDest']")).sendKeys("Chennai");
		
		/*driver.findElement(By.xpath("//div[contains(@class,'labelCityWrapper')]"))
		
		driver.findElement(By.xpath("//*[text()='Koyambedu']")).click();
		
		driver.findElement(By.xpath("//div[@class='suggestionsWrapper__440585']")).
		
		driver.findElement(By.xpath("//text[text()='CMBT, Chennai']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//text[text()='Madiwala']")).click();
		
		driver.findElement(By.xpath("//span[text()='29']")).click();
		
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='clearfix bus-item  ']")));
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		int i=0;
		
		outer:
		while(i<50) {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			
			List<WebElement> busLists=driver.findElements(By.xpath("//div[@class='clearfix bus-item  ']"));
			
			inner:
			for(int j=1;j<busLists.size();j++) {
				
				if(driver.findElement
						(By.xpath("(//div[@class='clearfix bus-item  '])["+j+"]/div[1]/div[1]/div[1]/div[1]")).
						getText().equalsIgnoreCase("FlixBus")) {
					
					System.out.println("Found FlixBus.");
					
					if(driver.findElement(By.xpath("//i[@class='icon-close coach-close']")).isDisplayed()) {
						
						System.out.println("got into the if");
						//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Ok, got it']")));
						Thread.sleep(3000);
						driver.findElement(By.xpath("//i[@class='icon-close coach-close']")).click();
						
					}
					
					driver.findElement(By.xpath("(//div[text()='View Seats'])["+j+"]")).click();
					
					break outer;				
										
				}
				
			}
			
			i++;
			
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//canvas[@data-type='lower']")));
		
		WebElement canvas=driver.findElement(By.xpath("//canvas[@data-type='lower']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(canvas, 95, 58).click().build().perform();  //175,58
		
		driver.findElement(By.xpath("(//div[@class='radio-css '])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='radio-css '])[13]")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed to book']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Arjun");
		
		driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("29");
		
		//driver.findElement(By.xpath("//label[text()='Male']")).click();
		//Above is what we gave in the class, but that did not work. So modified it to the below to select the gendaer
		
		driver.findElement(By.xpath("//div[@class='gender_position_abs ']")).click();
		
		driver.findElement(By.xpath("//input[@role='presentation']")).click();
		
		driver.findElement(By.xpath("//li[@value='Tamil Nadu']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("arjun@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9655623012");
		
		driver.findElement(By.xpath("//label[text()='Don’t add redBus Assurance']")).click();
		
		driver.findElement(By.xpath("//input[@value='Proceed to pay']")).click();*/
				
	}

}
