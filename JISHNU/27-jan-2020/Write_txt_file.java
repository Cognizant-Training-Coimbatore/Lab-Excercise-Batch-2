package day5;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Write_txt_file 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout=new FileOutputStream("E:\\Myfile.txt");
			p=new PrintStream(fout);
			p.println("Hellow line 1");
			p.println("Hellow line 2");
			p.println("Hellow line 3");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("Error in file");
		}
	}

}
