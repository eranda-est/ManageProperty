package com.property;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class propertyDBUtil {

	public static List<property> validate(int ProId, String proName,String location,int price, String Des){
		
		ArrayList<property> pro = new ArrayList<>();
	   
		//create database connection
		String url="jdbc:mysql://localhost:3306/propertymanagement";
	    String user="root";
		String password="Eranda1289#";
	
		
		//validation
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con = DriverManager.getConnection(url,user,password);
					Statement stmt = con.createStatement();
					
					String sql = "select * from property where ProId='"+PropertyID+"' and proName='"+PropertyName+"' and location='"+Location+"' and price='"+Price+"' and Des='"+Description+"'";
				
				   ResultSet rs = stmt.executeQuery(sql);
				   
				   if(rs.next()) {
					   int PropertyID = rs.getInt(1);
					   String PropertyName = rs.getString(2);
					   String Location = rs.getString(3);
					   int Price = rs.getInt(4);
					   String Description = rs.getString(5);
					   
					   property p = new property(ProId,proName,location,price,Des);
					   pro.add(p);
					   
				   }
					
				}
				
				
	}
	
}
