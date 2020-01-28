import java.util.ArrayList;
import java.util.Scanner;

public class question7_Replace_second {

	public static void main(String[] args) 
	{
		ArrayList<Integer> in=new ArrayList<Integer>();
		System.out.println("Enter the replacement number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(400);
		in.add(500);
		System.out.println("Elements of the arraylist"+in);
		in.set(1,a);
		System.out.println("The elements after replacement "+in);
	}

}

