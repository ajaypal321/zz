package com.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.object.OnewayTripPage;
import com.page.object.SelectFlightPage;
import com.base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OnewayTripTest extends BaseClass{
	@Test
	public void getSearchFlight() throws InterruptedException {
		OnewayTripPage oneway = new OnewayTripPage(driver);
		oneway.OWTbtn();
		oneway.Onboarding(prop.getProperty("From"));
		Thread.sleep(2000);
		oneway.Destination(prop.getProperty("To"));
		Thread.sleep(2000);
		oneway.DepatureDate();
		Thread.sleep(2000);
		oneway.SearchFlight();	
		Thread.sleep(3000);
//		oneway.ContBtn();
//		Thread.sleep(3000);
	}

	
}
