package com.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.object.OnewayTripPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnewayTripTest {
	private WebDriver driver;
	private OnewayTripPage obj= new OnewayTripPage(driver);
	@ BeforeTest
	public void beforetest() {
		System.setProperty("Webdriver-http-factory","jdk-http-client");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://www.bestbuy.com/");
		driver.get("https://www.spicejet.com/");
}
	@Test
	public void TripTest() {
		obj= new OnewayTripPage(driver);
		obj.OWTbtn();
		obj.From("Mumbai");
		obj.To("Delhi");
		obj.DepatureDate();
	}
}
