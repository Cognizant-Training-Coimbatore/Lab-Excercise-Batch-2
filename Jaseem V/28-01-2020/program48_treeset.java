import java.util.Iterator;
import java.util.TreeSet;

public class program48_treeset {

	public static void main(String[] args)
	{
		TreeSet<String> myset =new TreeSet<String>();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("perl");
		myset.add("unix");
		myset.add("ada");
		myset.add("java");
		System.out.println(myset);
		Iterator It1 = myset.iterator();
		System.out.println("Using Iterator object....");
		while(It1.hasNext())
		{
			Object obj =It1.next();
			System.out.println(obj);
		}
		System.out.println("Using for loop....");
		for(Object obj:myset)
		{
			System.out.println(obj);
		}

	}

}
