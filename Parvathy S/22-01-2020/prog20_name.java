import java.util.Scanner;

public class prog20_name {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String str= sc.nextLine();
		String str1=str.toUpperCase();
		System.out.println("the string is:"+str1);
		System.out.println("the length of the string is:"+str1.length());
		

	}

}
