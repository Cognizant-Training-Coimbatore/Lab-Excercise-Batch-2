package day7;

abstract class shape {
	int length = 5, width = 2, radius = 12;

	abstract void calculateArea();

	abstract void display();

	void dummy() {
		System.out.println("Dummy module");
	}
}

class rectangle extends shape {
	int area;

	void calculateArea() {
		area = length * width;
	}

	void display() {
		System.out.println("Rectangle " + area);
	}
}

class circle extends shape {
	double area;

	void calculateArea() {
		area = 3.14 * radius * radius;
	}

	void display() {
		System.out.println("Circle " + area);
	}
}

public class Abstract_class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle obj = new circle();
		obj.calculateArea();
		obj.display();
		rectangle obj1 = new rectangle();
		obj1.calculateArea();
		obj1.display();
		obj1.dummy();
		obj.dummy();
	}

}
