import java.util.Scanner;


public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double area;
     
     System.out.println("enter the side");
     Scanner sc = new Scanner(System.in);
     int s = sc.nextInt();
     area = (6 * s * s) / (4 *( java.lang.Math.tan(30)));
     System.out.println("area :" +area);
     
	}

}
