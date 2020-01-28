import java.util.Scanner;

public class j24_q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		int len = str.length();
		String rev ="";
		for (int i= len-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
			}
System.out.println("The reverse of the string is : "+ rev);
	}

}
