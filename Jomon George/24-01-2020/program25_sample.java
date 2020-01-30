package demo;

class a{
	int a=10;
}
class b extends a
{
	int b =20;
}
class inherit extends b
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
class parent{
	void display1()
	{
		System.out.println("This is parent class");
	}
}
class sub extends parent{
	void display2()
	{
		System.out.println("This is child class");
	}
}

class member{
	String name,address;
	int age;
	long ph_no,salary;
	
	void printSalary()
	{
		System.out.println("Salary : " + salary);
	}
}
class Employee extends member{
	String specialization;
	Employee(String n,int ag, long ph, String addr, long sal)
	{
		name = n;
		age=ag;
		ph_no=ph;
		address=addr;
		salary = sal;
	}
	void display1()
	{
		System.out.println("Name : " + name + " Age : " + age + " Ph No : " + ph_no + " Address : " + address + " Salary : " + salary );
	}
}
class Manager extends member{
	String department;
	Manager(String n,int ag, long ph, String addr, long sal)
	{
		name = n;
		age=ag;
		ph_no=ph;
		address=addr;
		salary = sal;
	}
	void display2()
	{
		System.out.println("Name : " + name + " Age : " + age + " Ph No : " + ph_no + " Address : " + address + " Salary : " + salary );
	}
}

class Shape
{
	void shape()
	{
		System.out.println("This is This is shape");
	}
}
class Rectangle extends Shape{
	void rectangle()
	{
		System.out.println("This is rectangular shape");
	}
}
class Circle extends Shape{
	void circle()
	{
		System.out.println("This is circular shape");
	}
}
class Square extends Rectangle
{
	void square()
	{
		System.out.println("Square is a rectangle");
	}
	
}

class stat {
	 static int a;
	 static int b;

	 void sample()
	 {
		 a++;b++;
	 }
	 static void statDisplay()
	 {

		 System.out.println("Static A : " + a);
		 System.out.println("Static B : " + b);
	 }
}

public class program25_sample {

	public static void main(String[] args) {

		inherit Q1 = new inherit();
		Q1.display();
		
		parent Q3_1=new parent();
		Q3_1.display1();
		sub Q3_2=new sub();
		Q3_2.display2();
		Q3_2.display1();
		
		Employee Q4_1 = new Employee("Suman",21,777777777,"Street valley",40000);
		Q4_1.display1();
		Manager Q4_2 = new Manager("jijo",25,999999999,"Street valley",40000);
		Q4_2.display2();
		
		Square Q5 = new Square();
		Q5.shape();
		Q5.rectangle();
		
		stat obj = new stat(); obj.sample();
		stat.a=3;
		stat.statDisplay();	
		System.out.println(stat.a);
		
	}

}

