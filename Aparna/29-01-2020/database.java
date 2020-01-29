package abstract_123;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class database {

	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub
		

		
		Statement statement = null;
		        ResultSet resultSet = null;
		        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		        String msAccDB = "C:\\Users\\Admin\\Documents\\mydb1.mdb";
		        String dbURL = "jdbc:ucanaccess://" + msAccDB;
		        // step 2.A: Create and get connection using DriverManager class
		        Connection connection = DriverManager.getConnection(dbURL);

		        // Step 2.B: Creating JDBC Statement
		        statement = connection.createStatement();

		        // Step 2.C: Executing SQL & retrieve data into ResultSet
		        resultSet = statement.executeQuery("SELECT * FROM DEPT");
		        while(resultSet.next())
		        {
		            System.out.println(resultSet.getString(1));
		        }

	}

}
