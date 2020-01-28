package monday;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class write_to_file {

	public static void main(String[] args) 
	{
		
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout = new FileOutputStream("C:\\Lab\\myfile.txt");
			p = new PrintStream( fout );
			p.println("Line1");
			p.println("Line2");
			p.println("Line3");
			p.close();
		}
		catch(Throwable e)
		{
			System.err.println("Error");
		}
	}

}
