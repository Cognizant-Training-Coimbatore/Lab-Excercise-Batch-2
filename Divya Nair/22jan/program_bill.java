import java.util.Scanner;

public class program_bill {

	public static void main(String[] args)
	{
	int unit,a,b;
	Scanner scan=new Scanner(System.in);
	System.out.println("Old reading");
	a=scan.nextInt();
	System.out.println("New reading");
	b=scan.nextInt();
	unit=b-a;
	System.out.println("The unit consumed is:"+unit);
	if(unit>0&&unit<101)
	{
		System.out.println("Free");
	}
	else if(unit>100&&unit<201)
	{
		System.out.println("Price: Rs"+unit*1);
	}
	else if(unit>200&&unit<301)
	{
		System.out.println("Price: Rs"+unit*2);
	}
	else if	(unit>300&&unit<401)
	{
		System.out.println("Price: Rs"+unit*3);
	
	}
	else
		System.out.println("Price: Rs" +unit*(4+(4*0.10)));
	}
	

}
