package Package2;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class program82_exception_again1 {

	public static void main(String[] args) {
		
		try
		{
			FileInputStream fstream=new
					FileInputStream("D:\\myfile.txt");
			DataInputStream fin=new DataInputStream(fstream);
			while(fin.available()!=0)
			{
				System.out.println(fin.readLine());
			}
			fin.close();
		}
		catch (Exception e)
		{
			System.err.println("File error");
		}
	}

}
