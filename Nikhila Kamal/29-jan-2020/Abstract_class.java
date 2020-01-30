package sample_pgms;

 abstract class shape1
 {
	 int length=2,width=2,radius=10;
	 abstract void calculatearea();
	 abstract void displayarea();
	 void dummymodule()
	 {
		 System.out.println("Dummy module");
	 }
 }
	 class rectangle1 extends shape1
	 {
		 int area;
		 void calculatearea()
		 {
			 area=length*width;
		 }
		 void displayarea()
		 {
			 System.out.println("area of rectangle: " + area);
		 }
	 }
	 
	 class circle extends shape1
	 {
		 double area;
		 void calculatearea()
		 {
			 area=3.14*radius*radius;
		 }
		 void displayarea()
		 {
			 System.out.println("area of circle: " + area);
		 }
	 }
 
 
	 public class Abstract_class
	 {
		 
	public static void main(String[] args) 
	{
		rectangle1 objj=new rectangle1();
		objj.calculatearea();
		objj.displayarea();
		circle obj2=new circle();
		obj2.calculatearea();
		obj2.displayarea();

	}

}
 

