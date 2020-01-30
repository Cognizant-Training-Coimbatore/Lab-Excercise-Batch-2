import java.util.Iterator;
import java.util.TreeSet;

public class program44_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("fathima");
		myset.add("kavery");
		myset.add("navya");
		myset.add("betty");
		
		System.out.println(myset);
		
		Iterator itr = myset.iterator();
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
