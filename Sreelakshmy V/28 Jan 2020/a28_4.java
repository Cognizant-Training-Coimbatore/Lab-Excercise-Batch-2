import java.util.ArrayList;
import java.util.List;

public class a28_4 {

	public static void main(String[] args) {
		System.out.println("Retrieving");
		List<String> arrlist=new ArrayList<String>();
		arrlist.add("Sunday");
		arrlist.add("Monday");
		arrlist.add("Tuesday");
		arrlist.add("Wednesday");
		arrlist.add("Thursday");
		arrlist.add("Friday");
		arrlist.add("Saturday");
			System.out.println(arrlist.get(5));
	}

}
