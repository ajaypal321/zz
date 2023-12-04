package com.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.object.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseClass{

	@Test(priority=1)
	public void LoginwithValidCredentials() {
		LoginPage login= new LoginPage(driver);	
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("Password"));
		login.LoginButton();
		
	}
	@Test(priority=2)
	public void LoginwithInvalidCredentials() {
		LoginPage login= new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.invalidpassword(prop.getProperty("InvalidPassword"));
		login.LoginButton();
		
	}
	@Test(priority=3)
	public void LoginwithInvalidEmail() {
		LoginPage login= new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("InvalidEmail"));
		login.invalidpassword(prop.getProperty("Password"));
		login.LoginButton();
		
	}
}
