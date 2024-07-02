package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramePopupEx2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
	
		//switching frames using Index
		//driver.switchTo().frame(1);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		
		//Switching frames using id Attribute
		//driver.switchTo().frame("singleframe");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
				
				
		//Switching frames using name Attribute
		//driver.switchTo().frame("singleframe");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bye");
			
		//Switching frames using WebElement
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Good Morning");
			
	}

}
