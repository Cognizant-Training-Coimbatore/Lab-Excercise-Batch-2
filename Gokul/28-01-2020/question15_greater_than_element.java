import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import sun.jvm.hotspot.ui.SAEditorPane;

public class question15_greater_than_element {

	public static void main(String[] args)
	{
		
		TreeSet<Integer> b2=new TreeSet<Integer>();
		
		b2.add(1);
		b2.add(2);
		b2.add(3);
		b2.add(4);
		b2.add(5);
		b2.add(6);
		b2.add(7);
		b2.add(8);
		b2.add(9);
		b2.add(10);
		b2.add(11);
		b2.add(12);
		b2.add(13);
		b2.add(14);
		b2.add(15);
		b2.add(16);
		
		
		
		System.out.println("Elements of b2 "+b2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		b2= (TreeSet<Integer>)b2.tailSet(n); 
		Iterator<Integer> itr= b2.iterator();
		System.out.println();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
			
		}
		
		
		

	}

}
