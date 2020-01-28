import java.io.FileInputStream;
class filemgmt
{
	void fileread() throws IOException
	{
		File InputStream fis=null;
		fis = new FileInputStream("B:/myfile.txt");
		int k;
		while((k=fis.read())!= -1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}
public class prog48 {

	public static void main(String[] args) 
	{
		
	}

}
