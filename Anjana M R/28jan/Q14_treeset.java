import java.util.Iterator;
import java.util.TreeSet;

public class Q14_treeset {

	public static void main(String[] args) {
	TreeSet<Integer> t1=new TreeSet<Integer>();
	t1.add(2);
	t1.add(4);
	t1.add(7);
	t1.add(9);
	t1.add(1);
	t1.add(20);
	t1.add(15);
	Iterator<Integer> i1=t1.iterator();
	while (i1.hasNext())
	{
	
		int a=i1.next();
		if(a<7)
		{
			System.out.println(a);
		}
	}
	}

}
