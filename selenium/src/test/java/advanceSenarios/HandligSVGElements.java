package advanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandligSVGElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		driver.manage().window().maximize();
		
		//*[name()='svg' and @AttributeName='AttributeValue']
		
		driver.findElement(By.xpath("//*[name()='svg' and @class='A_8a-icon']")).click();
		
	}

}
