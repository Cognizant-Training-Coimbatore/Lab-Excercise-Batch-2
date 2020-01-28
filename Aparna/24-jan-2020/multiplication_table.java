import java.util.Scanner;

class mul
{
	int n,i,j;
	void w()
	{
		System.out.println("enter the value");
		Scanner sc =new Scanner (System.in);
		n= sc.nextInt();
		for(i=1;i<=10;i++)
		{
			j=i*n;
			System.out.println(j);
		}
	}
}
public class multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mul obj=new mul();
obj.w();
	}

}
