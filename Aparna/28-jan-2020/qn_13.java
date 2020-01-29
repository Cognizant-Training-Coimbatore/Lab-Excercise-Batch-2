package set_6;

import java.util.TreeSet;

public class qn_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> list =new TreeSet<String>();
list.add("anu");
list.add("ammu");
list.add("ria");
list.add("anu");
System.out.println(list);
TreeSet<String> list1 =new TreeSet<String>();
list1.add("reenu");
list1.add("shanu");
list.addAll(list1);
System.out.println("new set " +list);
	}

}
