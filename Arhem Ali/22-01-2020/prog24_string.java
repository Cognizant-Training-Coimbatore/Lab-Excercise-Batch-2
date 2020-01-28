import java.util.Scanner;

public class prog24_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String str=sc.nextLine();
		String p;
		p=str.toUpperCase();
		System.out.println("    "+p);
		int x=str.length();
		System.out.println("length:  "+x);
		

	}

}
