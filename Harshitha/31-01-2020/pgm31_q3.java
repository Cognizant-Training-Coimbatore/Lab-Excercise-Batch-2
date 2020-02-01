package Project;

import java.util.Scanner;

public class pgm31_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter lenght of side");
Scanner sc=new Scanner(System.in);
int s= sc.nextInt();
double result=0.0;
result=(6*Math.pow(s,2))/(4*(1/Math.sqrt(3)));
System.out.println("Area of hexagon:"+result);
	}

}
