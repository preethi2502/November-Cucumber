package com.stepdefenition.com;

import com.Baseclass.com.BaseClass;
import com.PageObjectManager.com.POM;
import com.helper.com.FileReaderManager;

import cucumber.api.java.en.*;

public class StepDefenition extends BaseClass {

	POM pm = new POM(driver);

	@Given("^Application should be launched successfully$")
	public void application_should_be_launched_successfully() throws Throwable {
		launchUrl(FileReaderManager.getInstanceFR().getInstanceCR().url());
	}

	@When("^user enter the valid  in the username field$")
	public void user_enter_the_valid_in_the_username_field() throws Throwable {
		inputValues(pm.login().getEmail(), "Preethi");
	}

	@When("^user enter the valid in the password field$")
	public void user_enter_the_valid_in_the_password_field() throws Throwable {
		inputValues(pm.login().getPass(), "231322132");
	}
	

	@Then("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		clickonelement(pm.login().getButton());
	}

}
