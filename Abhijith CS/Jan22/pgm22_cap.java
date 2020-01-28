import java.util.Scanner;

public class pgm22_cap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter a string :");
		str = sc.nextLine();
		System.out.println(str.toUpperCase());
		System.out.println("Length of the string : "+str.length());
		sc.close();
	}

}
