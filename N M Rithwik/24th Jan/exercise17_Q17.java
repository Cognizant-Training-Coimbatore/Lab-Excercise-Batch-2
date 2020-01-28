import java.util.Scanner;

public class exercise17_Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,reverse="";
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.next();
		n = str.length();
		n--;
		System.out.println("Reverse of the string : ");
		while(n>=0)
		{
			reverse = reverse + str.charAt(n);
			n--;
		}
		System.out.print(reverse);
	}

}
