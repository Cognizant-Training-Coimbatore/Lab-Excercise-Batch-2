import java.util.Scanner;

class Area
{
	int l,b;
	int returnarea(int a,int c)
	{
		int y=a*c;
		return y;
				
	}
	
}
public class prog36_area_rect {

	public static void main(String[] args)
	{
		System.out.println("Enter the length and breadth of rectangle");
		Scanner r=new Scanner(System.in);
		Area obj=new Area();
		obj.l=r.nextInt();
		obj.b=r.nextInt();
		int a1=obj.returnarea(obj.l,obj.b);
		System.out.println("Area is: "+a1);
		
		// TODO Auto-generated method stub

	}

}
