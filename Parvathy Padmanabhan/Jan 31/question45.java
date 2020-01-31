import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class question45
{

	public static void main(String[] args) 
	{
		Set<Integer> list1 = new HashSet <Integer>();
		Set<Integer> list2 = new HashSet <Integer>();
		Scanner input= new Scanner(System.in);
		int p;
		System.out.println("Enter first set of elements (Press -1 to stop entering) :");
		for(;;)
		{
			p = input.nextInt();
			if(p==-1)
			{
				break;
				
			}
			else
			{
				list1.add(p);
			}
		}
		System.out.println("Enter second set of elements (Press 1 to stop entering) :");
		for(;;)
		{
			p = input.nextInt();
			if(p==-1)
			{
				break;
				
			}
			else
			{
				list2.add(p);
			}
		}
		System.out.println("First set : " +list1);
		System.out.println("Second set : " +list2);
		System.out.println("Common elements are:  "+list1.retainAll(list2));
		System.out.println(list1);
		input.close();

	}

}
