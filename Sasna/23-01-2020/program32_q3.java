import java.util.Scanner;

class Area{
	
		double returnArea(double length, double breadth) {
		return length*breadth;
	}
}


public class program32_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double x,y,c;
   System.out.println("enter the length");
   Scanner sc = new Scanner(System.in);
   x = sc.nextInt();
   System.out.println("enter the breadth");
   y = sc.nextInt();
  
   
   Area obj = new Area();
   c = obj.returnArea(x,y);
   System.out.println("area"+ c);
	}

}
