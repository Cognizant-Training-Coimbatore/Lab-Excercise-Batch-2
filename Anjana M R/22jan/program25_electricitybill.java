import java.util.Scanner;

public class program25_electricitybill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float old,neww;
		System.out.println("enter the old reading");
		old=sc.nextFloat();
		System.out.println("Enter the new reading");
		neww=sc.nextFloat();
		float unit=neww-old;
		float price;
		if(unit<0)
		{
			System.out.println("invalid");
		}
		if(unit>=1 && unit<100)
		{
		System.out.println("Free");
			
		}
		else if(unit>100 && unit<201)
		{
			System.out.println("The price="+unit*1);
		}
		else if(unit>200 && unit<301)
		{
			System.out.println("The price="+unit*2);
		}
		else if(unit>300 && unit<401)
		{
			System.out.println("The Price="+unit*3);
		}
		else if(unit>400)
		{
			float amount=(unit*4);
			System.out.println("The price="+(amount+amount*10/100));
		}
	
		
	}

}
