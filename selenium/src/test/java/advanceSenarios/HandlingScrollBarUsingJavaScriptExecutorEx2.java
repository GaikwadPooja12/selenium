package advanceSenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollBarUsingJavaScriptExecutorEx2 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https:/www.amazon.in");
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(-document.body.scrollHeight,0)");
		
		
		
		

	}

}
