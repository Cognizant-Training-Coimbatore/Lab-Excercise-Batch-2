import java.io.FileInputStream;
import java.io.IOException;
class fileMgmt
{
	void fikeRead()throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("B:/myfile.text");
		int k;
		while((k=fis.read()) !=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}
public class prog82_file_ipstream 
{

	public static void main(String[] args)
	{
		
	}

}
