import java.util.ArrayList;
import java.util.List;

public class j28_q7_replaceTheSecondElement {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("red");
		list.add("yellow");
		list.add("Brown");
		list.add("Blue");
		System.out.println(list);
		list.set(1, "White");
		System.out.println(list);
	}

}