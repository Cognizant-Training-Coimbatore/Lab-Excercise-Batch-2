import java.util.Set;
import java.util.TreeSet;

public class question13_add_treeset {

	public static void main(String[] args) 
	{
		Set<Integer> b1=new TreeSet<Integer>();
		b1.add(100);
		b1.add(200);
		b1.add(300);
		
		Set<Integer> b2=new TreeSet<Integer>();
		b2.add(400);
		b2.add(500);
		b2.add(600);
		
		b1.addAll(b2);
		System.out.println("The elements after appending the sets are "+b1);
		
	}

}
