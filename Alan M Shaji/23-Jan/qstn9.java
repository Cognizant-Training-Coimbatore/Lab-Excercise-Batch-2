import java.util.Scanner;

class Print
{
	void display(int a, char b)
	{
		System.out.println(a+"\t"+b);
	}
	void display(char b, int a)
	{
		System.out.println(a+"\t"+b);
	}
}
public class qstn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print obj=new Print();
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a integer\t:\t");
		int a=sc.nextInt();
		System.out.print("enter length and breadth of rectangle\t:\t");
		char l=sc.next().charAt(0);
		obj.display(l,a);
		obj.display(a,l);
		sc.close();
	}

}
