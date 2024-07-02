package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		//driver.findElement(By.cssSelector("[type='text']")).sendKeys("Bluetooth");
		//driver.findElement(By.cssSelector("[aria-label='Search for Products, Brands and More']")).click();
        //driver.findElement(By.cssSelector("[src='https://rukminim2.flixcart.com/image/612/612/xif0q/headphone/c/2/u/-original-imagxn9byqwpvgzh.jpeg?q=70']")).click();
        //driver.findElement(By.xpath("//a[@aria-label='Grocery']")).click();	
        driver.findElement(By.xpath("//span[text()='Grocery']")).click();
	
	
	
	
	
	
	
	}

}
