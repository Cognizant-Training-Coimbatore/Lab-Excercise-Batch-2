package samplepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class j29_q8_noOfRecordsInTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Statement statement = null;
		ResultSet resultset = null;
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		String msAccDB = "E:/mydb1.mdb";
		String dbURL ="jdbc:ucanaccess://" + msAccDB;
		//step2.A:Create and get connection using DriverManager class
		Connection connection = DriverManager.getConnection(dbURL);
		
		//Step2.B:Creating JDBC Statement
		statement = connection.createStatement();
		//Step2.C:Executing SQL & retrieve data into ResultSet
		resultset = statement.executeQuery("SELECT COUNT(*) FROM EMPLOYEE");
		while(resultset.next())
		{
			System.out.println(resultset.getString(1));
		}
		

	
		

	}

}
