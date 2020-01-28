import java.util.Iterator;
import java.util.TreeSet;

public class Treeset2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("Divya");
		myset.add("Diya");
		myset.add("Bindu");
		myset.add("Rajan");
		System.out.println(myset);
		
		Iterator iterator1=myset.descendingIterator();
		System.out.println("Using Iterator....");
		while(iterator1.hasNext())
		{
			Object obj=iterator1.next();
			System.out.println(obj);
		}
		System.out.println("Using for loop...");
		for(Object obj:myset)
		{
			System.out.println(obj);
		}


	}

}
