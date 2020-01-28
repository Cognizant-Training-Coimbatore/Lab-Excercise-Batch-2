import java.util.Scanner;

class para
{
	void calc(int a,char c)
	{
		System.out.println(a +"\n"+ c);
	}
	void calc(char c,int a)
	{
		System.out.println(c+"\n" +a);
	}
}
public class program38_para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number and character");
int n=sc.nextInt();
char d=sc.next().charAt(0);
para obj=new para();
obj.calc(n, d);
obj.calc(d, n);
	}

}
