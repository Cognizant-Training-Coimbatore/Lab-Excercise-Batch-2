import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;
public class question14 {

	public static void main(String[] args) {
		TreeSet<Integer> list1 = new TreeSet <Integer>();
		TreeSet<Integer> list2 = new TreeSet <Integer>();
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
		list2 = (TreeSet<Integer>)list1.headSet(7);
		Iterator<Integer> it1=list2.iterator();
		while(it1.hasNext())
		{
			Object obj= it1.next();
			System.out.println(obj);
		}
		input.close();


	}

}
 