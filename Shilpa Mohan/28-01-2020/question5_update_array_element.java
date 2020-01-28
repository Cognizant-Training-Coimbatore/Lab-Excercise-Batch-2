import java.util.ArrayList;

public class question5_update_array_element {

	public static void main(String[] args) 
	{
		ArrayList<String> days = new ArrayList<String>();
		
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		
		days.remove(5);
		
		days.add(5,"Shilpa");
		
		System.out.println(days);
	}

}
