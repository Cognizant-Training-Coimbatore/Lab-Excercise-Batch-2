import java.util.Iterator;
import java.util.TreeSet;

public class program53_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet< String > myset = new TreeSet<String>();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("perl");
		myset.add("unix");
		myset.add("ada");
		myset.add("java");
		System.out.println(myset);
		Iterator iterate = myset.iterator();
		System.out.println("\n"+"Using Iterator Object...");
		while(iterate.hasNext()) {
		Object ob = iterate.next();
			System.out.println(ob);
		}
		System.out.println("\n"+"Using for loop.....");
for(Object ob :myset) {
	System.out.println(ob);
}

	}

}
