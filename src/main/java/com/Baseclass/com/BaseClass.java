package com.Baseclass.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	// web driver methods
	public static WebDriver driver;

	// close //driver
	public static void closethePage() {
		driver.close();
	}

	// quit
	public static void quittheBrowser() {
		driver.quit();
	}

	// navigate
	public static void tonavigate(String url) {
		driver.navigate().to(url);
	}

	
	public static  void launchUrl(String url) {
		driver.get(url);
	}
	
	
	
	// chrome, firefox, ie, edge, opera, safari

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HARI\\eclipse-workspace\\SeleniumPro\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\HARI\\eclipse-workspace\\SeleniumPro\\Driver\\firefox.exe");
			 driver = new FirefoxDriver();
		}
		else {
			System.out.println("invalid browser, check the browsee name");

		}
		driver.manage().window().maximize();

		return driver;
	}

	//takesScreenshot
	public static void screenshot(String pic) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("//path// "+pic+".png");
		FileUtils.copyFile(source, destination);
	}
	
	//implicit
	public static void waiting(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	
	
	
	
	// web element methods

	// send keys --> web element

	public static void inputValues(WebElement element, String str) {
		element.sendKeys(str);
	}

	// click--> web element
	public static void clickonelement(WebElement element) {
		element.click();
	}

	// is selected
	public static void selectedIs(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

}
