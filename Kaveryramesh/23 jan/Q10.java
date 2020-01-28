package demo;

class areas
{   
	
	void squarerect(int l)
	   
	   {
		 System.out.println("Area of sqaure is "+l*l);
	   }
   	 void squarerect(int l,int b)
   	 {
   		 System.out.println("Area of rectangle is" + l*b);
   	 }


}

public class Q10 {

	public static void main(String[] args) {
	
          areas a=new areas();
          a.squarerect(2);
          a.squarerect(3,4);
	}

}
