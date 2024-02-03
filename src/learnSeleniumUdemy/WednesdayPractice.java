package learnSeleniumUdemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WednesdayPractice {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Downloads\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
		driver.findElement(By.id("inputUsername")).sendKeys("kalyani");
		driver.findElement(By.name("inputPassword")).sendKeys("1234");
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("KalyaniRoy");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kaly@81.com");
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath(("//input[@type='text'][2]"))).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("kalyani.roy@gmail.com");
		

	}

}
