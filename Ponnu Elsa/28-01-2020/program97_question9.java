import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class program97_question9  {

	public static void main(String[] args) {
		List<String> li=new LinkedList<String>();
		li.add("Parvathy");
		li.add("Dona");
		li.add("Ponnu");
		li.add("pdp");
		Iterator it=li.listIterator(2);
		while(it.hasNext())
		{
			Object obj=it.next();
			System.out.println(obj);
		}
	}

}

