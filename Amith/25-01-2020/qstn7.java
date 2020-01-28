import java.util.Scanner;

public class qstn7 {

	public static void main(String[] args) 
	{
	int ar1[]=new int[10];
	int ar2[]= new int[10];
	System.out.println("enter numbers");
	Scanner sc= new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		ar1[i]=sc.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		ar2[i]=ar1[i];
	}
	for(int i=0;i<10;i++)
	{
	System.out.println(ar2[i]);
	}
	}

}
