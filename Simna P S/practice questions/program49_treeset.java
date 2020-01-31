import java.util.Iterator;
import java.util.TreeSet;

public class program49_treeset 
{

	public static void main(String[] args) 
	{
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("perl");
		myset.add("unix");
		myset.add("ada");
		myset.add("java");
		System.out.println(myset);
		Iterator t1 = myset.descendingIterator();
		System.out.println("using iterator object....");
		while(t1.hasNext())
		{
			Object obj = t1.next();
			System.out.println(obj);
		}
		System.out.println("using for loop...");
		{
			for(Object obj:myset)
			{
				System.out.println(obj);
			}

		}

	}

}
