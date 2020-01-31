import java.io.FileInputStream;
import java.io.IOException;

class fileMngmt
{
	void fileRead() throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("B://myfille.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}

public class program79_throws {

	public static void main(String[] args) {
		
	}

}
