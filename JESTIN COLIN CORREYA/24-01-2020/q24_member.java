package demo;
class member
{
	String name;
	int age;
	int ph;
	String ad;
	int sa;
	void printsalary()
	{
		System.out.println("salary: "+sa);
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("phone number:"+ph);
		System.out.println("address:"+ad);
		System.out.println("salary:"+sa);
		
	}
}
class employee extends member
{
	String spe;
	String dept;
}
class manager extends member
{
	String spe1;
	String dept2;
}
public class q24_member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee obj=new employee();
manager obj2=new manager();
obj.name="a";
obj.age=2;
obj.ph=132;
obj.ad="qwe";
obj.sa=1234;
obj2.name="ab";
obj2.age=22;
obj2.ph=1324;
obj2.ad="qwwe";
obj2.sa=1234234;
obj.display();
obj2.display();
	}

}
