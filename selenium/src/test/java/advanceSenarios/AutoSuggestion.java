package advanceSenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma");
		Thread.sleep(1000);
List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	
		Thread.sleep(1000);
		for (WebElement ele : allSugg) 
		{
			System.out.println(ele.getText());
			String ActData = ele.getText();
			
			if(ActData.contains("puma sneakers for men"))
			{
				ele.click();
			}
		}
	}

}
