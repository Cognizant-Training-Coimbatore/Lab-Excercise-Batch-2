import java.util.ArrayList;
import java.util.List;

public class Arraylist_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>mylist=new ArrayList<String>();
mylist.add("item1");
mylist.add("item2");
mylist.add("item3");
mylist.add("item 4");
mylist.add("item 5");
System.out.println("Total items" +mylist.size());
System.out.println("Testing item4 exists" +mylist.contains("item 4"));
System.out.println("Printing all items" +mylist);
System.out.println("Removing item 3.....");
mylist.remove("item3");
System.out.println("Printing all items after removing" +mylist);
System.out.println("Total items after removing"+mylist.size());
	}

}
