
public class program7_divisible_by {

	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
			if(i%3==0||i%11==0||((i%3==0)&&(i%11==0)))
				System.out.println(i);
		
	}

}
