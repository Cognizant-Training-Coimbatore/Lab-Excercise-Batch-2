  
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Statement;

public class Q8 {

	public static void main(String[] args)throws Exception {
		
int count=0;
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
        resultSet = statement.executeQuery("SELECT * FROM DEPT");
        resultSet.next();
        count=resultSet.getInt(1);
            System.out.println(count);
        }
	}
