package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		//launching Browser
		WebDriver driver=new ChromeDriver();
		
		//method1:- launching Application
		
		//driver.get("https://www.flipkart.com");
		//driver.get("https://www.amazon.in");
		driver.get("https://www.makemytrip.com/");
		//driver.get("https://mail.google.com/");
        //driver.get("https://www.firstcry.com/");
		
		//method2:- getTitle()------> fetch the current webpage title
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//method3:-getCurrenturl()---->fetches the current webpage url
		
		//String URL=driver.getCurrentUrl();
		//System.out.println(URL);
		
		//Method4:- getPageSource()------>fetches the source code
		
		//String Source=driver.getPageSource();
		//System.out.println(Source);
		
		//method 5:-Maximize, Minimize, fulllscreen
		
		//Options opt = driver.manage();
		//Window win = opt.window();
		//win.maximize();
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		//driver.manage().window().fullscreen();
		
		driver.close();	
		driver.quit();
	
		
	}

}
