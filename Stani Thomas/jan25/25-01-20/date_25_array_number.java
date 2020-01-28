import java.util.Scanner;

public class date_25_array_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,avg;
int n[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter 5 no.s");
for(int i=0;i<5;i++)
{
	n[i]=sc.nextInt();
	s=s+n[i];
	}
avg=s/5;
System.out.println("sum = "+s);
System.out.println("average = "+avg);
	}

}
