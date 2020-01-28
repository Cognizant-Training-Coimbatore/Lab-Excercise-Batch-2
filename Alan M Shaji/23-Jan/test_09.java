import java.util.Scanner;

public class test_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price=0;
		double addON;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter old unit-->");
		double ebold=sc.nextDouble();
		System.out.print("Enter new unit-->");
		double ebnew=sc.nextInt();
		if(ebnew<ebold)	
			{
			System.out.println("Wrong entries");
			sc.close();
			return;
			}
		double eb=ebnew-ebold;
		/*if(eb>0 && eb<101)	
			{
			System.out.println("Price --> Free");
			sc.close();
			return;
			}
		if(eb>101)	
			{
			if(eb<201)
				price=eb-100;
			else
				price=100;
			}
		
		if(eb>201)
			{	
			if(eb<301)
				{
				addON=2*(eb-200);
				price+=addON;
				}
			else
				price=300;
			}
		if(eb>301)	
			{
			if(eb<401)
			{
			addON=3*(eb-300);
			price+=addON;
			}
		else
			price=600;			
			}
		if(eb>401)
			{
			addON=4*(eb-400);
			price+=addON;
			addON=.1*price;
			price+=addON;
			}
			
			*/
		if(eb>401)
		{
			price=600;
			addON=4*(eb-400);
			price+=addON;
			addON=.1*price;
			price+=addON;
		}
		else if(eb <401&& eb>300)	
		{
		price=300;
		addON=3*(eb-300);
		price+=addON;
		}
		else if(eb <301&& eb>200)	
		{
		price=100;
		addON=2*(eb-300);
		price+=addON;
		}
		else if(eb <101&& eb>200)	
		{
		addON=1*(eb-200);
		price+=addON;
		}
		else
			System.out.println("Price --> Free");
		System.out.println("Price --> Rs."+price);
		sc.close();
	}

}
			