
import java.util.LinkedList;
import java.util.List;

public class Qno_10_28 {

	public static void main(String[] args) {
		
		List<String>mylist=new LinkedList<String>();
		mylist.add("Red");
		mylist.add("Blue");
		mylist.add("Green");
		mylist.add("Blue");
		mylist.add("White");
		System.out.println(mylist);
		int first_index = mylist.indexOf("Blue");
		int last_index = mylist.lastIndexOf("Blue");
		System.out.println(first_index);
		System.out.println(last_index);
	}

}
