package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com");
		
		Actions act = new Actions(driver);
		act.moveByOffset(30, 20).click().perform();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		 //Thread.sleep(1000);

		//driver.findElement(By.xpath("//div[text()='May 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='25']")).click();
     
		String month = "June 2024";
		String date = "5";
		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();


}
}
