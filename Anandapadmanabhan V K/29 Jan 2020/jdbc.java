
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement statement=null;
		ResultSet resultSet=null;
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		String msAccDB="E:/mydb1.mdb";
		String dbURL="jdbc:ucanaccess://"+msAccDB;
		Connection connection=DriverManager.getConnection(dbURL);
		statement=connection.createStatement();
		resultSet=statement.executeQuery("SELECT * FROM employee");
		while(resultSet.next())
		{
			System.out.println(resultSet.getString(1));
		}
	}

}
