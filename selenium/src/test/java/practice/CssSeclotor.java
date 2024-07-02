package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSeclotor {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.cssSelector("[data-csa-c-content-id='nav_cs_home']")).click();
	}

}
