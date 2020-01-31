import java.util.Scanner;

public class qstn16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number :");
Scanner xx=new Scanner(System.in);
int x=xx.nextInt();
for(int i=1;i<=x;i++)
{
	for(int j=x-i;j>=1;j--) {
		System.out.print(" ");
	}
	for(int j=i;j>=1;j--) {
		System.out.print(j);
	}
	for(int j=2;j<=i;j++) {
		System.out.print(j);
	}
	System.out.println();
	}
for(int q=x-1;q>=1;q--)
{
	for(int j=x-q;j>=1;j--) {
		System.out.print(" ");
	}
	for(int j=q;j>=1;j--) {
		System.out.print(j);
	}
	for(int j=2;j<=q;j++) {
		System.out.print(j);
	}
	System.out.println();
	
	}

	}

}
