package framework;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FetchingDataFromPropertiesFile {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
	/*	driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(http://By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(http://By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(http://By.id("login-button")).click();*/
		
		//step1:- path connection
FileInputStream fis = new FileInputStream("./PropertiesData.properties");
        //step2:-reading data from properties file
Properties pro = new Properties();
pro.load(fis);
String URL = pro.getProperty("url");
String USERNAME = pro.getProperty("username");
String PASSWORD = pro.getProperty("password");

driver.get(URL);
driver.findElement(By.id("user-name")).sendKeys(USERNAME);
driver.findElement(By.id("password")).sendKeys(PASSWORD);
driver.findElement(By.id("login-button")).click();


	}

}
