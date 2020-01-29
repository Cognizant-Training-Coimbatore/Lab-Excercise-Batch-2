package packss;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class program8_fileinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   FileOutputStream fout;
		    
		   PrintStream p;
		try {
			fout= new FileOutputStream ("D:\\text.txt");
			p=new PrintStream(fout);
			Scanner sc=new Scanner(System.in);
			String x=sc.nextLine();
			String y=sc.nextLine();
			String z=sc.nextLine();
			System.out.println("do you want to save");
			int c=sc.nextInt();
			if(c==1) {
				System.out.println("record saved...exiting...");
			p.println(x);
			p.println(y);
			p.println(z);
	        p.close();}
			else if(c==0) {
				System.out.println("record not saved");
			    }
			else
		throw new ArithmeticException("inavlid choice");}
		catch(Throwable e) 
			{
				System.err.println("error file");
			}

		
		
		
	}

}
