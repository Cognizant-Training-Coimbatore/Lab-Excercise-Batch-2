import java.io.FileInputStream;
class fileMgmt
{
	void fileRead() throws IOException
	{
		FileInputStream fis=null;
		fis=new FileinputStream("B:/myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);
			
		}
	fis.close();
}
}
public class pgm5_checked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
