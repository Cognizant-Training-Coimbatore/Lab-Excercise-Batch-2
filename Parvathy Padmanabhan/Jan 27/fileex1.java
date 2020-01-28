import java.io.FileInputStream;
import java.io.IOException;
class fileex
{
	void fileread() throws IOException
	{
		FileInputStream fis =null;
		fis = new FileInputStream("My file.txt");
		int k;
		while(k=fis.read() == 'true')
		{
			System.out.println(int(k));
		}
		fis.close();
	}
}
public class fileex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
