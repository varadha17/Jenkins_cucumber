package com.stepDefinition;

import com.Utilities.dbConnect;

import io.cucumber.java.en.Given;

public class dbTest {

	@Given("get dbValues")
	public void get_db_values() {
		
		dbConnect.resultDbConnection();
		
	}




}
