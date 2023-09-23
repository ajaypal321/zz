package com.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//@FindBy(xpath="(//div[contains(text(),'Login')])[1]")
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']")
	WebElement loginbtn;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj r-p1pxzi']")
	WebElement emailbtn;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement emailinput;
	
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement password;
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement loginsubmit;
	
	public void LoginBtn() {
		loginbtn.click();
	}
	public void EmailBtn() {
		emailbtn.click();
	}
	public void EmailInput(String einput) {
		emailinput.sendKeys(einput);
	}
	public void Password(String pwd) {
		password.sendKeys(pwd);
	}
	public void LoginSubmit() {
		loginsubmit.click();
	}
}
