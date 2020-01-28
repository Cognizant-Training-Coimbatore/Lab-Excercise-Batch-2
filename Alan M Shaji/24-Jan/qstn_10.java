import java.util.Scanner;

public class qstn_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n,reverse="";
		int i=0;
		System.out.print("Enter String	->	");
		n=s.next();
		int j=n.length()-1;
		for(i=0;i<n.length();i++,j--)
		{
			reverse=reverse+n.charAt(j);
		}
		if (reverse.equals(n))
			System.out.println(n+"	->	is a palindrome");
			else
			System.out.println(n+"	->	is not a palindrome");
		s.close();

	}

}
