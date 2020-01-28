package demo;
class stringhandler
{   
	String b;
  int count(String a)
   {
	  return(a.length());
   }
  
 void lower(String a)
  {
	  b=a.toLowerCase();
	  
  }


}




public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                stringhandler s=new stringhandler();
                		System.out.println(s.count("KAVERY"));
                		s.lower("KAVERY");
                System.out.println(s.b);
	}

}
