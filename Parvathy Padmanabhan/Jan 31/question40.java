import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class question40 {

	public static void main(String[] args)
	{
		HashSet<Integer> list1 = new HashSet <Integer>();
		Scanner input= new Scanner(System.in);
		int p;
		System.out.println("Enter elements (Press -1 to stop entering) :");
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
		System.out.println("Original Set: " + list1);
		HashSet<Integer> list2 =(HashSet<Integer>)list1.clone();
		System.out.println("Cloned set: " +list2);
		input.close();
	}

}
