import java.util.Iterator;
import java.util.TreeSet;

public class exercise28_Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> list1 = new TreeSet<Integer>();
		TreeSet<Integer> list2 = new TreeSet<Integer>();
		list1.add(10);
		list1.add(2);
		list1.add(3);
		list1.add(40);
		list1.add(5);
		System.out.println(list1);
		
		list2 = (TreeSet)list1.headSet(7);
		
		Iterator iterator1 = list2.iterator();
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}
	}
}
