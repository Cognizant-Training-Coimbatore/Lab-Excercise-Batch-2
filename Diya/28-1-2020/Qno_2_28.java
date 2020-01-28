import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Qno_2_28 {

	public static void main(String[] args) {
		List<String>mylist=new ArrayList<String>();
		mylist.add("Red");
		mylist.add("Blue");
		mylist.add("Green");
		mylist.add("Yellow");
		mylist.add("White");
		System.out.println(mylist);
		Iterator it1=mylist.iterator();
		System.out.println("Using Iterator object...");
		while(it1.hasNext()) 
		{
			Object obj=it1.next();
			System.out.println(obj);
			
		}

	}

}
