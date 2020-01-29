package demo;
class circle{
	String phno;
	int rollno;
	String adress;
	String name;
	
	
}
public class class_student2 {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		circle obj1=new circle();
		obj1.phno="9562229282";
		obj1.rollno=1;
		obj1.adress="house no:24,Gandinagar";
		obj1.name="john";
		circle obj2=new circle();
		obj2.phno="9876543562";
		obj2.rollno=2;
		obj2.adress="house no:1,saravanapatti";
		obj2.name="sam";
		System.out.println(obj1.name+"\n"+obj1.phno+"\n"+obj1.rollno+"\n"+obj1.adress+"\n*****");
		System.out.println(obj2.name+"\n"+obj2.phno+"\n"+obj2.rollno+"\n"+obj2.adress);
		

		

	}

}
