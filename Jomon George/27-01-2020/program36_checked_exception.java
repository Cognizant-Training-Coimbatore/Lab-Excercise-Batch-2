package demo;

import java.io.FileInputStream;

class fileMgmt
{
	void fileRead() throws IOException
	{
		FileInputStream fils = null;
		fils = new FileInputStream("B:/myfile.txt");
		int k;
		while((k = fils.read()) != -1)
		{
			System.out.println((char)k);
		}
		fils.close();
	}
}
public class program36_checked_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fileMgmt obj = new fileMgmt();
		obj.fileRead();
	}

}
