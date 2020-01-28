package exception_handling;

import java.io.FileInputStream;

class filemgmt
{
	void fileread() throws IOException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("B:/myfile.txt");
		int k;
	
		while(k= fis.read()!=-1)

{
	System.out.println((char)k);
}
fis.close();
	}
}
public class exception_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
