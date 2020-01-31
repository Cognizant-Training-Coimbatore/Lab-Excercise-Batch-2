import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str1 = sc.nextLine();
		int i,len;
		len = str1.length();
		String rev="";
		for(i=len-1;i>=0;i--)
		{
			rev = rev + str1.charAt(i);
		}
        System.out.println("Reverse of the string is: "+rev);
	}
		

	}

