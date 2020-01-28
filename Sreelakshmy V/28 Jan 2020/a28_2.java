import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a28_2 {

	public static void main(String[] args) {
		
		System.out.println("\nUsing Iterator");
		List<String> arrlist=new ArrayList<String>();
		arrlist.add("Sunday");
		arrlist.add("Monday");
		arrlist.add("Tuesday");
		arrlist.add("Wednesday");
		arrlist.add("Thursday");
		arrlist.add("Friday");
		arrlist.add("Saturday");
		for(String s:arrlist)
		{
			System.out.println(s);
		}
	      

}
}
