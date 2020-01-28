import java.util.Scanner;

public class program17_string_name {

	public static void main(String[] args) {
		String str;
		System.out.println("enter your name");
		Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        String str1=str.toUpperCase();
        int l=str.length();
        System.out.println("Your name is "+str1);
        System.out.println("length of string is "+l);

	}

}
