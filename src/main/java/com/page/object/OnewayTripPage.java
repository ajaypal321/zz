package com.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.utility;

public class OnewayTripPage extends utility {
	// initilise  the driver
	public OnewayTripPage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	//@FindBy(xpath="//div[@data-testid='one-way-radio-button']")
	@FindBy(xpath="(//div[.='one way'])[2]")
	WebElement onwaybutton;

	//@FindBy(xpath="(//div[.='From'])[1]")
	@FindBy(xpath="(//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'])[1]")
	WebElement boardingfrom;

	//@FindBy(xpath="(//div[.='To'])[1]")
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destination;

	//@FindBy(xpath="//div[@data-testid='departure-date-dropdown-label-test-id']")
	@FindBy(xpath="//div[.='Departure Date']")
	WebElement departuredate;

	@FindBy(xpath="//div[@data-testid='home-page-travellers']")
	WebElement passengers;

	@FindBy(xpath="(//div[@style='position: relative; z-index: 1;'])[4]")
	WebElement student;

	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;

	//@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]")
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[7]")
	WebElement calanderMonth;


	@FindBy(xpath="(//div[@data-testid='undefined-calendar-day-9'])[7]")
	WebElement days;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='circle'][1]")
	WebElement nextbtn;
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement continuebtn;



	public void OWTbtn() {
		onwaybutton.click();
	}
	public void Onboarding(String boarding) {
		boardingfrom.click();
		boardingfrom.sendKeys(boarding);

	}
	public void Destination(String Destination) {
		destination.click();
		destination.clear();
		destination.sendKeys(Destination);
	}
	public void DepatureDate() {
		departuredate.click();
		//09/02/2024
		String expectedDay="09";
		String expectedMonthY="February 2024";
		while(true) {
			
			calanderMonth.getText();
			if(calanderMonth.equals(expectedMonthY)) {
				days.getText();
				if (expectedDay.equals(days)) {
					days.click();
					break;
				}	
			}else {
				nextbtn.click();
				break;

			}
		}
	}
	public void SearchFlight() {
		searchflight.click();
	}
	public void ContBtn() {
		continuebtn.click();
	}
}

