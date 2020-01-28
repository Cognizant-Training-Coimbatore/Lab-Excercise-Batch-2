import java.util.Scanner;

public class exercise27_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		if(str.length()==0)
			throw new NullPointerException("the string is empty");
		else
			System.out.println("The length is : " + str.length());
	}

}
