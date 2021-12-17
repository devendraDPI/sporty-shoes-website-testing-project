package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import tests.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver;

	//	*************** Web Elements ***************
	
	@FindBy(linkText="Login/Signup")
	WebElement navigate_to_login;
	
	@FindBy(name="email_id")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(tagName = "button")
	WebElement login;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	@FindBy(linkText="Login/Signup")
	WebElement logincheck;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	//	*************** Class Methods ***************
	
	@Parameters({"UserName", "Password"})
	public String Login(String UsernameVal , String Password) {
		
		navigate_to_login.click();
		username.sendKeys(UsernameVal);
		password.sendKeys(Password);
		login.click();
		return driver.getCurrentUrl();
	}
	
	@Parameters({"UserName","Password"})
	public Boolean Logout(String UsernameVal , String Password) {
		
		navigate_to_login.click();
		username.sendKeys(UsernameVal);
		password.sendKeys(Password);
		login.click();
		logout.click();
		
		if(logincheck.getText().equals("Login/Signup"))
			return true;
		else
			return false;
		
	}	
}