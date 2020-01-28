import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Qno_9_28 {

	public static void main(String[] args) {
		List<Integer>mylist=new LinkedList<Integer>();
		mylist.add(100);
		mylist.add(300);
		mylist.add(200);
		mylist.add(400);
		mylist.add(500);
		System.out.println(mylist);
		//Iterator it1=mylist.iterator();
		Iterator p =mylist.listIterator(2);
		System.out.println("Using Iterator object...");
		while(p.hasNext()) 
		{
			Object obj=p.next();
			System.out.println(obj);
			
		}

	}

}
