package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		//id()-->syntax:- AttributName-"Attribute value"
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		
		//driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
		
		//syntax 2: by using html tag
		//driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
		
		//driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
		//driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");)
		//driver.findElement(By.cssSelector("[class='btn_action']")).click();
		//driver.findElement(By.cssSelector(".btn_action")).click();
		//driver.findElement(By.cssSelector("input.btn_action")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys("standard_user");
		}

}
