import java.io.FileOutputStream;
import java.io.PrintStream;

public class program_32_file
{

	public static void main(String[] args)
	{
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout= new FileOutputStream("E:\\myfile.txt");
			p=new PrintStream(fout);
			p.println("hello world line 1");
			p.println("hello world line 2");
			p.println("Hello world line 3");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("Error in file");
		}

	}

}
