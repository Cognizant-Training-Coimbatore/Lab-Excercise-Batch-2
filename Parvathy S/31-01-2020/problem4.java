import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n = sc.nextInt();
		int i;
		for(i=1;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}

	}

}
