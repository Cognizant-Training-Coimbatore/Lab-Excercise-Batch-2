import java.util.Iterator;
import java.util.TreeSet;

public class prgd28_q15_greater {

	public static void main(String[] args)
	{
		TreeSet <Integer> t1=new TreeSet<Integer>();
		TreeSet <Integer> t2=new TreeSet<Integer>();
		
		t1.add(86);
		t1.add(23);
		t1.add(33);
		t1.add(46);
		t1.add(59);
		t1.add(65);
		t1.add(73);
		t1.add(18);
		t1.add(19);
		t1.add(90);
		t2=(TreeSet)t1.tailSet(46);
		Iterator iterator;
		iterator=t2.iterator();
		System.out.println("The numbers are");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next() + " ");
		}
	}

}
