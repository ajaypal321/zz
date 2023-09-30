package com.testcase;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.object.SignupPage;



public class SignupTest extends BaseClass{
	@Test
	public  void Signup() {
		// create an object 
		SignupPage  signup= new SignupPage(driver);
		signup.ClickSignup();
//		SwitchWindow();
//		signup.Selecttitle();
//		signup.FirstName(prop.getProperty("FirstName"));
//		signup.LastName(prop.getProperty("LastName"));
//		signup.enterCountry(prop.getProperty("Country1"));
//		signup.Dateofbirth(prop.getProperty("BOB"));
//		signup.Mobailenumber(prop.getProperty("MNumber"));
//		signup.Email(prop.getProperty("Email"));
//		signup.Password(prop.getProperty("Password1"));
//		signup.ConformPassword(prop.getProperty("CPassword"));


	}
}
