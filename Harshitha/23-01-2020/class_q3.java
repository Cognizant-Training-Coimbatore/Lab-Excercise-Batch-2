import java.util.*;
 class arearec{
	int len;
	int bre;
	public arearec(int l,int b)
	{
		 len = l;
		 bre = b;
	}
	public int area() {
	
		return len*bre;
	}
}
public class class_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
       arearec objt = new arearec(length, breadth);
       System.out.println("area : "+ objt.area());
	}

}
