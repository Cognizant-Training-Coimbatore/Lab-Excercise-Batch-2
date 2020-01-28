import java.util.Scanner;

public class qstn_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a no. bw 1-9\t:\t");
		int a = sc.nextInt();
		if (a<1||a>9)
		{
			System.out.println("wrong enrty");
			sc.close();
			return;
		}
		else
		{
			for(int i=1;i<=a;i++)
			{
				System.out.println("Multiplication table of "+i);
				for(int j=1;j<=10;j++)
					System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		sc.close();
	}

}
