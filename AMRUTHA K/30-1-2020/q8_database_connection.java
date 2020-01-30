package package1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class q8_database_connection {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Statement statement = null;
		ResultSet resultset = null;
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		String msAccDB = "D:/mudb1.mdb";
		String dbURL ="jdbc:ucanaccess://" + msAccDB;
		//step2.A:Create and get connection using DriverManager class
		Connection connection = DriverManager.getConnection(dbURL);
		
		//Step2.B:Creating JDBC Statement
		statement = (Statement) connection.createStatement();
		//Step2.C:Executing SQL & retrieve data into ResultSet
		resultset = ((java.sql.Statement) statement).executeQuery("SELECT COUNT(*) FROM EMPLOYEE");
		while(resultset.next())
		{
			System.out.println(resultset.getString(1));
		}

	}

}
