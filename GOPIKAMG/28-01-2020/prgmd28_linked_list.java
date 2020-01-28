import java.util.Iterator;
import java.util.LinkedList;

public class prgmd28_linked_list {

	public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	list.add("apple");
	list.add("orange");
	list.add("grapes");
	list.add("mango");
	Iterator i=list.listIterator(0);
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	}

}
