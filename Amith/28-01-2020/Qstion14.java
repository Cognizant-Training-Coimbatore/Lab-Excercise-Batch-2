import java.util.Iterator;
import java.util.TreeSet;

public class Qstion14 {

	public static void main(String[] args) 
	{
		TreeSet<Integer>list=new TreeSet<Integer>();
		list.add(2);
		list.add(8);
		list.add(6);
		list.add(99);
		list.add(55);
		list.add(1);
		System.out.println(list);
		Iterator it1=list.iterator();
		while(it1.hasNext())
		{
			Object obj=it1.next();
			int a=(int) obj;
			if(a<7)
			{
				System.out.println(a);
			}
		}

	}

}
