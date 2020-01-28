import java.util.Scanner;

public class program24_name_length {

	public static void main(String[] args) 
	{
	String name,upp;
	int l;
	System.out.println("enter your name");
	Scanner scanner= new Scanner(System.in);
	name=scanner.nextLine();
	upp=name.toUpperCase();
	l=name.length();
	System.out.println("neme is "+upp+" length is "+l);

	}

}
