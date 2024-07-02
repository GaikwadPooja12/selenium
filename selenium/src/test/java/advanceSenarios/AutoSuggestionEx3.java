package advanceSenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import practice.WebElementMethod;

public class AutoSuggestionEx3 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		 driver.findElement(By.name("q")).sendKeys("Nike");
		 
		     Thread.sleep(1000);
		       List<WebElement> allNames = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li")); 
		       Thread.sleep(1000);
		      for (WebElement name : allNames)
		      {
				System.out.println(name.getText());
				if(name.getText().contains("nike sneakers"))
				{
					
					name.click();
				}
			}
	}

}
