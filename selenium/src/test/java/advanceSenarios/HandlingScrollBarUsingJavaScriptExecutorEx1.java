package advanceSenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollBarUsingJavaScriptExecutorEx1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Games']"));
		/*System.out.println(ele.getLocation().getX());
		System.out.println(ele.getLocation().getY());
		

		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(436,787)");
		ele.click();*/
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("argument[0].scrollIntoView()",ele);
		ele.click();
		
		
		
		
	}

}
