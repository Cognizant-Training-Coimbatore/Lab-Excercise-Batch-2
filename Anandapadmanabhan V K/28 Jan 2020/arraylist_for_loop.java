import java.util.ArrayList;
import java.util.List;

public class arraylist_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> a1=new ArrayList<String>();
			a1.add("Ajit");
			a1.add("Vijay");
			a1.add("Surya");
			a1.add("Vikram"); 
			System.out.println("Element at 2nd position " + a1.get(1));
			
			for(String s: a1)
			{
				System.out.println(s);
			}
	}

}
