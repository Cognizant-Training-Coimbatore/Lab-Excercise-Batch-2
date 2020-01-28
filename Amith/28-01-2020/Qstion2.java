import java.util.ArrayList;
import java.util.Iterator;

public class Qstion2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(23);
		list.add(32);
		list.add(11);
		Iterator it1=list.iterator();
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
		}
	}

}
