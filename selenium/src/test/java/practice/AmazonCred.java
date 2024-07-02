package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCred {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.amazon.in/");
        //driver.findElement(By.name("field-keywords")).sendKeys("puma");
        //driver.findElement(By.id("nav-search-submit-button")).click();
        //driver.findElement(By.linkText("Amazon miniTV")).click();
	    //driver.findElement(By.linkText("Best Sellers")).click();
	    //driver.findElement(By.partialLinkText("Today's D")).click();
	    //driver.findElement(By.partialLinkText("Amazon m")).click();
	    //driver.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("Bluetooth");
	    //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("bluetooth");
	    //driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bluetooth");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    String name = driver.findElement(By.xpath("//span[text()='pTron Bassbuds NX TWS Earbuds with HD Mic, TruTalk AI-ENC Calls, 32H Playtime, 13mm Drivers, Bluetooth 5.3 Wireless Headphones, Voice Assistant, Type-C Fast Charging & IPX5 Water Resistant (Brown)']")).getText();
	    System.out.println(name);
	
	}
	
	
	

}
