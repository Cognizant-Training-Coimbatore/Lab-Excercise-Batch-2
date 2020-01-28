import java.util.Scanner;

public class prgm10_java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = sc.next();
		int len = str1.length();
		String str2 = "";
		for(int i=len-1;i>=0;i--)
		{
			str2= str2 + str1.charAt(i);
		}
System.out.println("The reverse of the string is : "+ str2);
	}

}
