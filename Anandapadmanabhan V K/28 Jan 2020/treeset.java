import java.util.Iterator;
import java.util.TreeSet;

public class treeset 
{

	public static void main(String[] args)
	{

			TreeSet<String> myset=new TreeSet<String>();
			myset.add("anandu");
			myset.add("jim");
			myset.add("manu");
			myset.add("zak");
			System.out.println(myset);
			
			Iterator iterator1=myset.iterator();
			
			while(iterator1.hasNext())
			{
				Object obj=iterator1.next();
				System.out.println(obj);
			}
			
	}

}
