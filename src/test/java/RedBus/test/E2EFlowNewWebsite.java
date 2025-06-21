package RedBus.test;

import java.io.IOException;
import redBus.pageObjects.homePage;
import redBus.pageObjects.busSearchResultsPage;
import redBus.pageObjects.busAndPassengerDetailsPage;
import testComponents.baseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class E2EFlowNewWebsite {
	
	@Test
	public static void busTicketBookingTC() throws InterruptedException, IOException {
		
		baseTest baseTestObject=new baseTest();
		
		WebDriver driver=baseTestObject.launchApplication("https://www.redbus.in/");
		
		homePage homePageObject=new homePage(driver);
		
		homePageObject.busSearchAction("Chennai");
		
		busSearchResultsPage busSearchResultsPageObject=new busSearchResultsPage(driver);
		
		busSearchResultsPageObject.sortByDepartureAction();
		
		busSearchResultsPageObject.scrollingAndFindingBusAction("IntrCity SmartBus",0,75);
		
		busAndPassengerDetailsPage busAndPassengerDetailsPageObject=new busAndPassengerDetailsPage(driver);
		
		busAndPassengerDetailsPageObject.selectingBusDetailsAction();
		
		busAndPassengerDetailsPageObject.enteringPassengerDetailsAction("arjun@gmail.com", "9566235588", "Arjun", "29");
		
	}

}
