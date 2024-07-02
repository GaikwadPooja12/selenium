package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingEx1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		WebElement ele = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for(String win:allIds)
		{
			if(!mainId.equals(win))
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//span[text()='RESUME WRITING")).click();
			}
		}
		
		
		
		
		
	}

}
