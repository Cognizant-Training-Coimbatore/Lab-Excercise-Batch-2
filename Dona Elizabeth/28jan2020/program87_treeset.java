import java.util.Iterator;
import java.util.TreeSet;

public class program87_treeset {

	public static void main(String[] args) {
		TreeSet<String> treeset1=new TreeSet<String>();
		treeset1.add("Abhi");
		treeset1.add("Sani");
		treeset1.add("Gopi");
		treeset1.add("Sani");
		System.out.println(treeset1);
		
		Iterator itr1=treeset1.iterator();
		while(itr1.hasNext())
		{
			Object obj=itr1.next();
			System.out.println(obj);
		}
		
	}

}
