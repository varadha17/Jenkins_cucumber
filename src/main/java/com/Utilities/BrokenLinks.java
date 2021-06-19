package com.Utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseTest.baseTest;

public class BrokenLinks extends baseTest{
	
	public BrokenLinks(){
		super();
	}
	
	
	public static void getresponseforBrokenLinks() throws MalformedURLException, IOException{
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Get Link Size" + list.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getAttribute("href") != null)
			{
				
				activeLinks.add(list.get(i));
				
				}
			}
		
		
		System.out.println("Get Active Links size"+activeLinks.size());
		
		for(int j=0;j<activeLinks.size();j++) {
			HttpURLConnection huc = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			huc.connect();
			String response = huc.getResponseMessage();
			int responseCode = huc.getResponseCode();
			
			huc.disconnect();
			
			System.out.println(activeLinks.get(j).getAttribute("href")+"--------->"+responseCode+"---"+ response);
		}
		
	}

}
