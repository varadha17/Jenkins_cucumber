package com.stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;

import com.baseTest.baseTest;
import com.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class LoginPageTest extends baseTest{
	
	public LoginPageTest() {
		super();
	}
	
	public baseTest base;
	public LoginPage gg;
	
	@Before("@login")
	public void setUp() {
		initialize_webdriver();
		gg = new LoginPage();
	}


	@Given("Send valid username and password")
	public void send_valid_username_and_password() throws InterruptedException {
		gg.LoginDetails();
	}

	@Given("Get Broken Links")
	public void get_broken_links() throws MalformedURLException, IOException {
		gg.BrokenLinkTest();
	}

	
	@After("@login")
	public void tearDown() {
		driver.quit();
	}

}
