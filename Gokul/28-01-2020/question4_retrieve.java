import java.util.ArrayList;
import java.util.Scanner;

public class question4_retrieve {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(200);
		a.add(500);
		a.add(800);
		a.add(1000);
		a.add(2000);
		System.out.println("The elements of the list are "+a);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index of the number");
		int n=sc.nextInt();
		System.out.println("The number is "+a.get(2));
		
		
		
	}

}
