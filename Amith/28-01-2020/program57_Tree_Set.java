import java.util.Iterator;
import java.util.TreeSet;

public class program57_Tree_Set 
{

	public static void main(String[] args) 
	{
		
		TreeSet<String>myset=new TreeSet<String>();
		myset.add("amith");
		myset.add("zarhem");
		myset.add("messi");
		myset.add("ronaldo");
		System.out.println(myset);
		Iterator iterator1= myset.iterator();
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}
	}

}