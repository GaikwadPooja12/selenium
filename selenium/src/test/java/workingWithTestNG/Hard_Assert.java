package workingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hard_Assert {
	
	@Test
	
	public void testCase()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		Assert.assertEquals(driver.getTitle(),"Google");
		System.out.println("Navigated to Google Page");
		
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		
		Assert.assertEquals(driver.getTitle(),"Selenium - Google Search");
	    System.out.println("searching Selenium : Result Found");
	    Reporter.log("searching Selenium : Result Found");
	}
	

}
