package sample_pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class pgm_database_connection {

	public static void main(String[] args) {
		Statement statement=null;
		ResultSet resultSet=null;
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		String msAccDB="E:/mydb1.mdb";
		String dbURL="jdbc:ucanaccess://"+msAccDB;
		Connection connection=DriverManager.getConnection(dbURL);
		statement=connection.createStatement();
		resultset=statement.executeQuery("SELECT * FROM Employee");
		while(resultSet.next())
		{
			System.out.println(resultSet.getString(1));
		}
		
	}

}
