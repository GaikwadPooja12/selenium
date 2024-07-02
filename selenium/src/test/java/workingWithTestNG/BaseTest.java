package workingWithTestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class BaseTest {
	DataUtility Data1=new DataUtility();
	static WebDriver driver;
	
	@BeforeClass
	public void launchTheBrowser() throws IOException
	{

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(Data1.getDataFromProperties("url"));
	
	}
	
	@BeforeMethod
	public void performLogin() throws IOException
	{
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.id("Email")).sendKeys(Data1.getDataFromProperties("email"));
	driver.findElement(By.id("Password")).sendKeys(Data1.getDataFromProperties("password"));
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
	
	@AfterMethod
	public void performLogout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}


}
