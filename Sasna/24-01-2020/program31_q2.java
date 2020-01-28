class Student1{
	String name;
	double roll_no;
	double ph_no;
	String address;

Student1(String mnx,double x, double y, String xyz){
	name = mnx;
	roll_no = x;
	ph_no =y;
	address =xyz;
}

void display() {
	System.out.println("name :" +name);
	System.out.println("roll no :" +roll_no);
	System.out.println("phone number :" +ph_no);
	System.out.println("address :" +address);
}
}
public class program31_q2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student1 obj1 = new  Student1("Sam",1,98951149, "coimbatore");
 Student1 obj2 = new  Student1("John",2,9895118, "chennai");
 obj1.display();
 obj2.display();
	}

}
