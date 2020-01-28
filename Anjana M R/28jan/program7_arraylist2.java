import java.util.ArrayList;
import java.util.List;

public class program7_arraylist2 {

	public static void main(String[] args) {
		List<String> a1=new ArrayList<String>();
		a1.add("Anjana");
		a1.add("Anu");
		a1.add("Ammu");
		System.out.println("An element in the 2nd position:"+a1.get(1));
		for(String s:a1)
		{
			System.out.println(s);
		}

	}

}
