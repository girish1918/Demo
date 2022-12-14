package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionRetrival {
 public void getRetrivalConnection() {
	 ConnectionStud cs= new ConnectionStud();
	 
     Connection con=cs.getConnectionDetails();
     try {
         PreparedStatement ps=con.prepareStatement("select * from studentquiz");
         ResultSet rs=ps.executeQuery();
         
         while(rs.next()) {
        	 
        	 System.out.println(rs.getInt(1));
        	 System.out.println(rs.getNString(2));
        	 System.out.println(rs.getInt(3));
        	 System.out.println(rs.getString(4));
        	 
        }
    	 
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
 }
public static void main(String[] args) {
	ConnectionRetrival cr=new ConnectionRetrival();
	cr.getRetrivalConnection();
}
	}