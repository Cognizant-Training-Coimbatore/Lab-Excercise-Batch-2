package project1;

import java.util.Scanner;

interface printable
{
	public void display();
	
}
 class Rectangle implements printable
 {
	 public void display() 
	 {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the length and breadth");
		  int l=sc.nextInt();
		  int b=sc.nextInt();
		 System.out.println("length :" +l +" "+"breadth :" +b);
	 }
 }
 class Sportscar implements printable
 {
	 public void display()
	 {

		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the brand and mileage");
		  String brand =sc.nextLine();
		  int m=sc.nextInt();
		 System.out.println("brand:" +brand+" "+ "mileage:"+m);
	 }
 }
 class Manager implements printable
 {
	 public void display( )
	 {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the name and dept");
		  String name =sc.nextLine();
		  String dept=sc.nextLine();
		 System.out.println("name : "+name+ " "+"dept: "+dept);
	 }
 }
public class pgmd29_q1 {

	public static void main(String[] args) {
		Rectangle obj1=new Rectangle();
		obj1.display();
		Sportscar obj2=new Sportscar();
		obj2.display();
		Manager obj3=new Manager();
		obj3.display();
 
	}

}
