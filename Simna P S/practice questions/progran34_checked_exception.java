import java.io.FileInputStream;
class fileMgnt
{
	void fileRead() throws IOException
	{
		FileInputSteam f1s=null;
		f1s = new FileInputSteam("B:/myfile.txt");
		int k;
		while((k=f1s.read()) !=-1)
		{
			System.out.println((char)k);
		}
		f1s.close();
	}
}
public class progran34_checked_exception 
{

	public static void main(String[] args) 
	{
		fileMgnt obj = new fileMgnt();
		obj.fileread();

	}

}
