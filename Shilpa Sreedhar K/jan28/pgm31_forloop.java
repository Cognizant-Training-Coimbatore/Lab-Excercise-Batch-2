import java.util.ArrayList;

import java.util.List;

public class pgm31_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a1=new ArrayList<String>();
		a1.add("shilpa");
		a1.add("kv");
		a1.add("bisnu");
		a1.add("sreedhar");
		System.out.println("an element at 2nd position: " +a1.get(2));
		for(String s:a1)
		{
			System.out.println(s);	
		}

	}

}
