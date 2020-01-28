import java.util.Scanner;

class order
{
	void disp(int n,char c)
	{
		System.out.println(n);
		System.out.println(c);
	}
	void disp(char c,int n)
	{
		System.out.println(c);
		System.out.println(n);
	}
}
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	order obj=new order();
	obj.disp(5 , 'a');
	obj.disp('a', 5);
	}

}
