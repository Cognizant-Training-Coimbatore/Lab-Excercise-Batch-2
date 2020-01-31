import java.io.DataInputStream;
import java.io.FileInputStream;

public class program83_reading_from_file {

	public static void main(String[] args) {
		try
		{
			FileInputStream fstrm=new FileInputStream("D:\\myfile.txt");
			DataInputStream fin=new DataInputStream(fstrm);
			while(fin.available()!=0)
			{
				System.out.println(fin.readLine());
			}
			fin.close();
			
		}
		catch(Exception e)
		{
			System.err.println("error");
		}
	}

}
