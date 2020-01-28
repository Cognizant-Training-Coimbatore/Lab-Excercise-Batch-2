package exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

class filemngmt
{
	void fileread() throws IOException
	{
		FileInputStream fis = null;
		fis = new FileInputStream("Myfile.txt");
		int k;
		while ((k=fis.read()) != -1)
				{
					System.out.println((char)k);
				}
		fis.close();
		
	}
}
public class pgm05_27_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
