import java.util.ArrayList;

public class question7_arraylist_replace_element {

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
		
		days.remove(2);
		
		days.add(2,"Shilpa");
		
		System.out.println(days);
	}

}