package Package2;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class program81_exception_again {

	public static void main(String[] args) {
FileOutputStream fout;
PrintStream p;
try
{
	fout=new FileOutputStream("D:\\myfile.txt");
	p=new PrintStream(fout);
	p.println("Hello world line 1");
	p.println("Hello world line 2");
	p.println("Hello world line 3");
	p.close();
}
catch (Exception e)
{
	System.err.println("Error in file");
}
	}

}
