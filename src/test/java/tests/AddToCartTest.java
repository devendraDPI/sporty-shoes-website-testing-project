package tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import pages.AddToCartPage;

public class AddToCartTest extends BaseClass {
	
	@Parameters({"UserName","Password"})
	@Test
	public void DoAddToCart(String UserNameVal, String Password) {
		
		test = report.startTest("Cart Test");
		AddToCartPage adct = new AddToCartPage();
		String product = adct.AddToCart(UserNameVal , Password);
		Assert.assertEquals(product, "HP Laptop ABC");
		test.log(LogStatus.PASS, "Cart Test", "To check product added to cart");
		report.endTest(test);
		
	}
}