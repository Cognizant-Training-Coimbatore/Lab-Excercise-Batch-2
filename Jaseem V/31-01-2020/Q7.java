
public class Q7 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.print("Numbers divisible by 3  :"+i);
			}
			if(i%11==0)
			{
				System.out.print("Numbers divisible by 11  :"+i);
			}
			if((i%3==0)&&(i%11==0))
			{
				System.out.print("Numbers divisible by 3 and 11  :"+i);
			}
		}

	}

}
