package demo;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class program_33_Q10
{

	public static void main(String[] args)
	{
		try
		{
			FileInputStream fstream= new FileInputStream("D:\\\\books.csv");
			DataInputStream fin=new DataInputStream(fstream);
			while(fin.available()!=0)
			{
				System.out.println(fin.readLine());
			}
			fin.close();
		}
		catch(Exception e)
		{
			System.err.println("Error in file");
		}

	}

}
