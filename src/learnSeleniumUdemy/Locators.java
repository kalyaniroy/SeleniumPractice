package learnSeleniumUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{	System.setProperty("webdriver.chrome.driver","C:\\Downloads\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("KalyaniRoy");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Kalyani Roy");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Kalyani.roy@gmail.com");
		
		
	}

}
