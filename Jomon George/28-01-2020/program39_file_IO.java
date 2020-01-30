package demo;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class program39_file_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fout;
		PrintStream p;
		try {
			fout = new FileOutputStream("C:\\Users\\jomon\\Desktop\\CTS\\Training\\Java\\FileIO\\myfile.txt");
			p = new PrintStream(fout);
			p.println("Hello world line 1");
			p.println("Hello world line 2");
			p.println("Hello world line 3");
			p.close();
		}
		catch(Exception e)
		{
			System.out.println("Error in file");
		}
	}

}
