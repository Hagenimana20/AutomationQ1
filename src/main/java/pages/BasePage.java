package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;
	
	int randomNumber;
	
	public int generateRandomNumber(int boundary) {
		
		Random randomItem = new Random();
		randomNumber= randomItem.nextInt(boundary);
		return randomNumber;
	}
	
	
}
