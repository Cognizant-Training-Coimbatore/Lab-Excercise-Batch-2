import java.util.ArrayList;
import java.util.Scanner;

public class program21_insert_element {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of the array");
		for(int i=0;i<5;i++)
		{
			ar.add(sc.nextInt());
		}
		System.out.println("Elements of the array:"+ar);
		System.out.println("Enter the element to be inserted");
		int a1=sc.nextInt();
		System.out.println("Enter the position to insert the element");
		int a2=sc.nextInt();
		try
		{
			ar.add(a2, a1);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		System.out.println("New array:"+ar);
		
		

	}

}
