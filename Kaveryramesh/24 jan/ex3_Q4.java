package demo;
class member
{
	String Name;
	int age;
	double phonenumber;
	String addres;
	double salary;
	
	
	void printsalary(double sal)
	{
		salary=sal;
		System.out.println("salary: "+salary);
	}
   }
class employee extends member
{
	String specialization;
	String department;
	       employee(String na,int age,double ph,String add,double sal)
	       {
	    	   Name=na;
	    	   age=age;
	    			   phonenumber=ph;
	    			   addres=add;
	    			 
	    			   System.out.println("NAME:"+Name+"\nAge:"+age+"\nPH:"+phonenumber+"\naddress"+add);
	    			   printsalary(sal);
	    	   
	       }
	
}
class manager extends member
{
	String specialization;
	String department;
	manager(String na,int age,double ph,String add,double sal)
	{ Name=na;
	   age=age;
			   phonenumber=ph;
			   addres=add;
			  
			   System.out.println("NAME:"+Name+"\nAge:"+age+"\nPH:"+phonenumber+"\naddress"+add);
			   printsalary(sal);
}
}

public class ex3_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee e1=new employee("kavery",22,974577224,"kochi",100000);
		manager m1=new manager("fathima",22,974573456,"kochi",10000);
				

	}

}
