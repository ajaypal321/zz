package com.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.object.LoginPage;
import com.page.object.SelectFlightPage;

public class SelectFlightTest extends BaseClass{
	

		@Test(priority=1)
		public void FlightwithValidCredentials() {
			SelectFlightPage flight= new SelectFlightPage(driver);	
			flight.ContBtn();
}
}

//	@FindBy(xpath="//div[@data-testid='searchPage-sortingOption-spiceflex']")
//	WebElement clas;
//	@FindBy(xpath="((//div[@data-testid='spicemax-flight-select-radio-button-2'])[2]")
//	WebElement chooseAmount;
//	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
//	WebElement conti;
//	@FindBy(xpath="//div[@data-testid='title-contact-detail-card']")
//	WebElement title;
//	@FindBy (xpath="//input[@data-testid='first-inputbox-contact-details']")
//	WebElement firstandmiddlename;
//	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
//	WebElement lastname;
//	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
//	WebElement contactnumber;
//	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
//	WebElement emailid;
//	@FindBy(xpath="(//div[@tabindex='0'])[106]")
//	WebElement india;
//	@FindBy (xpath="//input[@data-testid='city-inputbox-contact-details']")
//	WebElement city;
//	@FindBy(xpath="//div[contains(text(),'I prefer not to receive future communication and newsletter from SpiceJet over text, WhatsApp or e-mail.')]")
//	WebElement btn;
//    @FindBy(xpath="//div[contains(text(),'I am flying as the primary passenger')]")
//    WebElement btn2;
//    @FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-19554kt r-184en5c']")
//    WebElement title2;
//    @FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
//    WebElement name2;
//    @FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
//    WebElement lastname2;
//    @FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
//    WebElement number2;
//    @FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
//    WebElement paymentcontinuous;
//    
//    //  methods
//    public void ChooseAmount() {
//    	chooseAmount.click();
//    }
    

