package com.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.utilities.utility;

public class BaseClass extends utility {

	@BeforeMethod
	public void startup() throws IOException  {
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));// Dynamic url
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
}
