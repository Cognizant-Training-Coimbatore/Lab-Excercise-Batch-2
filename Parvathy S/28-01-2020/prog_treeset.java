import java.util.Iterator;
import java.util.TreeSet;

public class prog_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("a");
		myset.add("b");
		myset.add("c");
		myset.add("d");
        System.out.println(myset);
        Iterator iterator1=myset.iterator();
        while(iterator1.hasNext())
        	{
        	   Object obj = iterator1.next();
        	   System.out.println(obj);
        	}
	}

}
