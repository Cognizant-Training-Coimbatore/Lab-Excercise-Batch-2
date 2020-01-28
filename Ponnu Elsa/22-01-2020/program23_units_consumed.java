import java.util.Scanner;

public class program23_units_consumed {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int units,rs;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the reading:");
	        units = s.nextInt();
		
		if(units > 0 && units < 101)
		{
			System.out.println("Free");
		}
		else if(units> 100 && units <201)
		{
			rs=units*1;
			System.out.println("The electricity bill is "+rs);
		}
		else if( units>200&&units<301)
		{
			rs=units*2;
			System.out.println("The electricity bill is "+rs);
		}
		else if(units>300&&units<401)
		{
			rs=units*3;
			System.out.println("The electricity bill is "+rs);
		}
		else if(units>400)
		{
			rs=units*4;
			int a=rs*10/100;
			rs=rs+a;
			System.out.println("The electricity bill is "+rs);
			
		}
	}

}
