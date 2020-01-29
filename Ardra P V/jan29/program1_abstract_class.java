abstract class shape{
	int l=2,w=2,rad=10;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule() {
		System.out.println("Dummy Module");
	}
}
class rectangle extends shape{
	int area;
	void calculateArea() {
		area=l*w;
	}
	void displayArea() {
		System.out.println("Rectangle :  "+area);
	}
}
class circle extends shape{
	double area;
	void calculateArea() {
		area=(3.14*rad*rad);
	}
	void displayArea() {
		System.out.println("Circle :  "+area);
	}
	
}
public class program1_abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle r=new rectangle();
		r.dummymodule();
		r.calculateArea();
		r.displayArea();
		circle c=new circle();
		c.calculateArea();
		c.displayArea();

	}

}
