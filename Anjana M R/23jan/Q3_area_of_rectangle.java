import java.util.Scanner;
class area
{
	int returnarea(int length,int breadth )
			{
		int area=length*breadth;
        return area;		
			}
	

}
public class Q3_area_of_rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int a=sc.nextInt();
		System.out.println("Enter breadth");
		int b=sc.nextInt();
		area obj=new area();
		int result=obj.returnarea(a,b);
		System.out.println(result);

	}

}
