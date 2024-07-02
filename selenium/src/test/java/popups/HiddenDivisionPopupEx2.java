package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopupEx2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		
		Actions act = new Actions(driver);
		act.moveByOffset(30, 20).click().perform();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		
		
	}

}
