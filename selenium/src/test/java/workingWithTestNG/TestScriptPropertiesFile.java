package workingWithTestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptPropertiesFile {

	public static void main(String[] args) throws IOException {
		DataUtility data=new DataUtility();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data.getDataFromProperties("url"));
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(data.getDataFromProperties("email"));
		driver.findElement(By.id("Password")).sendKeys(data.getDataFromProperties("password"));
		

	}

}
