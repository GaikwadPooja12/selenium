package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingEx2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for(String win:allIds)
		{
			if(!mainId.equals(win))
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//button[text()='click']")).click();
			}
	
		}
	}
}
