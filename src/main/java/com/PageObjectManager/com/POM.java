package com.PageObjectManager.com;

import org.openqa.selenium.WebDriver;

import com.pomm.com.BookPage;
import com.pomm.com.LoginPage;

public class POM {
	public static WebDriver driver;

	private LoginPage lp;

	private BookPage bp;

	public POM(WebDriver driver2) {
		this.driver = driver2;

	}

	public LoginPage login() {
		lp = new LoginPage(driver);
		return lp;
	}

	public BookPage booking() {
		bp = new BookPage(driver);
		return bp;
	}

}
