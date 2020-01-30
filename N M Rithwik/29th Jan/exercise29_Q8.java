package apache;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class exercise29_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement statement = null;
        ResultSet resultSet = null;
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String msAccDB = "D:\\mydb 1.mdb\"";
        String dbURL = "jdbc:ucanaccess://" + msAccDB;
       
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
