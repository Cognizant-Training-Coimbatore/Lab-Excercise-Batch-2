import java.util.Scanner;
class mult
{
	void display(int n)
	{ 
		for(int j=1;j<=n;j++)
		{
			
		for (int i=1;i<=10;i++)
		{
			System.out.println(+j+"*"+i+"="+(j*i));
		}
		
		}
	}
}
public class mul_table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		mult obj=new mult();
		obj.display(a);
		
	}

}
