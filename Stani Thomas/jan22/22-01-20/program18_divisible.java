import java.util.Scanner;

public class program18_divisible {

	public static void main(String[] args) {
		int n;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%7==0)
        	System.out.println("No. is divisible by 7");
        else
        	System.out.println("No. is not divisible by 7");
        	
	}

}
