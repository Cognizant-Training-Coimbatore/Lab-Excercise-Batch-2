import java.io.FileInputStream;
import java.io.IOException;

public class program6_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		void fileRead() throws IOException
		
		 {
		FileInputStream fis=null;
		fis=new FileInputStream(C/myfile.txt);
		int k;
		while((k=fis.read()) != -1) {
			System.out.println((char)k);
		}
		fis.close();

	}
		}

}
