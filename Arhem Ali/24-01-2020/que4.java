import java.util.Scanner;

public class que4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=4,j=1;
		for(int i=3;i>0;i--)
		{
			System.out.println("Im thinking of number btw 0 and 9, can you guess it?");
			int b=sc.nextInt();
			if(b==num)
			{
				System.out.println("CORRECT");
				 j=0;
				System.exit(0);
			}
			else
			{
				int k=i-1;
				System.out.println("Wrong,"+k+"attempts left");
			}
		}
		
		if(j!=0)
		{
			System.out.println("correct answer is "+num);
		}
		
			

		}

}
