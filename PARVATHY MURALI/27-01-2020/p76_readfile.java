import java.io.DataInputStream;
import java.io.FileInputStream;

public class p76_readfile {

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
			System.out.println("Error occured");
		}

	}

}
