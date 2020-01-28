import java.util.ArrayList;
import java.util.List;

public class j28_q3_element_firstposition {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Red");
		l1.add("Yellow");
		l1.add("Brown");
		l1.add(0,"Violet");
		System.out.println(l1);
		for(String s:l1) {
			System.out.println(s);
		}

	}

}
