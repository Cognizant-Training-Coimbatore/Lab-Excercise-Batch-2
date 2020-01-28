package day5;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class read_txt_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fstream=new FileInputStream("E:\\Myfile.txt");
			DataInputStream fin= new DataInputStream(fstream);
			while(fin.available()!=0)
			{
				System.out.println(fin.readLine());
				
			}
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println("File error");
			
			
		}

	}

}
