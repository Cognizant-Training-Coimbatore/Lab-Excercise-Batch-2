import java.util.ArrayList;
import java.util.Iterator;

public class question2 {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		mylist.add("red");
		mylist.add("blue");
		mylist.add("green");
		Iterator it1=mylist.iterator();
		while(it1.hasNext()) 
		{
			Object obj=it1.next();
			System.out.println(obj);
		}

	}

}
