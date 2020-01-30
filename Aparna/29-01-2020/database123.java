package project12345;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.poi.util.StringUtil;
import org.junit.runners.model.Statement;

public class database123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

				
				Statement statement = null;
				        ResultSet resultSet = null;
				        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				        StringUtil msAccDB = "D:/mydb1.mdb";
				        String dbURL = "jdbc:ucanaccess://" + msAccDB;
				        // step 2.A: Create and get connection using DriverManager class
				        Connection connection = DriverManager.getConnection(dbURL);

				        // Step 2.B: Creating JDBC Statement
				        statement = (Statement) connection.createStatement();

				        // Step 2.C: Executing SQL & retrieve data into ResultSet
				        resultSet = ((java.sql.Statement) statement).executeQuery("SELECT * FROM DEPT");
				        while(((ResultSet) resultSet).next())
				        {
				            System.out.println(((ResultSet) resultSet).getString(1));
				        }
	}

}
