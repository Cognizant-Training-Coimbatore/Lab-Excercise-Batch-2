import java.util.Scanner;

public class exercise13_string_uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		String upname;
		int l;
		System.out.println("enter your name");
		Scanner scanner=new Scanner(System.in);
		name=scanner.nextLine();
		upname=name.toUpperCase();
		l=name.length();
		System.out.println(upname);
		System.out.println("length: " +l);
		

	}

}
