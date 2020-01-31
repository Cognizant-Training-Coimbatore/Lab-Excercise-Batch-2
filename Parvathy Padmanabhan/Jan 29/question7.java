import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class question7 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\January 29\\Name.csv"));
		int lines = 0;
		String Line="";
		while ((Line=reader.readLine()) != null) {
		    lines++;
		}
		System.out.println(lines);
		reader.close();
	}
}