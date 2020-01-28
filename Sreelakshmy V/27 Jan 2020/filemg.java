import java.io.FileInputStream;
class fileMgmt1
{
	void fileRead()throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("B:/myfile.txt");
		int k;
		while((k=fis.read() ) !=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}
public class filemg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
