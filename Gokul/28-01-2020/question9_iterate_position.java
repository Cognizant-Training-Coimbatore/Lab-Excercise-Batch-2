import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class question9_iterate_position {

	public static void main(String[] args) 
	{
		LinkedList<Integer> in=new LinkedList<Integer>();
		
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(400);
		in.add(500);
		System.out.println("Enter the index");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i<in.size();i++)
		{
			System.out.println(in.get(i));
		}
			

	}

}
