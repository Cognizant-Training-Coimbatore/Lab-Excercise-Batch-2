import java.io.DataInputStream;
import java.io.FileInputStream;



public class program40_file_read {

	public static void main(String[] args)
	{
		
		try
		{
			FileInputStream fstream =new
			FileInputStream("E:\\myfile.txt");
			DataInputStream fin = new DataInputStream(fstream);
			while (fin.available()!=0)
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


