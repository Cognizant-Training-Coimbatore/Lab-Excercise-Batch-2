import java.util.Scanner;

class area {
	int l,b;
	int area;
	
	int returnArea(int l,int b)
	{
		area=l*b;
		return area;
	}
	
	
	
}
public class exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,ar;
		System.out.println("enter l and b");
		Scanner scanner= new Scanner(System.in);
		x=scanner.nextInt();
		y=scanner.nextInt();
		area obj=new area();
		ar=obj.returnArea(x, y);
		System.out.println("area of rectangle : " +ar);
	}

}
