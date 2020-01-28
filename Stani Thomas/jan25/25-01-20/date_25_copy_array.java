import java.util.Scanner;

public class date_25_copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,avg,i;
		int n[]=new int[5];
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 no.s");
		for( i=0;i<5;i++)
		{
			n[i]=sc.nextInt();
			a[i]=n[i];
		}
		System.out.println("the copied array is");
		for(i=0;i<5;i++)
		{
		System.out.println(a[i]);
		}
	}

}
