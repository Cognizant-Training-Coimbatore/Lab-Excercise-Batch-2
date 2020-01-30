import java.util.Iterator;
import java.util.TreeSet;


public class Program_88_treeset {

	public static void main(String[] args) {
		TreeSet<String>myset=new TreeSet<String>();
		myset.add("Diya");
		myset.add("Dia");
		myset.add("Diy");
		myset.add("Dya");
		System.out.println(myset);
		
		Iterator iterator1=myset.iterator();
		while(iterator1.hasNext())
		{
			Object obj=iterator1.next();
			System.out.println(obj);
		}

	}

}
