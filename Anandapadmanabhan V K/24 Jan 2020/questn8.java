import java.util.Scanner;

public class questn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int v=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='a' ||str.charAt(i)=='E' ||str.charAt(i)=='e' ||str.charAt(i)=='I' ||str.charAt(i)=='i' ||str.charAt(i)=='O' ||str.charAt(i)=='o' ||str.charAt(i)=='U' ||str.charAt(i)=='u' )
			{
				v++;
			}
		}
		System.out.println("Number of vowels is " + v);
	}

}
