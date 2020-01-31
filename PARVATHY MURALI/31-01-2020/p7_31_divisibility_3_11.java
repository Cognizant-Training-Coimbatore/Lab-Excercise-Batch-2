package packone;

public class p7_31_divisibility_3_11 
{

	public static void main(String[] args) 
	{
			System.out.print("Numbers divisible by 3:");
			for(int i=0;i<=100;i++)
			{
				if(i%3==0)
				{
					System.out.print(i+" ");
				}
			}System.out.print("\n");
			System.out.print("Numbers divisible by 11:");
			for(int i=0;i<=100;i++)
			{
				if(i%11==0)
					{
					System.out.print(i+" ");
					}
			}System.out.print("\n");
			System.out.print("Numbers divisible by 3 and 11:");
			for(int i=0;i<=100;i++)
			{
				
				if(i%3==0 && i%11==0)
				{
					System.out.print(i+" ");
				}
		}


	}

}
