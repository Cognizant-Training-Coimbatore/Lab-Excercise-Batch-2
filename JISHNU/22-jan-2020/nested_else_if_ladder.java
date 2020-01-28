package demo;

public class nested_else_if_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=75;
		if(marks>90&&marks<101)
		{
			System.out.println("A grade");
		}
		else if(marks>80&&marks<91)
		{
			System.out.println("B grade");
		}
		else if(marks>70&&marks<81)
		{
			System.out.println("C grade");
		}
		else if(marks>60&&marks<71)
		{
			System.out.println("D grade");
		}
		else if(marks>50&&marks<61)
		{
			System.out.println("E grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
