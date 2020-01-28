import java.util.Scanner;

class sample2
{
	int i;
	
	void display(int l,int r)
	{
		for(i=l;i<=r;i++)
			System.out.println(i);
	}
}



public class exercise24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("enter upper limit and lower limit");
     
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		sample2 obj=new sample2();
		obj.display(a,b);
		
	}

}
