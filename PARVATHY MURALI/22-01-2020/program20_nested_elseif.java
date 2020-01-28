
public class program20_nested_elseif
{

	public static void main(String[] args) 
	{
		int mark=100;
		if(mark>=90 && mark<101)
		{
			System.out.println("Grade A+");
		}
		else if(mark>=71 && mark<90)
		{
			System.out.println("Grade A");
		}
		else if(mark>=61 && mark<70)
		{
			System.out.println("Grade B");
		}
		else if(mark>=45 && mark<60)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
