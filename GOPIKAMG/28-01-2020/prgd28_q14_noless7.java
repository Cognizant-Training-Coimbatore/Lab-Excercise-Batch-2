import java.util.Iterator;
import java.util.TreeSet;

public class prgd28_q14_noless7 {

	public static void main(String[] args) 
	{
		TreeSet<Integer> t1=new TreeSet<Integer>();
		TreeSet<Integer> t2=new TreeSet<Integer>();
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		t1.add(5);
		t1.add(6);
		t1.add(7);
		t1.add(8);
		t1.add(9);
		t1.add(10);
		t2=(TreeSet)t1.headSet(7);
		Iterator iterator;
		iterator=t2.iterator();
		System.out.println("The numbers are");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next() + " ");
		}
		
		

	}

}
