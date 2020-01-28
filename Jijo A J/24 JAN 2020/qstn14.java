import java.util.Scanner;

public class qstn14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=4;
int aleft=3;
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++)
{
System.out.println("I'am thinking about a number between 0 and 9.Can you guess it ("+aleft+" attempts) left:");
int a=sc.nextInt();
if(a==x)
{
	System.out.println("CORRECT !!");
	}
else
	System.out.println("Sorry wrong number");
aleft--;
}
if(aleft==0)
{
	System.out.println("The correct number is "+x);}
	}

}
