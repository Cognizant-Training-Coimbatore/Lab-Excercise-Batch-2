import java.util.Iterator;
import java.util.TreeSet;

public class pgm_treeset {

	public static void main(String[] args) {
	TreeSet<String> myset=new TreeSet<String>();
	myset.add("nikhila");
	myset.add("kamal");
	myset.add("anu");
	myset.add("ammu");
	System.out.println(myset);
	Iterator iterator1=myset.iterator();
	while(iterator1.hasNext())
	{
		Object obj=iterator1.next();
		System.out.println(obj);
	}

	}

}
