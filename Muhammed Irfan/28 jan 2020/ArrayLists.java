package Tuesday;
import java.util.List;
import java.util.ArrayList;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> mylist=new ArrayList<String>();
mylist.add("item1");
mylist.add("item2");
mylist.add("item3");
mylist.add("item4");
System.out.println("total items "+mylist.size());
System.out.println("testing item 4"+mylist.contains("item4"));
System.out.println("print all items"+mylist);
System.out.println("removing item 3");
mylist.remove("item3");
System.out.println("total items "+mylist.size());		
System.out.println("print all items ofter deleting"+mylist);

	}

}
