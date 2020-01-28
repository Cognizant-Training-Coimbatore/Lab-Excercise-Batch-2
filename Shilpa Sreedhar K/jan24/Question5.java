import java.util.Scanner;

class g1
{
	int rows,i,j;
	void display()
	{
		System.out.println("no of rows");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
			
		}
		
	}
}
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		g1 obj=new g1();
		obj.display();

	}

}
