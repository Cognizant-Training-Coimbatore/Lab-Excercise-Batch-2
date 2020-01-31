package jan31;

public class ques7 {

	public static void main(String[] args) 
	{	
		System.out.println("Numbers divisible by 3 and 11 and by both are  :");
		for(int i=1;i<=100;i++)
		{
			if(i%3 == 0 && i%11 == 0)
			{
				System.out.println(i);
			}
		}

	}

}
