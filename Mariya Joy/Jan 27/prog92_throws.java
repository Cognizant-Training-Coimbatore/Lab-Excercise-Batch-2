
import java.io.FileInputStream;
import java.io.IOException;
class fileMgmt
{
	void fileRead() throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("D:/myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}
public class prog92_throws{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
