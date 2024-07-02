package workingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

		@Test
		
		public void testCase()
		{
			
			SoftAssert sa = new SoftAssert();
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			
			sa.assertEquals(driver.getTitle(),"123");
			Reporter.log("Navigated to Google Page",true);
			
			driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
			
			sa.assertEquals(driver.getTitle(),"Selenium - Google Search");
		    //System.out.println("searching Selenium : Result Found");
		    Reporter.log("searching Selenium : Result Found",true);
		    
		    driver.close();
		    sa.assertAll();
		    }

		

	}

