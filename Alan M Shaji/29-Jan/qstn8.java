package apache;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class qstn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement statement=null;
		ResultSet resultset=null;
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		String msAccDB="";
		String dbURL="";
		
		Connection conn=DriverManager.getConnection(dbURL);
		statement=conn.createStatement();
		resultset=statement.executeQuery("SELECT* FROM EMPLOYEE");
		while(resultset.next())
			System.out.println(resultset.getString(1));


	}

}
