class student1{
	String name;
	int roll_no;
	String phone_no;
	String address;
	
	void assign(String na,int ro,String pn,String add) {
		name=na;
		roll_no=ro;
		phone_no=pn;
		address=add;
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     student1 st1=new student1();
     student1 st2=new student1();
     st1.assign("sam", 10, "9446160367", "nirmanagar,Delhi");
     st2.assign("John", 11, "9446160397", "ragam,Delhi"); 
     System.out.println(st1.name);
     System.out.println(st1.roll_no);
     System.out.println(st1.phone_no);
     System.out.println(st1.address);
     System.out.println(st2.name);
     System.out.println(st2.roll_no);
     System.out.println(st2.phone_no);
     System.out.println(st2.address);
	}

}
