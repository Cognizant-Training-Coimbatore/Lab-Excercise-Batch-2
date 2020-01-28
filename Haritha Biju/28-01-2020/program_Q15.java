import java.util.Scanner;
import java.util.TreeSet;

//Write a Java program to get the element in a tree set which is strictly greater
//than or equal to the given element
public class program_Q15 {

	public static void main(String[] args)
	{
		TreeSet<Integer> myset=new TreeSet<Integer>();
		myset.add(51);
		myset.add(10);
		myset.add(2);
		myset.add(43);
		myset.add(15);
		myset.add(14);
		myset.add(6);
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Elements greater than or equal to"+ a+ "  are:");
		for(int x:myset)
		{
			if(x>=a)
			{
				System.out.print(x+" ");

			}
		}

	}

}
