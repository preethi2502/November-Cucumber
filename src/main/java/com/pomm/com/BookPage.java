package com.pomm.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {

	public static WebDriver driver;

	// driver.findelement
	@FindBy(id = "username")
	private WebElement email;

	@FindBy(name = "password")
	private WebElement pass;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement button;

	

	public BookPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getButton() {
		return button;
	}
}
