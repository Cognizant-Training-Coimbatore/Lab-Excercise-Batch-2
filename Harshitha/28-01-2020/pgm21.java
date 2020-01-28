import java.util.Iterator;
import java.util.TreeSet;

public class pgm21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("Venkat");
		myset.add("Balu");
		myset.add("Murali");
		myset.add("Jikky");
	System.out.println(myset);
	Iterator iter=myset.iterator();
	System.out.println("Using iterator object");
	while(iter.hasNext())
	{
		Object obj=iter.next();
		System.out.println(obj);
	}
	System.out.println("Using for loop");	
	for(Object obj:myset)
   	 System.out.println(obj);
	}
	}


