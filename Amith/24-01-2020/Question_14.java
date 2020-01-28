class member
{
	String name,address;
	int age,phno,salary;
	void printSalary()
	{
		System.out.println(salary);
	}
}
class employee extends member
{
	String spl,dep;
	void display()
	{
		System.out.println("employee name :"+name+"  address : "+address+"  age : "+age+"  salary :"+salary+"  specialisation : "+spl+"  department :"+dep);
		
	}
}
class manager extends member
{
	String spl,dep;
	void display()
	{
	System.out.println("manager name :  "+name+"  address :  "+address+"  age :"+age+"  salary :"+salary+"  specialisation : "+spl+"  department :"+dep);
	}
}
public class Question_14 {

	public static void main(String[] args) 
	{
		member obj1= new member();
		member obj= new member();
		employee obj2= new employee();
		manager obj3 = new manager();
		obj2.name="amith";
		obj2.address="abc house";
		obj2.age=35;
		obj2.salary=32000;
		obj2.phno=987878;
		obj2.spl="java";
		obj2.dep="testing";
		obj3.name="arhem";
		obj3.address="xyz house";
		obj3.age=30;
		obj3.salary=38000;
		obj3.phno=878788;
		obj3.spl="c++";
		obj3.dep="developer";
		obj2.display();
		obj3.display();
		obj.salary=obj2.salary;
		obj1.salary=obj3.salary;		
		obj1.printSalary();
		obj.printSalary();
	}

}
