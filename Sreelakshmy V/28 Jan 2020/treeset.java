import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("sree");
		myset.add("lakshmi");
		myset.add("Sasna");
		myset.add("Sunder");
		System.out.println(myset);
		Iterator iterator1=myset.iterator();
		while(iterator1.hasNext()) {
			Object obj=iterator1.next();
		
		System.out.println(obj);
	}

}
}