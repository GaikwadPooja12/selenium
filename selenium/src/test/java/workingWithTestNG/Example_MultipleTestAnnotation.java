package workingWithTestNG;

import org.testng.annotations.Test;

public class Example_MultipleTestAnnotation {
	@Test
	public void register() {
		System.out.println("Registration is done");
		
	}
@Test
public void login() {
	System.out.println("login done");
	
}
@Test
public void addProductToCart() {
	
}
@Test
public void placeOrder() {
	System.out.println("order placed");
}
@Test
public void logout() {
	System.out.println("logout");
}
}
