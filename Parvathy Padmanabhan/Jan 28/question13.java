import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
public class question13 {

	public static void main(String[] args) {
		Set<Integer> list1 = new TreeSet <Integer>();
		Set<Integer> list2 = new TreeSet <Integer>();
		
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
		Set<Integer> list3 = new TreeSet <Integer>(list1);
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
		list3.addAll(list2);
		System.out.println(list3);
		input.close();


	}

}
 