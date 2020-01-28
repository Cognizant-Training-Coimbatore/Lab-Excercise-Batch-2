import java.util.Iterator;
import java.util.TreeSet;

public class program_treeset {

	public static void main(String[] args) {

		//Treeset
		System.out.println("\n\n TreeSet");
		TreeSet<String>myset2=new TreeSet<String>();
		myset2.add("Venkat");
		myset2.add("Yuvaraj");
		myset2.add("Senthil");
		System.out.println(myset2);
		
		//to iterate or traverse through the list
		System.out.println("Using iterator object..");
		Iterator it1 = myset2.iterator();
		while(it1.hasNext())
		{
			Object obj1=it1.next();
			System.out.println(obj1);
		}
		System.out.println("Using for loop..");
		for(Object ob:myset2)
		{
			System.out.println(ob);
		}
	}

}
