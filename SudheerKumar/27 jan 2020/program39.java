import java.io.FileOutputStream;
import java.io.PrintStream;

public class program39 {

	public static void main(String[] args) {
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout=new FileOutputStream("D:\\myfile.txt");
			p=new PrintStream(fout);
			p.println("hello world line1");
			p.println("hello world line2");
			p.println("hello world line3");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("error in file");
		}

	}

}
