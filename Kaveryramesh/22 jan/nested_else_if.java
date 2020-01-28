package demo;

public class nested_else_if {

	public static void main(String[] args) {
		int marks=95;
		if(marks>91 && marks<101)
		{
			System.out.println("GRADE A");
			
		}
		else if(marks>80 && marks<91)
		{
			System.out.println("GRADE b");
			
		}
		else if(marks>70 && marks<81)
		{
			System.out.println("GRADE c");
			
		}
		else if(marks>60 && marks<71)
		{
			System.out.println("GRADE D");
			
		}
		
		else if(marks>50 && marks<61)
		{
			System.out.println("GRADE E");
			
		}
		else
			System.out.println("Fail");
		
		
		

	}

}
