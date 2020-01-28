import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class prog_file_read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream
			Stream InputStream fstream = new
			FileInputStream("E:\\myfile.txt");
			DataInputStream fin = new DataInputStream(fstream);
			while  (fin.available() !=0)
			{
				System.out.println(fin.readLine());
			}
			fin.close();
		}
		catch (Exception e)
		{
			System.out.println("error");
		}

	}

}
