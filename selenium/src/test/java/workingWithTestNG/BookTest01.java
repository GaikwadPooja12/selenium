package workingWithTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookTest01 extends BaseTest {
			
	@Test
	
	public void bookTest01() {
		
				
			    driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
			    driver.findElement(By.xpath("//a[text()='Log out']")).click();
			    driver.close();
			
			
			}
			

		}
