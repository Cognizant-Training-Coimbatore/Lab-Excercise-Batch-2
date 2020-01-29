import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class lab9 {

	public static void main(String[] args) {
		List<String> li=new LinkedList<String>();
		li.add("ponnu");
		li.add("paru");
		li.add("chinnu");
		li.add("gopu");
		Iterator it=li.listIterator(1);
		while(it.hasNext())
		{
			Object obj=it.next();
			System.out.println(obj);
		}
	}

}
