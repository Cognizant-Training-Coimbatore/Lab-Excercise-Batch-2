import java.util.Iterator;
import java.util.TreeSet;

public class program47_treeset {

	public static void main(String[] args) {
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("venkat");
		myset.add("Ravi");
		myset.add("Abdul");
		myset.add("Janaki");
		System.out.println(myset);//sorts in ascending order

		Iterator iterator1 = myset.iterator();//To iterate through the list
		while(iterator1.hasNext()) {
			Object obj = iterator1.next();
			System.out.println(obj);
		}
		
	}

}
