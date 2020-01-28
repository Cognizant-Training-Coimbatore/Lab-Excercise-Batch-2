import java.util.ArrayList;
import java.util.List;

public class j28_q4_retrieveFromSpecifiedIndex {

	public static void main(String[] args) {
		List<String> liststr = new ArrayList<String>();
		liststr.add("Red");
		liststr.add("Brown");
		liststr.add("Violet");
		liststr.add("Yellow");
		System.out.println(liststr);
		String ele = liststr.get(0);
		System.out.println("The first element is : "+ele);
		ele = liststr.get(3);
		System.out.println("The fourth element is : "+ ele);

	}

}
