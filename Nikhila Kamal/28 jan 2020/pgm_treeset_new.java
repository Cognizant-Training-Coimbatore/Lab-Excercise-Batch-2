import java.util.Iterator;
import java.util.TreeSet;

public class pgm_treeset_new {

	public static void main(String[] args) {
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("per1");
		myset.add("unix");
		myset.add("ada");
		myset.add("java");
		System.out.println(myset);
		Iterator iterator1=myset.iterator();
		while(iterator1.hasNext())
		{
			Object obj=iterator1.next();
			System.out.println(obj);
		}
		System.out.println("using for loop....");
		for(Object obj:myset)
		{
			System.out.println(obj);
		}

	}

}
