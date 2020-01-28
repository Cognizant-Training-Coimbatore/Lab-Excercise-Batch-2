import java.util.ArrayList;
import java.util.Scanner;

public class question3_insert_elemet {

	public static void main(String[] args) 
	{
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(200);
		in.add(300);
		in.add(150);
		in.add(900);
		in.add(500);
		System.out.println("The elements of the arraylist are"+in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a new number");
		int n=sc.nextInt();
		in.add(1,n);
		System.out.println("The new arraylist "+in);
		
		
	}

}
