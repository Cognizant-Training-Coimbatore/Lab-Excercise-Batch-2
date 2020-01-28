package demo;

public class q2student2 {
String name;
int ro;
int ph;
String ad;
q2student2()
{
	name="john";
	ro=1;
	ph=98765;
	ad="qwerty";
	System.out.println("NAME: "+name);
	System.out.println("rollno: "+ro);
	System.out.println("phone number: "+ph);
	System.out.println("address: "+ad);
}
q2student2(String a,int b,int c,String d)
{
	name=a;
	ro=b;
	ph=c;
	ad=d;
	System.out.println("NAME:"+a);
	System.out.println("rollno: "+b);
	System.out.println("phone number: "+c);
	System.out.println("address: "+d);
}


			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
q2student2 obj=new q2student2();
q2student2 obj2=new q2student2("sam",2,12345,"asdfgh");
	}

}
