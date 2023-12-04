 package com.testcase;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.object.SignupPage;



public class SignupTest extends BaseClass{
	@Test
	public  void Signup() throws InterruptedException {
		// create an object 
		SignupPage  signup= new SignupPage(driver);
		signup.Signup();
 		SwitchWindow();
//signup.SelectTitle();
		Thread.sleep(3000);
		signup.FirstName(prop.getProperty("FirstName"));
		signup.LastName(prop.getProperty("LastName"));
		signup.enterCountry(prop.getProperty("Country"));
		//signup.enterCountry(); 
		signup.Dateofbirth(prop.getProperty("DOB"));
		signup.Mobailenumber(prop.getProperty("MNumber"));
		signup.Email(prop.getProperty("Email"));
		signup.Password(prop.getProperty("Password"));
		signup.ConformPassword(prop.getProperty("CPassword"));


	}
}  
