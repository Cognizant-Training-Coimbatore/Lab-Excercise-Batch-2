
public class Q7_divisible_by_3_and_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number divisible by both 3 and 11");
		for(int i=1;i<=100;i++)
		{
			if((i%3==0)&&(i%11==0))
			{
				System.out.println(i);
			}
		}
		System.out.println("Number divisible by  3");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Number divisible by 11");
		for(int i=1;i<=100;i++)
		{
			if(i%11==0)
			{
				System.out.println(i);
			}
		}
	}

}
