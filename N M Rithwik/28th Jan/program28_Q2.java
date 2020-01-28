import java.util.ArrayList;
import java.util.Iterator;

public class program28_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		System.out.println(list1.contains(200));
		
		Iterator iterator1 = list1.iterator();
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}
	}
}
