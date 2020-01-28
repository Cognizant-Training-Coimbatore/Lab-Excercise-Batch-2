
public class program17_nested_if_ladder {

	public static void main(String[] args) {
		int marks=45;
		if(marks > 90 && marks < 101)
		{
			System.out.println("Grade A");
		}
		else if(marks>50 && marks <90)
		{
			System.out.println("Grade B");
		}
		else if(marks>30 && marks<50)
		{
			System.out.println("Grade C");
		}
		else if(marks >0 && marks <30)
		{
			System.out.println("FAILED :(");
		}
}

}
