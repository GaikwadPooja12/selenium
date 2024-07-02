package advanceSenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollBarUsingRobotClass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		/*Robot rob= new Robot();
		
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);*/
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			
		}
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
			
		}
		
		
		
		
		

	}

}
