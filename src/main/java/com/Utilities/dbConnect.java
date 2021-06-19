package com.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbConnect {
	
	public static void resultDbConnection() {
//		Connection con = null;
//		ResultSet result = null;
//		
//		try {
//			String url="jdbc:sqlserver://PORTMYTECH-PC-1\\Portmytech:1433;"+ "databaseName=Selenium; integratedSecurity=true;";
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			
//			con = DriverManager.getConnection(url);
//			
//			con.isClosed();
//			
//			String query = "select * from WebTableValidation";
//			PreparedStatement pst=con.prepareStatement(query);
//			
//			
//			result=pst.executeQuery();
//		    while(result.next()) {
//		    	System.out.println(result.getString(1)+ "   "+ result.getString(2) +"   " +result.getString(3));
//            }
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	 try {
			String dbURL = "jdbc:sqlserver://localhost:1433/Selenium";
		        //Load MS SQL JDBC Driver
		        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		        //Creating connection to the database
		        Connection con = DriverManager.getConnection(dbURL);
		        //Creating statement object
		    	Statement st = con.createStatement();
		    	String selectquery = "SELECT * FROM WebTableValidation";
		        //Executing the SQL Query and store the results in ResultSet
		    	ResultSet rs = st.executeQuery(selectquery);
		    	//While loop to iterate through all data and print results
		    	while (rs.next()) {
		    		System.out.println(rs.getString(0));
		    	}
		        //Closing DB Connection
		    	con.close();
	 } catch(Exception e) {
		 e.printStackTrace();
	 }
			}
	}

