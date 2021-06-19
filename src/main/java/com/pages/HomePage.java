package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseTest.baseTest;

public class HomePage extends baseTest{
	
	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="span.user-display") private WebElement getUsername;
	@FindBy(css="span.trial-indicator>a") private WebElement free;
	
	public void getname() throws InterruptedException {
		String name = getUsername.getText();
		System.out.println(name);
		Thread.sleep(5000);
	}
	
	public void getFreeAccount() throws InterruptedException {
		String freeacc = free.getText();
		System.out.println(freeacc);
		Thread.sleep(4000);
	}
	
	

}
