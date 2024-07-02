package workingWithTestNG;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookTestCase02 extends BaseTest {
	
	@Test
	
	public void bookTestCase02() throws Exception
	{
		 driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	    String bk = driver.findElement(By.xpath("//a[text()='Fiction EX']")).getText();
	    System.out.println(bk);
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	    driver.close();
	
	    
	     
	}

}
