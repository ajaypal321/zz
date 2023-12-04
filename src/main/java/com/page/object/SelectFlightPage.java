package com.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage {
	private WebDriver driver;// driver
	public SelectFlightPage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement continuebtn;
	//(//div[.='Mr'])[2]
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement namefm; 
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastn;
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	WebElement numb;
	@FindBy(xpath="//input[contains(@data-testid,'emailAddress-inputbox-contact-details')]")
	WebElement emailc;
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[10]")
	WebElement bttn;
	@FindBy (xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement conbttn;
	// method 
	
	public void ContBtn() {
		continuebtn.click();
	}
	
	
}