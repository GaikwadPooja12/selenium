package advanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement DateList =driver.findElement(By.cssSelector("[aria-label='Day']"));
		DateList.click();
		
		Thread.sleep(1000);
		DateList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		DateList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);

	}

}
