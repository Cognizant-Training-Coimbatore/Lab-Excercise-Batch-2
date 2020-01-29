package demo;
class studentName{
	void name() {
		System.out.println("student name=unknown");
	}
	void name(String a) {
		System.out.println("student name="+a);
	}
}
public class class6_student_names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentName obj=new studentName();
		obj.name();
		obj.name("amrutha");
		
	}

}
