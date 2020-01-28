import java.util.Scanner;

public class Ass7 {

	public static void main(String[] args) {
		String s,r;
		int n,i;
		System.out.println("Enter string to reverse");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		n=s.length();
		r="";
		for(i=n-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println("Reversed string=" +r);
	}

}
