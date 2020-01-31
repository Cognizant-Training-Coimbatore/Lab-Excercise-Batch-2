import java.util.ArrayList;
import java.util.List;

public class program89_arraylist {

	public static void main(String[] args) {
		List<String> a1=new ArrayList<String>();
		a1.add("Amit");
		a1.add("Vijay");
		a1.add("Binoy");
		a1.add(2,"adhil");
		System.out.println("2nd Element : "+a1.get(2));
		for(String s:a1)
		{
			System.out.println(s);
		}
	}

}
