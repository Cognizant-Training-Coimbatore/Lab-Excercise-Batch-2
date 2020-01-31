import java.util.ArrayList;
import java.util.List;

public class program91_shortcuts {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		System.out.println("Total items : "+mylist.size());
		System.out.println("If item3 exists : "+mylist.contains("Item3"));
		mylist.remove("Item3");
		System.out.println("After removing Item3 : "+mylist);
	}

}
