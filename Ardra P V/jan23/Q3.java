import java.util.Scanner;

class area{
	int length;
	int bredth;
	
	void assign() {
		int l,b;
		System.out.println("Length");
		Scanner scanner=new Scanner(System.in);
		l=scanner.nextInt();
		System.out.println("bredth");
		b=scanner.nextInt();
		length=l;
		bredth=b;
		
	}
	int getArea() {
		return length*bredth;
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        area obj=new area();
        obj.assign();
        obj.getArea();
        System.out.println("area :" +obj.getArea());
	}

}
