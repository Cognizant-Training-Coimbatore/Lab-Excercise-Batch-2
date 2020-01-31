import java.util.Scanner;

public class pgm_19 {

	public static void main(String[] args) 
	{
		int s;
		int flag=0;
	int n[]=new int[10];
	n[0]=1;
	n[1]=2;
	n[2]=3;
	n[3]=4;
	n[4]=5;
	n[5]=6;
	n[6]=7;
	n[7]=8;
	n[8]=9;
	n[9]=10;
	
	System.out.println("enter a number to search");
	Scanner sc=new Scanner(System.in);
	s=sc.nextInt();
	for(int i=0;i<10;i++)
	{
		
	if(n[i]==s)
		
	{
		 flag=1;
		System.out.println("entered number is present");
		break;
		
	}
	
	}
	
	if(flag==0)
	{
		System.out.println("not present");
	}
		
	}

}

