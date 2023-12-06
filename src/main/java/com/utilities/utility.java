package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utility {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver intializeDriver() throws IOException {
		prop = new Properties();
		String propath= System.getProperty("user.dir")+"\\src\\main\\java\\com\\resource\\data.properties";
		FileInputStream fis= new FileInputStream(propath);
		prop.load(fis);
		//String browsername="chrome";
		String browsername="chrome";
		if(browsername.equals("chrome")) {
			// load chrome
		WebDriverManager.chromedriver().setup();// setup come from bonigraciya
			driver= new ChromeDriver();	
		}
		else if(browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else if (browsername.equals("Safari")) {
			WebDriverManager.safaridriver().setup();
			driver= new SafariDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	return driver;
	}

//		String projectPath = System.getProperty("user.dir");
//		File file = new File(projectPath + "/DataProperties");
//		FileInputStream fileInput = new FileInputStream(file);
//		Properties prop = new Properties();
//		prop.load(fileInput);
//

//common utility function for capture screenshot
	public String takescreenshot(String testName, WebDriver driver) throws IOException {
		// capture the ss and store in file objects
		File srcScreenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//define the path where ss will be saved
		String screenShotFilepath= System.getProperty("user.dir")+"\\ScreenShot\\" +testName+ ".jpg";
		FileUtils.copyFile(srcScreenshotfile, new File(screenShotFilepath));
		return screenShotFilepath;
	}
	public  void SwitchWindow() {
		String parentwindow=driver.getWindowHandle();// find parent window
		Set<String>windowhandles=driver.getWindowHandles();// find the children windows
		windowhandles.size();// get number of window open
		
		// switching to windows
		for(String childwindow:windowhandles) {
			if(childwindow!=parentwindow) {
				driver.switchTo().window(childwindow);
				
			}
		}
	}
	public static void Dropdown() {
		
	}

}
