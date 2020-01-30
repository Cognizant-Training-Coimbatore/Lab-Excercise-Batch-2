import java.io.DataInputStream;
import java.io.FileInputStream;

public class pgm_read_the_content {

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fstream=new
			FileInputStream("e:\\myfile.txt");
			DataInputStream fin=new DataInputStream(fstream);
			while(fin.available()!=0)
			{
				System.out.println(fin.readLine());
			}
			fin.close();
			}
		catch(Exception e)
		
		{
			System.err.println("file error");
		}

	}

}
