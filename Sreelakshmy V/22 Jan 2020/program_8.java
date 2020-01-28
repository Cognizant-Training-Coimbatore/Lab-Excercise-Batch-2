import java.util.Scanner;

public class program_8 {

	public static void main(String[] args) {
	int x;
	System.out.println("Enter no");
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	if(x>0)
		System.out.println("Positive");
	if(x<0)
		System.out.println("Negative");
	}

}
