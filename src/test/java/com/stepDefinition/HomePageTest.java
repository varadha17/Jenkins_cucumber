package com.stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;

import com.baseTest.baseTest;
import com.pages.HomePage;
import com.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class HomePageTest extends baseTest{
	
	
	public HomePageTest() {
		super();
	}
	
	public baseTest base;
	public LoginPage gg;
	public HomePage hp;
	
	@Before("@home")
	public void setUp() throws InterruptedException{
		initialize_webdriver();
		gg = new LoginPage();
		hp = gg.LoginDetails();
	}
	

	@Given("get name of the user who logged in")
	public void get_name_of_the_user_who_logged_in() throws InterruptedException {
	   hp.getname();
	}
	
	@Given("Get free account details from site")
	public void get_free_account_details_from_site() throws InterruptedException {
	    hp.getFreeAccount();
	}

	@Given("get broken links from home page")
	public void get_broken_links_from_home_page() throws MalformedURLException, IOException {
	   gg.BrokenLinkTest();
	}

	
	@After("@home")
	public void tearDown() {
		driver.quit();
	}

}
