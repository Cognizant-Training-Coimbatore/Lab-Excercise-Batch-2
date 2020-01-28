
public class program19_nested_else_if_ladder {

	public static void main(String[] args)
	{
	int mark=40;
	if(mark>90 && mark<101)
	{
		System.out.println("grade A");
	}
	else if(mark>80 && mark<91)
	{
		
		System.out.println("grade B");
	}
	else if(mark>70 && mark<81)
	{
		System.out.println("grade C");
	}
	else if(mark>60 && mark<71)
	{
		System.out.println("grade d");
	}
	else
	{
		System.out.println("failed");
	}

	}

}
