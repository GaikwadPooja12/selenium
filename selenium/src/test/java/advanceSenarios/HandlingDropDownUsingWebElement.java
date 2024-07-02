package advanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingWebElement {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//option[text()='10']")).click();
		driver.findElement(By.xpath("//option[text()='Dec']")).click();
		driver.findElement(By.xpath("//option[@value='2010']")).click();
	}

}
