import java.util.Scanner;

public class exercise25_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int [5];
		int i, bigger;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers : ");
		bigger = sc.nextInt();
		num[0] = bigger;
		for(i=1;i<5;i++)
		{
			num[i] = sc.nextInt();
			if(num[i]>bigger)
			{
				bigger = num[i];
			}
		}
		System.out.println("the biggest number is : " + bigger);
		
	}

}
