import java.util.Scanner;
class values
{
	

  void display(int n,String c)
  {
	  System.out.println("Integer and character   "+ n + c);
  }
 
  void display(String c,int n)
  {
	  System.out.println("character and integer  "+c+n);
  }
}
public class Q9_integer {

	public static void main(String[] args) {
		int x;
		String y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer    ");
		x=sc.nextInt();
		System.out.println("Enter the character   ");
		y=sc.next();
		values obj=new values();
		obj.display(x,y);
		obj.display(y,x);
		
		

	}

}
