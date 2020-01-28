import java.io.FileInputStream;

class filemgnt
{
	void fileRead() throws IOException
	{
		FileInputStream fis = null;
		fis = new FileInputStream("B:/myfile.txt");
		int k;
		while((k=fis.read())!= -1)
		{
			System.out.println((char) k);
		}
		fis.close();
	}
}

public class checked_exception {

	public static void main(String[] args)
	{
		

	}

}
