import java.io.FileInputStream;
import java.io.IOException;

class fileMgmnt
{
	void fileRead()throws IOException
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
public class date_27_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
