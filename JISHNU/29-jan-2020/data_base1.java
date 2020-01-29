package day7;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class data_base1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Statement statement = null;
		ResultSet resultSet = null;
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		String msAccDB = "E:/mydb.mdb";
		String dbURL = "jdbc:ucanaccess://" + msAccDB;
		Connection connection = DriverManager.getConnection(dbURL);

	}

}
