package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePage extends BasePage {

	WebDriver driver;
	
	public HomePagePage (WebDriver driver) {
		this.driver=driver;
	}	
	
	@FindBy (how = How.XPATH, using ="//input[@name='data']")WebElement FIRST_ITEM_ELEMENT;
	@FindBy (how = How.XPATH, using ="//input[@name='data']")WebElement SECOND_ITEM_ELEMENT;
	@FindBy (how = How.XPATH, using ="//input[@name='data']")WebElement THIRD_ITEM_ELEMENT;
	@FindBy (how = How.XPATH, using ="//input[@name='submit'][@value='Add']")WebElement ADD_BUTTON_ELEMENT;
	@FindBy (how = How.XPATH, using ="//input[@name='allbox']")WebElement TOGGLE_ALL_CHECK_BOX_ELEMENT;
	@FindBy (how = How.XPATH, using ="//input[@name='todo[1]']")WebElement CHECK_SINGLE_ITEM_ELEMENT;
	@FindBy (how = How.XPATH, using ="//input[@name='submit'][@value='Remove']")WebElement REMOVE_SIGNLE_ITEM_ELEMENT;
	@FindBy (how = How.XPATH, using ="//input[@name='submit'][@value='Remove']")WebElement REMOVE_ALL_ITEM_ELEMENT;	
		
	
	public void addItems() {
		FIRST_ITEM_ELEMENT.sendKeys("Kigali" +generateRandomNumber(99));
		ADD_BUTTON_ELEMENT.click();
		SECOND_ITEM_ELEMENT.sendKeys("Butare"+ generateRandomNumber(99));
		ADD_BUTTON_ELEMENT.click();
		THIRD_ITEM_ELEMENT.sendKeys("Rusizi"+ generateRandomNumber(99));
		ADD_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void checkToggleAllBox () {
		
		TOGGLE_ALL_CHECK_BOX_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
	
	public void selectAndRemoveSingleItem() {
		TOGGLE_ALL_CHECK_BOX_ELEMENT.click();
		CHECK_SINGLE_ITEM_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		REMOVE_SIGNLE_ITEM_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
	
	public void selectAndRemoveAllItems()  {
		TOGGLE_ALL_CHECK_BOX_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		REMOVE_ALL_ITEM_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
