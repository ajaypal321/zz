package com.testcase;
import java.time.Duration;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.object.RoundTripPage;
import com.page.object.SelectFlightPage;

public class RounwayTripTest extends BaseClass {
@Test
public void getsearchroundtripFlight() throws InterruptedException {
	RoundTripPage round= new RoundTripPage(driver);
	round.Roundbtn();
	Thread.sleep(2000);	
	round.ROnboarding(prop.getProperty("From"));
	Thread.sleep(2000);
	round.RDestination(prop.getProperty("To"));
	Thread.sleep(2000);
	round.DepDate();
	Thread.sleep(3000);
	//round.ReturnDate();
	round.Passengers();
	Thread.sleep(3000);
	round.Adulbtn();
	Thread.sleep(3000);
	round.Infant();
	Thread.sleep(3000);
	round.Choosecurrency();
	Thread.sleep(3000);

	round.Ind();
	Thread.sleep(3000);
	round.Searchflightbtn();
	Thread.sleep(3000);
	
}
	
}
