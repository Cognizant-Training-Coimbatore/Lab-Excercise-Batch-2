package jan31;

import java.util.Scanner;
class hex
{
	double side,area;
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of one side of hexagon:");
		side = sc.nextDouble();
		area=(6*(side*side))/(4*Math.tan(Math.PI/6));
		System.out.println("area of hexagon is:" +area);
	}
	
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hex obj=new hex();
		obj.display();
		

	}

}
