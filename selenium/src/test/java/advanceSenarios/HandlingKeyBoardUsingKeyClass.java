package advanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardUsingKeyClass {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		//Normal Approach
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		
		//case1
	       /* driver.findElement(By.id("user-name")).sendKeys("standard_user");
	       WebElement PassWord = driver.findElement(By.id("password"));
	        PassWord.sendKeys("secret_sauce",Keys.ENTER);*/
	        
	        //or
	        //case2:-
	     /*   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);*/
	        
	        //case3:-
	    /*    WebElement UserName = driver.findElement(By.id("user-name"));
	        UserName.sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);*/
		
	        //case4:-
	        driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
	}

}
