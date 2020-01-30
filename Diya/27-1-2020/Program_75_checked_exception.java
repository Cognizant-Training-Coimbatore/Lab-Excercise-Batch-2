import java.io.FileInputStream;
import java.io.IOException;

class fileMgmt
{
	void fileRead()throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("b:/myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}
public class Program_75_checked_exception {

	public static void main(String[] args) {
		
		

	}

}
