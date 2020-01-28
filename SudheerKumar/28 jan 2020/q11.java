import java.util.ArrayList;
import java.util.Collections;

public class q11 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("red");
		list1.add("green");
		list1.add("blue");
		list1.add("yellow");
		list1.add("orange");
		System.out.println(list1);
		Collections.swap(list1, 2, 4);
		System.out.println(list1);
		
		// TODO Auto-generated method stub

	}

}
