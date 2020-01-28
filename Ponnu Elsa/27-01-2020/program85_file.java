import java.io.FileOutputStream;
import java.io.PrintStream;

public class program85_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout = new FileOutputStream("C:\\CTS selenium\\myfile.txt");
			p= new PrintStream(fout);
			p.println("Hello 1");
			p.println("Hello 2");
			p.println("Hello 3");
			p.close();
		}
		catch (Exception e)
		{
			System.err.println("Error");
		}
	}

}
