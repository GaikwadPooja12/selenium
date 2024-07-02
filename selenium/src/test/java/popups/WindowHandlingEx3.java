package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingEx3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Set<String> allWins = driver.getWindowHandles();
		System.out.println(allWins);
		
		for(String win:allWins)
		{
			driver.switchTo().window(win);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("selenium"))
			{
				break;
			}
		}
		
		driver.findElement(By.xpath("//a[text()='Learn more & submit']")).click();

		Set<String> allWins1 = driver.getWindowHandles();
		System.out.println(allWins1);
		
		for(String win1:allWins1)
		{
			driver.switchTo().window(win1);
			String title1=driver.getTitle();
			System.out.println(title1);
			if(title1.contains("Submit a Proposal - Selenium Conf 2024"))
			{
				break;
			}
		}
		
		Actions act = new Actions(driver);
		act.moveByOffset(30, 10).click().perform();
		driver.findElement(By.xpath("//a[text()='Register Now']")).click();
		
		//driver.close();
		//driver.quit();
		
		Set<String> allWins2 = driver.getWindowHandles();
		System.out.println(allWins2);
		
		for(String win2:allWins2)
		{
			driver.switchTo().window(win2);
			String title2=driver.getTitle();
			System.out.println(title2);
			if(title2.contains("Frames & windows"))
			{
				break;
			}
		}
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		driver.close();
	}

}

