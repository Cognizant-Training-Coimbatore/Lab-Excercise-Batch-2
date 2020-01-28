import java.util.Iterator;
import java.util.TreeSet;

public class program_treeset {

	public static void main(String[] args)
	{
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("Divya");
		myset.add("Diya");
		myset.add("Bindu");
		myset.add("Rajan");
		System.out.println(myset);
		
		Iterator iterator1=myset.descendingIterator();
		while(iterator1.hasNext())
		{
			Object obj=iterator1.next();
			System.out.println(obj);
		}

	}

}
