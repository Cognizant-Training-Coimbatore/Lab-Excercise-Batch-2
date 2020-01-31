package exceptionhandling;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class pgm08_27_filewrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout=new FileOutputStream("D:\\ABHIJITH C S\\java\\myfile.txt");
			p = new PrintStream(fout);
			p.println("Hello world line 1...");
			p.println("Hello world line 2...");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("Error in the file");
		}
	}

}
