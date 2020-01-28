import java.util.Iterator;
import java.util.LinkedList;

public class prog116_iterate_linkedlist {
	public static void main(String[] args) {
		LinkedList<String> l_list=new LinkedList<String>();
		l_list.add("red");
		l_list.add("green");
		l_list.add("black");
		l_list.add("blue");
		l_list.add("yellow");
		Iterator p=l_list.listIterator(1);
		while(p.hasNext())
		{
			System.out.println(p.next());
		}
		
	}
}