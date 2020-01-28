import java.util.Iterator;
import java.util.TreeSet;

public class pgm31_treeSet {

	public static void main(String[] args) {
		// Treeset-ascending order
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("sreedhar");
		myset.add("kv");
		myset.add("bisnu");
		myset.add("sreedhar");
		System.out.println(myset);
		Iterator iterator1=myset.iterator();
		while(iterator1.hasNext())
			{
			Object obj=iterator1.next();
			System.out.println(obj);
			}

	}

}
