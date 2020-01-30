package Project;

import java.util.Scanner;

interface Printable{
	void display();
}
class Rectangle implements Printable{
	public void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght and breadth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Area of rectangle:"+(l*b));
	}
}
class SportsCar implements Printable{
	public void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Car name and mileage");
		String c=sc.next();
		int m=sc.nextInt();
		System.out.println("Car:"+c+" Mileage:"+m);
	}
}
class Manager implements Printable{
	public void display() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter dept and salary");
	String d=sc.next();
	int s=sc.nextInt();
	System.out.println("Department:"+d+" Salary:"+s);
	}
}
public class pgm29_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle ob=new Rectangle();
		ob.display();
		SportsCar ob1=new SportsCar();
		ob1.display();
		Manager ob2=new Manager();
		ob2.display();
	}

}
