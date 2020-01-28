

	class Stud
	{  

	 int id;  
	 String name,address;  
	}  
	public class program36_two_objects { 
	 public static void main(String args[]){   
	  Stud s1=new Stud();  
	  Stud s2=new Stud();    
	  s1.id=2;  
	  s1.name="John";
	  s1.address="ABCD";
	  s2.id=3;  
	  s2.name="Sam";  
	  s2.address="EFGH";
	  
	  System.out.println(s1.id+" "+s1.name+" "+s1.address);  
	  System.out.println(s2.id+" "+s2.name+" " +s2.address);  
	 }  
	} 