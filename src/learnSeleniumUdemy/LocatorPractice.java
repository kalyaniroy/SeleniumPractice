package learnSeleniumUdemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args) throws InterruptedException 
	{	   WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver","C:\\Downloads\\Driver\\chromedriver.exe");
	
		      String url = "https://www.google.com";
		      driver.get(url);
		      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		      driver.get("https://www.google.com");
	}
}


