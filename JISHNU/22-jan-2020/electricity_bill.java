package demo;
import java.util.Scanner;
public class electricity_bill 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter last month reading");
		int last=sc.nextInt();
		System.out.println("Enter current month reading");
		int current=sc.nextInt();
		int usage=current-last;
		double charge=0;
		if(usage<101)
		{
			charge=usage*0;
		}
		else if(usage<201)
		{
			charge=usage*1;
		}
		else if(usage<301)
		{
			charge=usage*2;
		}
		else if(usage<401)
		{
			charge=usage*3;
		}
		else
		{
			charge=usage*4;
			charge=charge*1.1;
		}
		System.out.println("Electricity bill= "+charge);
	}

}
