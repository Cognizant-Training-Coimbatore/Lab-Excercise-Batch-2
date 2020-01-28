import java.util.ArrayList;
import java.util.List;

public class date28_mylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>mylist=new ArrayList<String>();
mylist.add("item1");
mylist.add("item2");
mylist.add("item3");
mylist.add("item4");
System.out.println("total items "+mylist.size());
System.out.println(mylist.contains("item1"));
System.out.println(mylist);
System.out.println(mylist.remove("item3"));
System.out.println(mylist);
System.out.println("total items "+mylist.size());
	}

}
