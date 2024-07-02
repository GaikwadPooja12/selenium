package advanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement DateList =driver.findElement(By.cssSelector("[aria-label='Day']"));
		Select sel = new Select(DateList);
		//sel.selectByIndex(17);
		sel.selectByVisibleText("10");
		Thread.sleep(2000);
		
		WebElement monthlist=driver.findElement(By.name("birthday_month"));
		Select sele=new Select(monthlist);
		//sele.selectByIndex(9);
		sele.selectByVisibleText("Jun");
		Thread.sleep(2000);
		
		WebElement Yearlist=driver.findElement(By.name("birthday_year"));
		Select selec= new Select(Yearlist);
		selec.selectByIndex(3);
		//selec.selectByValue("1994");
		//selec.selectByVisibleText("2000");
		
		
		
		
	}

}
