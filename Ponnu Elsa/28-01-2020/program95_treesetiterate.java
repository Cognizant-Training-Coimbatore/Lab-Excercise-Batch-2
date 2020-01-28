import java.util.TreeSet;
import java.util.Iterator;


public class program95_treesetiterate  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("Ponnu");
		myset.add("Parvathy");
		myset.add("Dona");
		System.out.println(myset);
		Iterator iterator1 = myset.iterator();
		while(iterator1.hasNext())
		{
				Object obj = iterator1.next();
			System.out.println(obj);
		}
	}

}
