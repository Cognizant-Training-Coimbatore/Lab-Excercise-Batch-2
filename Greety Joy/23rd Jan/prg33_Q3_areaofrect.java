import java.util.Scanner;

class Area
{
	int a,b;
	int returnArea(int a, int b)
	{
		int area;
		area=a*b;
		return area;
		
	}
	//void returnarea()
	//{
		//System.out.println(area);
	//}
}
public class prg33_Q3_areaofrect {

	public static void main(String[] args) {
		int n1,n2,c;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of a");
	n1=sc.nextInt();
	System.out.println("Enter the value of b ");
	n2=sc.nextInt();
	Area obj= new Area();
	//c=obj.returnArea(n1,n2);
	System.out.println("Area is:" + obj.returnArea(n1,n2));
	
	
	
     

	}

}
//or else it can be printed like system.out.println("Area is:" +c)
