package advanceSenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AUtoSuggestionEx2 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
    driver.manage().window().maximize();
    
    driver.findElement(By.name("q")).sendKeys("selenium");
    Thread.sleep(1000);
    List<WebElement> allSugg = driver.findElements(By.xpath("//li[@class='sbct PZPZlf']"));
    Thread.sleep(1000);
	for (WebElement ele : allSugg)
	{
		System.out.println(ele.getText());
		String data = ele.getText();
	if(data.contains("selenium tutorial"))
	{
		ele.click();
	}
	}
	

	}

}
