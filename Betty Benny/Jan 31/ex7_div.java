
public class ex7_div 
{

	public static void main(String[] args) 
	{
		System.out.println("no.s divisible by 3 ");
		for(int i=1;i<101;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("no.s divisible by 11 ");
		for(int i=1;i<101;i++)
		{
			if(i%11==0)
			{
				System.out.println(+i);
			}
		}
		System.out.println("no.s divisible by 3 and 11 ");
for(int i=1;i<101;i++)
{
	if(i%3==0 && i%11==0)
	{
		System.out.println(i);
	}
}
	}

}

	