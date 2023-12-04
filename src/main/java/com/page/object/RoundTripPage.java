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
	@FindBy(xpath="//div[text()='round trip']")
	//@FindBy(xpath="//div[@data-testid='round-trip-radio-button']")
	WebElement rndbtn;
	//@FindBy(xpath="(//div[.='From'])[1]")
		@FindBy(xpath="(//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'])[1]")
		WebElement boardingfrom;

		//@FindBy(xpath="(//div[.='To'])[1]")
		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
		WebElement destination;
		@FindBy(xpath="//div[.='Departure Date']")
		WebElement departuredate;
		@FindBy(xpath="//div[text()='10'])[12]")
		WebElement returndate;
	
	
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
	public void ROnboarding(String boarding) {
		boardingfrom.click();
		boardingfrom.sendKeys(boarding);

	}
	public void RDestination(String Destination) {
		destination.click();
		destination.clear();
		destination.sendKeys(Destination);
	}
	
	public void DepDate() {
		departuredate.click();
		
	}
	public void ReturnDate() {
		returndate.click();
		
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
		infant.click();
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
