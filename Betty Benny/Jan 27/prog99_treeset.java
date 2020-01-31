import java.util.Iterator;
import java.util.TreeSet;

public class prog99_treeset {

	public static void main(String[] args) 
	{
		TreeSet<String>myset=new TreeSet<String>();
		myset.add("Betty");
		myset.add("Blessy");
		myset.add("Biniya");
		myset.add("Ethan");
		System.out.println(myset);
		Iterator iterator1=myset.iterator();
		while(iterator1.hasNext())
		{
			Object obj=iterator1.next();
			System.out.println(obj);
		}
		
		

	}

}
