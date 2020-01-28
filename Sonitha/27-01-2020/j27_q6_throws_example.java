import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class j27_q6_throws_example {
	
	
		void t1() throws IOException{
			FileOutputStream fout = new FileOutputStream("D:\\myfile.txt");
			PrintStream p = new PrintStream(fout);
			p = new PrintStream(fout);
			p.println("hello world line 1");
			p.println("hello world line 2");
			p.close();
			
			
		}
	

	public static void main(String[] args) {
		

	}

}
