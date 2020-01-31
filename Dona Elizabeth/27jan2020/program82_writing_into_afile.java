import java.io.FileOutputStream;
import java.io.PrintStream;
//import java.io.*;

public class program82_writing_into_afile {

	public static void main(String[] args) {
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout=new FileOutputStream("D:\\myfile.txt");
			p=new PrintStream(fout);
			p.println("line 1");
			p.println("line 2");
			p.println("line 3");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("Error in file");
		}
	}

}
