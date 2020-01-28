import java.util.*;
public class question12 {

	public static void main(String[] args) 
	{
		Set<Integer> list1 = new HashSet <Integer>();
		Set<Integer> list2 = new HashSet <Integer>();
		Scanner input= new Scanner(System.in);
		int p;
		System.out.println("Enter first set of elements (Press 1 to stop entering) :");
		for(;;)
		{
			p = input.nextInt();
			if(p==1)
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
			if(p==1)
			{
				break;
				
			}
			else
			{
				list2.add(p);
			}
		}
		list1.retainAll(list2);
		System.out.println(list1);
		input.close();

	}

}
