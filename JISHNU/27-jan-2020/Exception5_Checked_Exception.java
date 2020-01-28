package day5;

import java.io.FileInputStream;
import java.io.IOException;

class fileMgmt

{
	void fileRead() throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("B:/myfile.txt");
		int k;
		while((k=fis.read() ) !=-1)
		{
			System.out.print((char)k);
		}
		fis.close();
	}
}

public class Exception5_Checked_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileMgmt obj=new fileMgmt();
		obj.fileRead();
		

	}

}
