import java.io.FileOutputStream;
import java.io.PrintStream;

public class write_file_exception {

	public static void main(String[] args) 
	{
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout = new FileOutputStream("E:\\myfile1.txt");
			p = new PrintStream(fout);
			p.println("hello world 1");
			p.println("hello world 1");
			p.println("hello world 1");
			p.close();
			
		}
		catch (Exception e)
		{
			System.err.println("Error in file");
		}

	}

}
