import java.util.ArrayList;
import java.util.List;

public class Q5_update_array_element {

	public static void main(String[] args) {
		List<String> str=new ArrayList<String>();
		str.add("yellow");
		str.add("orange");
		str.add("red");
		str.add("blue");
		str.add("green");
		System.out.println(str);
		str.set(2,"violet");
		System.out.println(str);
	}

}
