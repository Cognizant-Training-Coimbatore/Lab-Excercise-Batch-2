import java.util.ArrayList;
import java.util.Iterator;

public class pgm28_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<String>();
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		li.add("Blue");
		Iterator iter=li.iterator();
		while(iter.hasNext())
		{
			Object obj=iter.next();
			System.out.println(obj);
		}
	}

}
