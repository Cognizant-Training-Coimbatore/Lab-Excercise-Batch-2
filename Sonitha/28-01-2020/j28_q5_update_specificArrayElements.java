import java.util.ArrayList;
import java.util.List;

public class j28_q5_update_specificArrayElements {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Yellow");
		list.add("Brown");
		list.add("Violet");
     for(String s :list) {
    	 System.out.println(s);
    	 
     }
     System.out.println("");
     list.set(0, "White");
     for(String s : list) {
    	 System.out.println(s);
     }
	}

}
