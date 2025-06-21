package redBus.abstractComponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class abstractComponents {
	
	WebDriver driver;
	
	public abstractComponents(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void javaScriptExecutor(String JSCommand) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(JSCommand);
		
	}
	
	public void javaScriptExecutorScrollToView(String JSCommand, WebElement WE) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(JSCommand,WE);
		
	}

}
