package monday;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ReadFromFile {

	public static void main(String[] args) {
		try
		{
			FileInputStream fstream=new FileInputStream ("C:\\Lab\\myfile.txt");
			DataInputStream fin = new DataInputStream(fstream);
			while(fin.available()!=0)
			{
				System.out.println(fin.readLine());
			}
		fin.close();
		}
		catch(Throwable e)
		{
			System.err.println("Error");
		}

	}

}
