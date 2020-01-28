import java.util.Scanner;

public class prog_printing_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st no:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd no:");
        int b = sc.nextInt();
        int i;
        for(i=a;i<=b;i++)
        {
        	System.out.println(i);
        }
        
	}

}
