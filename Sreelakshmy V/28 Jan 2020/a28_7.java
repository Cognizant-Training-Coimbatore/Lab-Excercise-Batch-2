import java.util.ArrayList;
import java.util.List;

public class a28_7 {

	public static void main(String[] args) {
		List<String> arrlist=new ArrayList<String>();
		arrlist.add("Sunday");
		arrlist.add("Monday");
		arrlist.add("Tuesday");
		arrlist.add("Wednesday");
		arrlist.add("Thursday");
		arrlist.add("Friday");
		arrlist.add("Saturday");
		arrlist.remove(5);
		arrlist.add(1,"Sree");
		System.out.println(arrlist);


	}

}
