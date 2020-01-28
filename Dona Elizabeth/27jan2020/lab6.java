import java.io.FileInputStream;
import java.io.IOException;

public class lab6 {
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
