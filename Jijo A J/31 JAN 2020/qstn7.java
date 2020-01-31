
public class qstn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("divisible by 3");
for(int i=1;i<100;i++)
	if(i%3==0)
	{
		System.out.print(i+" ");
	}
System.out.println("\ndivisible by 11");
for(int i=1;i<100;i++)
	if(i%11==0)
	{
		System.out.print(i+" ");
	}

	System.out.println("\ndivisible by 3 and 11");
	for(int i=1;i<100;i++)
		if(i%3==0 && i%11==0 )
		{
			System.out.print(i+" ");
		}
	}
}
