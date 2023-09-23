package com.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoundTripPage {
	private WebDriver driver;// driver
	public RoundTripPage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@data-testid='round-trip-radio-button']")
	WebElement rndbtn;
	@FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")
	WebElement rfrom;
	@FindBy(xpath="//div[@data-testid='departure-date-dropdown-label-test-id']")
	WebElement rdate ;
//	@FindBy(xpath="")
//	WebElement ;
//
//	@FindBy(xpath="")
//	WebElement ;
//	@FindBy(xpath="")
//	WebElement ;
//	@FindBy(xpath="")
//	WebElement ;
//	@FindBy(xpath="")
//	WebElement ;
//	@FindBy(xpath="")
//	WebElement ;

}
