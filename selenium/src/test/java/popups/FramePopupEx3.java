package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramePopupEx3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/frames");
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

//Switching to Top Frame
   WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
   driver.switchTo().frame(topFrame);
    
 //Switching to Left Frame
   WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));
   driver.switchTo().frame(leftFrame);
   String left = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
   System.out.println(left);
	
   //switching to top frame using parentFrame()
	driver.switchTo().parentFrame();
	
	//switching frame using name attribute
	driver.switchTo().frame("frame-middle");
	String middle = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
	System.out.println(middle);
	
	//switching driver to main webpage
		driver.switchTo().defaultContent();
		
		//switching frame using name attribute
		driver.switchTo().frame("frame-bottom");
		String bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(bottom);
	}

}
