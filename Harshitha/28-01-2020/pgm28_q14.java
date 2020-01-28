import java.util.Iterator;
import java.util.TreeSet;

public class pgm28_q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("Apple");
		ts1.add("Orange");
		ts1.add("Mango");
		ts1.add("Grapes");
		ts1.add("Banana");
		System.out.println("First Set:"+ts1);
		TreeSet<String> ts2=new TreeSet<String>();
		ts2=(TreeSet)ts1.headSet("Mango");
		Iterator iter=ts2.iterator();
		
		while(iter.hasNext())
		{
			Object obj=iter.next();
			System.out.println(obj);
		}
	}

}
