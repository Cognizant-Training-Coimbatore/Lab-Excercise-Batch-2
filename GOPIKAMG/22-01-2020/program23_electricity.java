import java.util.Scanner;
public class program23_electricity {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the old meter reading");
	int or=sc.nextInt();
	System.out.println("Enter the new meter reading");
	int nr=sc.nextInt();
	int tr=nr-or;
	if((tr<=100) &&(tr>=1))
	{
		System.out.println("Dont want to pay anything");
	}
	else if((tr<=200) &&(tr>=101))
	{
		System.out.println("amount to be paid: "+tr*1);
		
	}
	
	else if((tr<=200) &&(tr>=101))
	{
		System.out.println("amount to be paid: "+tr*2);
		
	}
	else if((tr<=300) &&(tr>=201))
	{
		System.out.println("amount to be paid: "+tr*3);
		
	}
	else if((tr<=400) &&(tr>=301))
	{
		System.out.println("amount to be paid: "+tr*4);
		
	}
	else 
	{
		int amount=tr*4;
		System.out.println("amount to be paid:"+amount+((amount)*0.1));
	} 

	}

}
