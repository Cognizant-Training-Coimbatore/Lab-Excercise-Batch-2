package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class pgm_data {

	public static void main(String[] args) throws Exception {
		Statement statement = null;
        ResultSet resultSet = null;
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String msAccDB = "E:\\mydb1.mdb";
        String dbURL = "jdbc:ucanaccess://" + msAccDB;
        // step 2.A: Create and get connection using DriverManager class
        Connection connection = DriverManager.getConnection(dbURL);

        statement = connection.createStatement();

     
        resultSet = statement.executeQuery("SELECT * FROM Employee");
        while(resultSet.next())
        {
        	
        	System.out.println(resultSet.getString(1));
        }
	}
}

