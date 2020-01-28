import java.util.ArrayList;
import java.util.Iterator;

public class question2_iterate {

	public static void main(String[] args) 
	{
		ArrayList<Integer> itr=new ArrayList<Integer>();
		itr.add(100);
		itr.add(500);
		itr.add(400);
		itr.add(300);
		Iterator i=itr.iterator();
		while(i.hasNext())
		{
			Object ob=i.next();
			System.out.println(ob);
			}
	}
	

}
