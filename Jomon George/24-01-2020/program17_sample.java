package demo;

import java.util.Scanner;

class Student
{
	String name;
	int roll_no;
	long ph_no;
	String address;
	Student()
	{
		name="John";
		roll_no=2;		
	}
	Student(String n,int x,long y,String z)
	{
		name=n;
		roll_no=x;
		ph_no=y;
		address=z;
		
	}
	void display()
	{
		System.out.println("Name : " + name +"\tRoll No : " + roll_no + "\tPhone No : " + ph_no + "\tAddress : " + address );
	}
}

class Area{
	Scanner scanner = new Scanner(System.in);
	float length,breadth;
	void readInput() {
		
		System.out.print("\n\nEnter length and breadth : ");
		length=scanner.nextFloat();
		breadth=scanner.nextFloat();
	}
	
	float returnArea()
	{
		return length*breadth;
	}
}

class ArithmeticOP{
	Scanner scanner = new Scanner(System.in);
	int a ,b;
	void readAndDisplay() {
		
		System.out.print("\nEnter 2 numbers for Arithmetic OPs : ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println("addition : " + add(a,b) + "\tsubtraction : " + sub(a,b) + "\tmultiplication : " + mult(a,b) + "\tdivision : " + div(a,b) + "\n");
	}
	int add(int x, int y) { return (x+y);}
	int sub(int x, int y) { return (x-y);}
	int mult(int x, int y) { return (x*y);}
	int div(int x, int y) { return (x/y);}

}

class Student1{
	String name;
	Student1()
	{
		name="Unknown";
	}
	Student1(String x)
	{
		name=x;
	}
	void display()
	{
		System.out.println("Name : " + name);
	}
}

class AddAmount{
	int amount=50;
	AddAmount()
	{
		
	}
	AddAmount(int x)
	{
		amount+=x;
	}
	void display()
	{
		System.out.println("Total Piggie Bank Amount : " + amount);
	}
}

class Programming{
	String language= "programming languages";
	Programming()
	{
	}
	Programming(String s)
	{
		language= s;
	}
	void display()
	{
		System.out.println("I love " + language);
	}
}


class swapArguments
{
	void display(int a, String b)
	{
		System.out.println("\n" + a+"\t"+b);
	}
	void display(String b, int a)
	{
		System.out.println( a+"\t"+b);
	}
}

class squareRecatangle
{
	double a;
	double area(double a)
	{
		return a*a;
	}
	double area(double l,double b)
	{
		return l*b;
	}
}

class stringHandler{
	int length;
	String string;
	stringHandler(String a)
	{
		string =a;
	}
	int stringLength()
	{
		return string.length();
	}
	String toLower()
	{
		return string.toLowerCase();
	}
}


public class program17_sample {

	public static void main(String[] args) {
		
		Student Q1 = new Student();
		Q1.display();
		
		Student Q2_1 = new Student("Sam",21,8136875305L,"ABC XYZ Villa");
		Student Q2_2 = new Student("John",21,8136875305L,"ABC XYZ Villa");
		Q2_1.display();
		Q2_2.display();
		
		Area Q3 = new Area();
		Q3.readInput();
		System.out.println("Area of Rectangle : " + Q3.returnArea());
		
		ArithmeticOP Q4 = new ArithmeticOP();
		Q4.readAndDisplay();
		
		stringHandler Q5 = new stringHandler("SARATH");
		System.out.println("\nString to Lower : " + Q5.toLower() + "\nString Length : " + Q5.stringLength() + "\n");
		
		Student1 Q6_1 = new Student1();
		Q6_1.display();
		Student1 Q6_2 = new Student1("John");
		Q6_2.display();
		
		AddAmount Q7_1 = new AddAmount();
		Q7_1.display();
		AddAmount Q7_2 = new AddAmount(100);
		Q7_2.display();
		
		Programming Q8_1 = new Programming();
		Q8_1.display();
		Programming Q8_2 = new Programming("C++");
		Q8_2.display();
		
		swapArguments Q9_1 = new swapArguments();
		Q9_1.display(1, "sarath");
		swapArguments Q9_2 = new swapArguments();
		Q9_2.display("sarath",2);
		
		squareRecatangle Q10 = new squareRecatangle();
		System.out.println("Area of Square\t:\t"+Q10.area(4));
		System.out.println("Area of Rectangle\t:\t"+Q10.area(4,5));
		
	}

}
