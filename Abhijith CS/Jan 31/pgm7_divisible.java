package exercise_jan31;

public class pgm7_divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3;
		while(i<=100)
		{
			if(i%3==0)
			{
				System.out.println(i+"Divisible by 3");
			}
			else if (i%11==0)
			{
				System.out.println(i+"Divisible by 11");
			}
			if((i%3==0) && (i%11==0))
			{
				System.out.println(i+"Divisible by both 3 & 11");
			}
			i++;
		}
	}

}
