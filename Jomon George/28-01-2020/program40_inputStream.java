package demo;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class program40_inputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fstream = new FileInputStream("C:\\Users\\jomon\\Desktop\\CTS\\Training\\Java\\FileIO\\myfile.txt");
			DataInputStream fin = new DataInputStream(fstream);
			while(fin.available() !=0)
			{
				System.out.println(fin.readLine());
			}
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println("File Error");
		}
	}

}
