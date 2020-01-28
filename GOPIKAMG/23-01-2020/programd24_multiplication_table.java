import java.util.Scanner;
public class programd24_multiplication_table {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number between 1 and 9");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<num;i++)
		{
			int m=num*i;
			System.out.println(+num+"*"+i+"=" +m);
		}

	}

}
