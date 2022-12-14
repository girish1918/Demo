package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionStud {
   Connection con=null;
	public Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizmcq","root","1234");
		    
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	      return con;
	
	}
}
