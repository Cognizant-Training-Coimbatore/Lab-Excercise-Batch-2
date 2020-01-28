import java.util.Iterator;
import java.util.TreeSet;

public class prg_87_Q2 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("per1");
		myset.add("unix");
		myset.add("ada");
		myset.add("java");
		System.out.println(myset);
		Iterator it1 = myset.descendingIterator();
		System.out.println("Using Iterator object");
		while(it1.hasNext())
		{
			Object obj = it1.next();
			System.out.println(obj);
			
			
			
		}
	}
}