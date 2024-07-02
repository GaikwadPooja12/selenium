package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alt = driver.switchTo().alert();
		//alt.accept();
		System.out.println(alt.getText()); */
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Good Afternoon");
		alt.accept();
		
		

	}

}
