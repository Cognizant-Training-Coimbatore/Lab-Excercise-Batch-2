package apache;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class qstn8 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Statement statement=null;
		ResultSet resultset=null;
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		String msAccDB="D:\\MSa\\JDBC\\JDCB1.mdb";
		String dbURL="jdbc::ucanaccess:\\"+msAccDB;
		
		Connection connection=DriverManager.getConnection(dbURL);
		statement=connection.createStatement();
		resultset=statement.executeQuery("SELECT* FROM EMPLOYEE");
		while(resultset.next())
			System.out.println(resultset.getString(1));


	}

}
