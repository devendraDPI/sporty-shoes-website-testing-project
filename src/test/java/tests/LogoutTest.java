package tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import pages.LoginPage;

public class LogoutTest extends BaseClass {
	@Test
	@Parameters({"UserName","Password"})
	public void Logout(String correctUser, String correctPass ) {
		
		Boolean expected = true;
		test = report.startTest("Logout Test");
		LoginPage loginPage = new LoginPage();
		Boolean actualogout = loginPage.Logout(correctUser,correctPass);
		Assert.assertEquals(actualogout, expected);
		test.log(LogStatus.PASS, "Logout Test", "To check user able logout");
		report.endTest(test);
		
	}
}