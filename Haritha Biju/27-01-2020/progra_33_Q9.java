/*9. Enter the following in a "books.CSV" file 
101,c,E.Balaguruswamy, BPB, 110
102, C++, Kanikar, Tech mcgraw hill, 200
103, Java made easy, Karthik, Vijaya, 300
*/
package demo;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class progra_33_Q9 
{

	public static void main(String[] args)
	{
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout= new FileOutputStream("D:\\books.csv");
			p=new PrintStream(fout);
			p.println("101,c,E.Balaguruswamy, BPB, 110");
			p.println("102, C++, Kanikar, Tech mcgraw hill, 200");
			p.println("103, Java made easy, Karthik, Vijaya, 300");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("Error in file");
		}
	}
}
