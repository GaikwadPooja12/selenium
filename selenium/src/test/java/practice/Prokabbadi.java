package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Prokabbadi {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		String points = driver.findElement(By.xpath("//p[text()='Bengal Warriors']/../../../following-sibling::div[@class='table-data points']")).getText();

		System.out.println(points);
			}

		
}
