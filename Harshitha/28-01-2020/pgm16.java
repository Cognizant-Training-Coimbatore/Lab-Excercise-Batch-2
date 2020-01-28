import java.util.Iterator;
import java.util.TreeSet;
public class pgm16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("Venkat");
		myset.add("Balu");
		myset.add("Murali");
		myset.add("Jikky");
	System.out.println(myset);
	Iterator iter=myset.iterator();
	while(iter.hasNext())
	{
		Object obj=iter.next();
		System.out.println(obj);
	}
		
	}

}
