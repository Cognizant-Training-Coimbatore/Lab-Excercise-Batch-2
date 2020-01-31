
public class prog19_nestedelseif_ladder {

	public static void main(String[] args)
	{
		int marks=35;
		if(marks>90 && marks<101)
		{
			System.out.println("grade A");
		}
		else if(marks>80 && marks<91)
		{
			System.out.println("grade B");
		}
		else if(marks>70 && marks<81)
		{
			System.out.println("grade C");
		}
		else if(marks>60 && marks<71)
		{
			System.out.println("grade D");
		}
		else if(marks>50 && marks<61)
		{
			System.out.println("grade E");
		}
		else
		{
			System.out.println("failed");
		}
		
		// TODO Auto-generated method stub

	}

}
