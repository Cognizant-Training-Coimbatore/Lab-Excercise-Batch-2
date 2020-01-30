import java.io.FileOutputStream;
import java.io.PrintStream;

public class pgm_filestream {

	public static void main(String[] args) {
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout=new FileOutputStream("e:\\myfile.txt");
			p=new PrintStream(fout);
			p.println("hello world line  ");
			p.println("hello world line ");
			p.println("hello world line ");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("error in file");
		}
	}

}
