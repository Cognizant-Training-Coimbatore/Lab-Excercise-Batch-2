import java.io.FileInputStream;
import java.io.IOException;

class fileMmgmt
{
	void fileRead() throws IOException
	{
		FileInputStream files=null;
		files=new FileInputStream("D:/myfile.txt");
		int k;
		while((k=files.read())!=-1)
		{
			System.out.println((char)k);
		}
	}	files.close();
}
public class program_31_IOexception
{
	public staatic void main(String[] args)
	{
		fileMmgmt
	}
}