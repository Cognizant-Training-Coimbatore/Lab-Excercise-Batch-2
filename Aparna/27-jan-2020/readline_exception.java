package exception_handling;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class readline_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	FileInputStream fstream =new
	FileInputStream ("D:/aparnamaria/myfile.txt");
	DataInputStream fin=new DataInputStream(fstream);
	while(fin.available()!=0)
	{
		System.out.println(fin.readLine());
	}
	fin.close();
}
catch (Exception e)
{
	System.err.println("file error");
}
	}

}
