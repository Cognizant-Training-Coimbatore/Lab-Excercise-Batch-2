import java.util.Iterator;
import java.util.TreeSet;

public class program4_treeset {

	public static void main(String[] args) {
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("shilpa");
		myset.add("sredha");
		myset.add("mansi");
		myset.add("tuttu");
		
		System.out.println(myset);
		
		Iterator iterator1 = myset.iterator();
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}

	}

}
