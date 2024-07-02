package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketEx {

	public static void main(String[] args) throws Throwable {
	
		{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bigbasket.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("mangoes",Keys.ENTER);
		
	Thread.sleep(1000);
	String name = driver.findElement(By.xpath("//a[@href=\"/pd/10000302/fresho-alphonso-mango-badami-1-kg/?nc=cl-prod-list&t_pos_sec=1&t_pos_item=3&t_s=Alphonso+Mango+-+Badami\"]")).getText();
		System.out.println(name);
		
		}

	

	}

}
