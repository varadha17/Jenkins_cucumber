package com.pages;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.BrokenLinks;
import com.baseTest.baseTest;

import io.cucumber.datatable.DataTable;

public class LoginPage extends baseTest{
	
	
	public LoginPage(){
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[name='email']") private WebElement username;
	@FindBy(css="input[name='password']") private WebElement password;
	@FindBy(xpath="//div[contains(text(),'Login')]") private WebElement loginButton;
	
	public HomePage LoginDetails() throws InterruptedException {
		Thread.sleep(5000);
		username.sendKeys("abinash.varadharajan@gmail.com");
		password.sendKeys("Anishabi@17");
		loginButton.click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(4000);
		return new HomePage();

	}
	
	
	public void dataTableTest(DataTable table) throws InterruptedException {
		Thread.sleep(5000);
		List<List<String>> list = table.asLists();
		for(List<String> col1: list) {
			username.sendKeys(col1.get(0));
		}
		Thread.sleep(4000);
	}
	
	public void BrokenLinkTest() throws MalformedURLException, IOException {
		BrokenLinks.getresponseforBrokenLinks();
	}

}
