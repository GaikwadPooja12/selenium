package advanceSenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
//org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardStrokes {

	public static void main(String[] args) throws Throwable 
	{
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
       
        //Keys Class Ex
 //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma",Keys.ENTER);
	
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("bluetooth");
        
        Robot rob = new Robot();
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
        
	
	}

}
