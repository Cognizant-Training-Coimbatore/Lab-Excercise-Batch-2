import java.io.FileOutputStream;
import java.io.PrintStream;

public class program52_file_op_stream 
{

	public static void main(String[] args) 
	{
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout= new FileOutputStream("E:\\myfile.txt");
			p=new PrintStream(fout);
			p.println ("hello world line one");
			p.println ("hello world line two");
			p.println ("hello world line three");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("error in file");
			
		}

	}

}
