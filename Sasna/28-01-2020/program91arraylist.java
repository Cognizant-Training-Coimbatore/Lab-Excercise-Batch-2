import java.util.ArrayList;
import java.util.List;

public class program91arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("vijay");
		al.add("kumar");
		al.add(1,"sachin");
		System.out.println("an element at 2nd position:" +al.get(2));
		for(String s:al) {
			System.out.println(s);
		}

	}

}
