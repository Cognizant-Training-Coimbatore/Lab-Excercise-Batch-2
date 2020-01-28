import java.util.ArrayList;
import java.util.List;

public class Q1_arraylist {

	public static void main(String[] args) {
		List<String> a1=new ArrayList<String>();
		a1.add("Yellow");
		a1.add("Orange");
		a1.add("blue");
		a1.add("Red");
		a1.add("White");
		for(String s:a1)
		{
			System.out.println(s);
		}
	}

}
