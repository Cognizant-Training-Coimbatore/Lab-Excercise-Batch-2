class student2
{
	int roll,phone;
	String name,address;
	void assign(String a,int b,int c,String d)
	{
		name=a;
		roll=b;
		phone=c;
		address=d;
		System.out.println(name + " "+ roll + " " + phone + " " + address);
	}
}
public class q2_roll_ph_addrss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student2 obj =new student2();
		obj.assign("Sam", 1, 2255, "ksd");
		student2 obj1=new student2();
		obj1.assign("John", 2, 2211, "ksd");
	}

}
