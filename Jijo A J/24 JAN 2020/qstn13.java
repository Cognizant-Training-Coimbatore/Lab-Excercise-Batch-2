import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections; 
public class qstn13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the 10 Integers");
Scanner sc=new Scanner(System.in);
int a[] = new int[10];
int sum=0 ,avg,min,max;
for(int i = 0; i < 10; i++)
{
    a[i] = sc.nextInt();
}
min=max=a[0];
for(int i = 0; i < 10; i++)
{
    if(a[i]<min)
    {
    	min=a[i];
    }
}
for(int i = 0; i < 10; i++)
{
    if(a[i]>max)
    {
    	max=a[i];
    }
}
for(int i = 0; i < 10; i++)
{
    sum+=a[i];
}
avg=sum/10;
System.out.println("min ="+min+"\n max ="+max+"\n avg ="+avg);
	}

}
