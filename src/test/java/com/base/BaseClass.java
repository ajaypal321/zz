package com.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.utilities.utility;

public class BaseClass extends utility {

	@BeforeTest
	public void startup() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));// Dynamic url
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
}
