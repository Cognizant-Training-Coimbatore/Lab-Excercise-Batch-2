import java.util.Scanner;

public class qstn5 {

	public static void main(String[] args) 
	{
	String ar[]= new String[5];
	
	System.out.println("enter your frnds name");
	Scanner sc= new Scanner(System.in);
	int i;
	for (i=0;i<5;i++)
	{
		ar[i]=sc.nextLine();
	}
	for(i=0;i<5;i++)
	{
		System.out.println(ar[i].toUpperCase());
	}
	}

}
