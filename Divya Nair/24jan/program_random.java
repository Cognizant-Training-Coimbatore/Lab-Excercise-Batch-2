import java.util.Random;

public class program_random {

	public static void main(String[] args) 
	{
		int i;
		Random a=new Random();
		for(i=0;i<10;i++)
		{
			System.out.println(a.nextInt(100));
		}

	}

}
