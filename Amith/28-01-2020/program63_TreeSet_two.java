import java.util.Iterator;
import java.util.TreeSet;

public class program63_TreeSet_two {

	public static void main(String[] args) 
	{
		TreeSet<String>list=new TreeSet<String>();
		list.add("abc");
		list.add("zxs");
		list.add("gsh");
		list.add("yts");
		list.add("hgj");
		list.add("cax");
		System.out.println(list);
		Iterator it1=list.iterator();
		System.out.println("using iterator  ");
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
		}
		System.out.println("using for loop");
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}

}
