package workingWithTestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApprelTestCase01 extends BaseTest{

	@Test
	
	public void apprelTestCase() throws Exception {
		
	
	
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Blue Jeans");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	    driver.close();
	
		
	}

}
