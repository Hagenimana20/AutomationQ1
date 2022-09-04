package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.HomePagePage;
import util.BrowserFactory;

public class HomePageTest {

	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToAddAndRemoveItems() {
		
		 driver = BrowserFactory.init();
		 HomePagePage homepage = PageFactory.initElements(driver, HomePagePage.class);
		 homepage.addItems();
		 homepage.checkToggleAllBox();
		 homepage.selectAndRemoveSingleItem();
		 homepage.selectAndRemoveAllItems();
		 BrowserFactory.tearDown();
		
		
	}
	
}
