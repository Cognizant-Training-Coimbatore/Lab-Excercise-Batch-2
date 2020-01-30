import java.util.ArrayList;
import java.util.List;

public class Program_90_arraylist {

	public static void main(String[] args) {
		List<String>al=new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add(1,"Sachin");
		System.out.println("An element at 2nd position: "+al.get(2));
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}
