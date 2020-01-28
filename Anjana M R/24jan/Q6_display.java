import java.util.Scanner;
class displaynum
{
	void display()
	{
		int s=0,i=0;
		float av=0;
		Scanner sc=new Scanner(System.in)	;
		System.out.println("input number");
		
		for( ;;)
		{
	
		
			int a=sc.nextInt();
			
			if(a==-999)
			{
				System.out.println("invalid");
				break;
			}
			else
			{
				i++;
				s=s+i;
			}
			System.out.println("Input");
		}
		av=s/i;
		System.out.println("sum"+s);
		System.out.println("average"+av);
	}
}
public class Q6_display {

	public static void main(String[] args) 
	{
displaynum obj=new displaynum();
obj.display();
	}

}
