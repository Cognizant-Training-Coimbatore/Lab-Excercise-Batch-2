import java.util.Scanner;

public class prog_reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		int i,len;
		String rev="";
		len = str.length();
		for(i=len-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
        System.out.println("Reverse of the string is: "+rev);
	}

}
