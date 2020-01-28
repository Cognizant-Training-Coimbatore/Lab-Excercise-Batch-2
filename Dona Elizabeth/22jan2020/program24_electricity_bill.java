import java.util.Scanner;

public class program24_electricity_bill {

	public static void main(String[] args) {
		int old_r;
		int new_r;
		double rs=0.00;
		System.out.println("Enter the old reading");
		Scanner sc=new Scanner(System.in);
		old_r=sc.nextInt();
		System.out.println("Enter the new reading");
		new_r=sc.nextInt();
		int cur_r=new_r-old_r;
		if(cur_r<=100&&cur_r>1)
		{
			System.out.println("Free");
		}
		else if(cur_r<=200&&cur_r>101)
		{
			rs=cur_r*1;
			System.out.println("Electricity bill is : "+rs);
		}
		else if(cur_r<=300&&cur_r>201)
		{
			rs=cur_r*2;
			System.out.println("Electricity bill is : "+rs);
		}
		else if(cur_r<=400&&cur_r>301)
		{
			rs=cur_r*3;
			System.out.println("Electricity bill is : "+rs);
		}
		else
		{
			rs=cur_r*4;
			double a=rs*10/100;
			rs=rs+a;
			System.out.println("Electricity bill is : "+rs);
		}
		
	}

}
