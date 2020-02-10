import java.util.Scanner;

public class a31_11 {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		int i;
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		
		
		
for(i=0;i<5;i++)
{
	c[i]=b[i]*a[i];
}
System.out.println(c[i]);
	}

}
