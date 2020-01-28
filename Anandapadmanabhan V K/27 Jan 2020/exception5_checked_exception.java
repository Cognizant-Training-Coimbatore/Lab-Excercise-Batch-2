import java.io.FileInputStream;

class fileMgmt
{
	void fileRead() throws IOException
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
public class exception5_checked_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
