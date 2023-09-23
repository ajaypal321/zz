package com.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.object.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	private WebDriver driver;
	private LoginPage objlogin= new LoginPage(driver);
	@ BeforeTest
	public void beforetest() {
		System.setProperty("Webdriver-http-factory","jdk-http-client");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");
			
	}
	@Test
	public void Logintest() {
		objlogin= new LoginPage(driver);
		objlogin.LoginBtn();
		objlogin.EmailBtn();
		objlogin.EmailInput("ramji@gmail.com");
		objlogin.Password("Ramji@123");
		objlogin.LoginSubmit();
	}
}
