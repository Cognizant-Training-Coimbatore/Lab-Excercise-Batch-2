import java.io.FileOutputStream;
import java.io.PrintStream;

public class prog51 {

	public static void main(String[] args) {
		FileOutputStream fout;
		PrintStream p;
		try
		{
			fout=new FileOutputStream("D:\\myfile.txt");
			p=new PrintStream(fout);
			p.println("Hello fst line");
			p.println("2ND LINE");
			p.println("3rd line");
			p.close();
		}
		catch(Exception e) 
		{
			System.err.println("Errorr in file");
		}
		
		

	}

}
