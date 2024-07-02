package advanceSenarios;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
//impicit wait()  syntax for version 3
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//impicit wait()  syntax for version 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	//Explicitwait()-->10s
	WebElement login = driver.findElement(By.className("btn_action"));
	
	/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(login));
	login.click();
	

	wait.until(ExpectedConditions.titleContains("Swag Labs"));
	//wait.until(ExpectedConditions.titleContains("Hello"));
	driver.findElement(By.xpath("//img[@src='./img/sauce-backpack-1200x1500.jpg']")).click();
*/
	
	FluentWait fwait=new FluentWait(driver);
	fwait.pollingEvery(Duration.ofSeconds(1));
	fwait.withTimeout(Duration.ofSeconds(10));
	fwait.until(ExpectedConditions.elementToBeClickable(login));
	login.click();
	}

}
