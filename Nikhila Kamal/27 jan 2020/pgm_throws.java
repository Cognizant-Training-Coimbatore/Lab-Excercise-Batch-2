import java.io.FileInputStream;
import java.io.IOException;

class filemngmnt
{
	void fileread() throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("B:/myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);
		}
	fis.close();
	}
}
public class pgm_throws {

	public static void main(String[] args) {
	

	}

}
