package com.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.utility;

public class OnewayTripPage extends utility {
	private WebDriver driver;// driver
	public OnewayTripPage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//div[@data-testid='one-way-radio-button']")
	WebElement owtbtn;

	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement from;

	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/input[1]")
	WebElement to;

	@FindBy(xpath="//div[@data-testid='departure-date-dropdown-label-test-id']")
	WebElement departuredate;

	@FindBy(xpath="//div[@data-testid='home-page-travellers']")
	WebElement passengers;
	
	@FindBy(xpath="(//div[@style='position: relative; z-index: 1;'])[4]")
	WebElement student;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement serachflight;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]")
	//@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[7]")
	WebElement calanderMonth;
	
	
	@FindBy(xpath="(//div[@data-testid='undefined-calendar-day-9'])[7]")
	WebElement days;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='circle'][1]")
	WebElement nextbtn;
	
    

	public void OWTbtn() {
		owtbtn.click();
	}
	public void From(String place) {
		from.click();
		from.sendKeys(place);
		
	}
	public void To(String destination) {
		to.click();
		to.clear();
		to.sendKeys(destination);
	}
	public void DepatureDate() {
		//departuredate.click();
		//09/02/2024
		String expectedDay="09";
		String expectedMonthY="February 2024";
		while(true) {
			//String calanderMonth= driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[7]")).getText();
			calanderMonth.getText();
			if(calanderMonth.equals(expectedMonthY)) {
				//String days= driver.findElements(By.xpath("(//div[@data-testid='undefined-calendar-day-9'])[7]")){
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
		
		
		
		
	}

