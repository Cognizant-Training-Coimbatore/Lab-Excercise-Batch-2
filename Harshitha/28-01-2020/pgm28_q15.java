import java.util.Iterator;
import java.util.TreeSet;

public class pgm28_q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.add(1);
		ts1.add(2);
		ts1.add(3);
		ts1.add(4);
		ts1.add(5);
		TreeSet<Integer> ts2=new TreeSet<Integer>();
		ts2=(TreeSet)ts1.tailSet(3);
Iterator iter=ts2.iterator();
		
		while(iter.hasNext())
		{
			Object obj=iter.next();
			System.out.println(obj);
		}
	}

}
