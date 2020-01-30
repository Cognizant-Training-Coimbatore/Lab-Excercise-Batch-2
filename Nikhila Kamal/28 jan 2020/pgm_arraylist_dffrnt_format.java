import java.util.ArrayList;
import java.util.List;

public class pgm_arraylist_dffrnt_format {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("nikhila");
		al.add("kamal");
		al.add("ammu");
		al.add(1,"malu");
		System.out.println("an element at 3rd position : " + al.get(3));
	
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}

