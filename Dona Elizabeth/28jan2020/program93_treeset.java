import java.util.Iterator;
import java.util.TreeSet;

public class program93_treeset {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Java");
		ts.add("selenium");
		ts.add("c++");
		ts.add("perl");
		ts.add("unix");
		ts.add("Java");
		ts.add("ada");
		System.out.println(ts);
		Iterator it=ts.iterator();
		System.out.println("Iteretor : ");
		while(it.hasNext())
		{
			Object obj=it.next();
			System.out.println(obj);
		}
		System.out.println("using for loop : ");
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
	}

}
