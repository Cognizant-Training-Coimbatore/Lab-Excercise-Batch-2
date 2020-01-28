
public class program18_nested_else_if_ladder {

	public static void main(String[] args) 
	{
		int marks=95;
		if(marks>90 && marks<100)
		{
			System.out.println("Grade A");
		}
		else if(marks>80 && marks<89)
		{
			System.out.println("Grade B");
			
		}
		else if(marks>70 && marks<79) 
		{
			 System.out.println("Grade C");
		}
		else if(marks>60 && marks<69) 
		{
			 System.out.println("Grade D");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}
