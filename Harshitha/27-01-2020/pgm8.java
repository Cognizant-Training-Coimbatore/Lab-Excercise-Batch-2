
import java.io.FileOutputStream;
import java.io.PrintStream;
public class pgm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try {
			fout=new FileOutputStream("D:\\myfile.txt");
			p=new PrintStream(fout);
			p.println("Hello world line1");
			p.println("Hello world line2");
			p.println("Hello world line3");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("Error in file");
		}
	}

}
