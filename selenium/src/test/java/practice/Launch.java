package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class Launch {

	public static void main(String[] args) {
		//case1:- selenium version:-3.141.59 , chromedriver.exe
		
		/*	String key="webdriver.chrome.driver";
			String value="./chromedriver.exe";
	        System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();*/
			
		//case2:- selenium version:-3.141.59, webdrivermanager:-5.8.0

			//WebDriverManager.chromedriver().setup();
			//WebDriver driver=new ChromeDriver();
			
          //WebDriverManager.edgedriver().setup();
          //WebDriver driver=new EdgeDriver();
          
          //case3:- selenium version:-4.19.1
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
	}

}
