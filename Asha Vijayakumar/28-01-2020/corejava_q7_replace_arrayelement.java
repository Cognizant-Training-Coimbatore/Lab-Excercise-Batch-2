import java.util.ArrayList;
import java.util.List;

public class corejava_q7_replace_arrayelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list_Strings=new ArrayList<String>();
		list_Strings.add("apple");
		list_Strings.add("orange");
		list_Strings.add("banana");
		list_Strings.add("lemon");
		System.out.println(list_Strings);
		System.out.println("replace the element:");
		list_Strings.set(1,"pineapple");
		
		System.out.println(list_Strings);
		
	}

}
