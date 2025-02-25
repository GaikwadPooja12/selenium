package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramePopupEx1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
	     WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	     WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));                                                                                                                                                                                                                                                                                                                 
	     Actions act=new Actions(driver); 
	     act.dragAndDrop(drag, drop).perform();
		
		
	}

}
