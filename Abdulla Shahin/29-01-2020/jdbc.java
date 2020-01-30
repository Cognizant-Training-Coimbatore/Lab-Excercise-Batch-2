import java.sql.DriverManager;
import java.sql.ResultSet;

public class jdbc {

	public static void main(String[] args) 
	{
		
		Statement statement = null;
		        ResultSet resultSet = null;
		        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		        String msAccDB = "E:/mydb1.mdb";
		        String dbURL = "jdbc:ucanaccess://" + msAccDB;
		        // step 2.A: Create and get connection using DriverManager class
		        Connection connection = DriverManager.getConnection(dbURL);

		        // Step 2.B: Creating JDBC Statement
		        statement = connection.createStatement();

		        // Step 2.C: Executing SQL & retrieve data into ResultSet
		        resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");
		        while(resultSet.next())
		        {
		            System.out.println(resultSet.getString(1));
		        }

	}

}
