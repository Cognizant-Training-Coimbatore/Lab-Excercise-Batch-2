class student1
{
	int rollno;
	float phno;
	String st;
}
public class q2 {

	public static void main(String[] args) {
		student1 ob= new student1();
		student1 obj= new student1();
		ob.rollno=1;
		obj.rollno=2;
		ob.phno=34567;
		obj.phno=59595;
		ob.st="st.vincent colony, calicut 6";
		obj.st="thudiyallur,coimbatore";
		System.out.println("The roll no of fst student: "+ob.rollno +"phone: "+ob.phno+ "Addres: "+ob.st);
		System.out.println("The roll no of 2nd student: "+obj.rollno +"phone: "+obj.phno+"Addres: "+obj.st);

	}

}