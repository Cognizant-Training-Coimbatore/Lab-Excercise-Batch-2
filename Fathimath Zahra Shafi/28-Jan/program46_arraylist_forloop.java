import java.util.ArrayList;
import java.util.List;

public class program46_arraylist_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> a1=new ArrayList<String>();
		a1.add("fathima");
		a1.add("kavery");
		a1.add("betty");
		a1.add("maria");
		System.out.println("an element at 2nd position: " +a1.get(2));
		
		for(String s:a1)
		{
			System.out.println(s);
		}

	}

}
