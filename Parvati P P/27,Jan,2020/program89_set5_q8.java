package Package2;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class program89_set5_q8 {

	public static void main(String[] args) {
		FileOutputStream fout;
	    PrintStream p;
	    System.out.println("Enter name");
	    Scanner sc = new Scanner(System.in);
	String n=sc.nextLine();
	System.out.println("Enter address");
	   
	String x=sc.nextLine();
	System.out.println("Enter aadhar");
	   
	String w=sc.nextLine();
	System.out.println("Do you want to save (1/0)");
	int y=sc.nextInt();
	if(y==1) {
	try {
	fout=new FileOutputStream("D:\\myfile.txt");
	    p=new PrintStream(fout);
	    p.println(n);
	    p.println(x);
	    p.println(w);
	    p.close();}
	    catch(Exception e){
	System.err.println("Error in the file");
	}}
	else if(y==0)
	{
	System.out.println("record not saved");
	}
	else
	{
	System.out.println("enter the correct value");
	}

	}

}
