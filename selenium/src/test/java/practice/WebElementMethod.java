package practice;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
        //driver.get("https://www.amazon.in");
        //WebElementMethod search=(WebElementMethod) driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        //((WebElement) search).sendKeys("puma");
        //((WebElement) search).submit();
        
        /*WebElement ele = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        org.openqa.selenium.Point loc = ele.getLocation();
        System.out.println(loc.getX());
        System.out.println(loc.getY());
        
        System.out.println(ele.getSize().getHeight());
        System.out.println(ele.getSize().getWidth());
        
        System.out.println(ele.getRect().getX());
        System.out.println(ele.getRect().getY());
        System.out.println(ele.getRect().getHeight());
        System.out.println(ele.getRect().getWidth());*/
        
       /* WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo sprits']"));
        
        if(logo.isDisplayed())
        {
        	System.out.println("logo is displayed");
        }
        else
        {
        	System.out.println("logo not displayed");
        }*/
        
       /* WebElement search=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        
        if(search.isEnabled())
        {
        	search.sendKeys("Nike");
        }
        else
        {
        	System.out.println("element is not enables");
        }*/
        
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("a[text='Create new account']"));
        
        Thread.sleep(1000);
        
        WebElement radio=driver.findElement(By.xpath("//input[@value='1']"));
        
		radio.click();
		if(radio.isSelected())
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("radio button is not selected");
		}
        
	}

	

	

}
