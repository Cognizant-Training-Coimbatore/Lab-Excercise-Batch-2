
import java.util.Iterator;
import java.util.TreeSet;

public class prog58_treeset {

	public static void main(String[] args) {
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("venkaet");
		myset.add("Arhem");
		myset.add("Jseem");
		System.out.println(myset);
				
		Iterator it1=myset.iterator();
		while(it1.hasNext()) 
		{
			Object obj=it1.next();
			System.out.println(obj);
		}
		
	}

}
