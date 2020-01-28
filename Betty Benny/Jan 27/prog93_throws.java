import java.io.FileInputStream;
import java.io.IOException;
class fileMgmnt
{
	void fikeRead()throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("E:/myfile.text");
		int k;
		while((k=fis.read()) !=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}
public class prog93_throws{

	public static void main(String[] args)
	{
		
	}

}
