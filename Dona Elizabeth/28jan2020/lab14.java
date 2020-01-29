import java.util.Iterator;
import java.util.TreeSet;

public class lab14 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(2);
		ts.add(4);
		ts.add(10);
		ts.add(3);
		ts.add(8);
		System.out.println("Elements less than 7 in the tree set are "); 
		for(int x:ts)
		{
			if(x<7)
			{
				System.out.println(x);
			}
		}
		
	}

}
