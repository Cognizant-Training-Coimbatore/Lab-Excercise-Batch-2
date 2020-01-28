
import java.util.ArrayList;
import java.util.Iterator;

public class program97_question2  {

	public static void main(String[] args) {
		ArrayList<String> things=new ArrayList<String>();
		things.add("Teddy");
		things.add("Gems");
		things.add("London");
		Iterator it=things.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			System.out.println(obj);
		}
	}

}
