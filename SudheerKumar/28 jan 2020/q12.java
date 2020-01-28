import java.util.ArrayList;
import java.util.HashSet;
public class q12 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("red");
		list1.add("green");
		list1.add("blue");
		list1.add("yellow");
		list1.add("orange");
		System.out.println(list1);
		HashSet<String> list2=new HashSet();
		list2.add("red");
		list2.add("green");
		list2.add("blue");
		list2.add("yellow");
		list2.add("orange");
		System.out.println(list2);
		list1.retainAll(list2);
		System.out.println("common elements are:"+list1);
		// TODO Auto-generated method stub

	}

}
