package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		//driver.navigate().to("https://www.flipkart.com");
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.navigate().forward();
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		

	}

}
