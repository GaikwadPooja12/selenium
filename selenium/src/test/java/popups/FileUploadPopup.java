package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Admin\\Documents\\hello.txt");
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		
	}

}
