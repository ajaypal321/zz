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
	@FindBy(xpath="//div[@data-testid='to-testID-origin']//input[@type='text']")
	WebElement rfrom;
	@FindBy(xpath="//div[@data-testid='to-testID-destination']//input[@type='text']")
	WebElement rreturn ;
	@FindBy(xpath="//div[@data-testid='departure-date-dropdown-label-test-id']")
	WebElement depdate;

	@FindBy(xpath="//div[contains(text(),'Return Date')]")
	WebElement rdate;
	@FindBy(xpath="(//div[@data-testid='undefined-calendar-day-19'])[4]")
	WebElement ddate;
	@FindBy(xpath="//div[@data-testid='home-page-travellers']")
	WebElement passengers ;
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement adulbtn;
	@FindBy(xpath="//div[@data-testid='Infant-testID-plus-one-cta']")
	WebElement infant ;
	@FindBy(xpath="//div[contains(text(),'Currency')]")
	WebElement choosecurrency;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='INR'])[1]")
	WebElement ind ;
	@FindBy(xpath="//div[contains(text(),'Family & Friends')]")
	WebElement radiobtn;
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;
	@FindBy(xpath="//*[@stroke-width='2']")
	WebElement condibtn;
	@FindBy(xpath="//div[contains(text(),'Continue')]")
	WebElement continusbtn;
	
	
	// method to perform

	public void Roundbtn() {
		 rndbtn.click();
	}
	public void RFrom(String place) {
		rfrom.click();
		rfrom.sendKeys(place);
	}
	public void RReturn(String destination) {
		rreturn.click();
		rreturn.sendKeys(destination);
	}
	public void DepDate() {
		
	}
	public void Passengers() {
		passengers.click();
	}
	public void Adulbtn() {
		adulbtn.click();
		adulbtn.click();
	}
	public void Infant() {
		infant.click();
		
	}
	public void Choosecurrency() {
		choosecurrency.click();
	}
	public void Ind() {
		ind.click();
	}
	public void Radiobtn() {
		radiobtn.click();
		
	}
	public void Searchflightbtn() {
		searchflight.click();
	}
	public void condibtn() {
		condibtn.click();
	}
	public void  continusbtn() {
		 continusbtn.click();
	}
	
	

}
