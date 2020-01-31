package jan31;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numbers divisible by 3: ");
		for(int i=1;i<100;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Numbers divisible by 11: ");
		for(int i=1;i<100;i++)
		{
			if(i%11==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Numbers divisible by 3 & 11: ");
		for(int i=1;i<100;i++)
		{
			if(i%3==0 && i%11==0)
			{
				System.out.println(i);
			}
		}


	}

}
