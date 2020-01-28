class area1
{
	int area(int a)
	
	{
		return(a*a);
	}
	int area(int x,int y)
	{
		return(x*y);
	}
}
public class Q10_area_of_sq_and_rectangle {
	

	public static void main(String[] args) {
area1 obj=new area1();
int result1=obj.area(4);
int result2=obj.area(4,5);
System.out.println("Square  "+result1);
System.out.println("Rectangle  "+result2);


	}

}
