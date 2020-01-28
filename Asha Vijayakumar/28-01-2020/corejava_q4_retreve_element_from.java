import java.util.ArrayList;
import java.util.List;

public class corejava_q4_retreve_element_from {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list_Strings=new ArrayList<String>();
		list_Strings.add("apple");
		list_Strings.add("orange");
		list_Strings.add("banana");
		list_Strings.add("lemon");
		System.out.println(list_Strings);
		System.out.println("Retreve the element:");
		String element=list_Strings.get(0);
		System.out.println(element);
		

	}

}
