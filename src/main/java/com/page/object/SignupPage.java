package com.page.object;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utilities.utility;

public class SignupPage extends utility {
	
	public WebDriver driver;
	// constructor to initialize page factory
	public SignupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Locate the object

	//@FindBy(linkText="Signup")
	
	@FindBy(xpath="//div[text()='Signup']")
	WebElement signup;

	//div[@class='col-sm-4 mt-2 px-sm-4']//select[contains(@class,'form-control form-select')]
	@FindBy(xpath="(//select[contains(@class,'form-control form-select')])[1]")
	//@FindBy(xpath="option[.='Mr']") // not working
	//@FindBy(xpath="//div[@class='col-sm-4 mt-2 px-sm-4']//select[contains(@class,'form-control form-select')]")
	WebElement title;

	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;

	@FindBy(xpath="//input[@id='last_name']")
	WebElement Lastname;

	@FindBy(xpath="(//select[@class='form-control form-select'])[1]")
	WebElement country;

	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dateofbirth;

	@FindBy(xpath="//input[@type='tel']")
	WebElement mobailnumber;

	@FindBy(xpath="//input[@id='email_id']") 
	WebElement email;

	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;

	@FindBy(xpath="//input[@id='c-password']")
	WebElement confpassword;

	@FindBy(xpath="//input[@type='checkbox']")
	WebElement radiobtn;


	//method
	// perform action on it
	
	public void Signup() {
		signup.click();	
		SwitchWindow();
	}
	
	
	
	
	public void SelectTitle() {
		title.click();
//		Select tit =new Select(title);
//	tit.selectByValue("Mr");
}
	
	public void FirstName(String Firstname) {
		firstname.sendKeys(Firstname);//comes from test method
	
	}
	public void LastName(String lastname) {
		Lastname.sendKeys(lastname);//comes from test method
	}
	public void enterCountry(String Country) {
		//Select count =new Select(country1);
		//count.selectByValue("IN");
		
	country.sendKeys(Country);
	}	
	public void Dateofbirth(String DOB) {
		dateofbirth.sendKeys(DOB);
	}

	public void Mobailenumber(String MNumber ) {
		mobailnumber.sendKeys( MNumber);
	}
	public void Email(String Emailid) {
		email.sendKeys(Emailid);
	}
	public void Password(String Password1) {
		password.sendKeys(Password1);
	}
	public void ConformPassword(String CPassword) {
		confpassword.sendKeys(CPassword);
	}
	public void RadioBtn() {
		radiobtn.click();
	}
}



