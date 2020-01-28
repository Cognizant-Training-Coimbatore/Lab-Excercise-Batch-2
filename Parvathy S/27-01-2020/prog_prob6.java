import java.io.IOException;
class M{  
	 void method()throws IOException
	 {  
	  System.out.println("Hello Paaru");  
	 }  
	}  
public class prog_prob6 {
	   public static void main(String args[])throws IOException{//declare exception  
	     M m=new M();  
	     m.method();  
	  
	    System.out.println("Good Evening!");  
}
}