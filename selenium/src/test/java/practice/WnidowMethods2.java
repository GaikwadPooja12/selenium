package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WnidowMethods2 {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		

	}

}
