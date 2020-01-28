import java.util.*;
public class example4treeset {

	public static void main(String[] args) {
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("Parvathy");
		myset.add("Padmanabhan");
		myset.add("Rema");
		myset.add("Devika");
		myset.add("Parvathy");
		myset.add("Parvathy");
		System.out.println(myset);
		Iterator<String> it1=myset.iterator();
		while(it1.hasNext())
		{
			Object obj= it1.next();
			System.out.println(obj);
		}
	}

}
