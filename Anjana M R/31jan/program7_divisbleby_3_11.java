
public class program7_divisbleby_3_11 {

	public static void main(String[] args) {
		int n=1,m=100,i;
		System.out.println("Divisible by 3");
		for(i=n;i<=m;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Divisible by 11");
		for(i=n;i<=m;i++)
		{
			if(i%11==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Divisible by both");
		for(i=n;i<m;i++)
		{
			if(i%3==0 && i%11==0)
			{
				System.out.println(i);
			}
		}

	}

}
