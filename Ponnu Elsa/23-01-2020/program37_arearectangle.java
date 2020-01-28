class area
	{  

	 double l,b;
	 double returnArea(double l, double b)
	 {
		 double area=l*b;
		 return area;
	 }
  
	}  
	public class program37_arearectangle { 
	 public static void main(String args[]){   
	  area obj=new area();
	  double a=obj.returnArea(3,4);
	  System.out.println("Area: "+a);
	 }  
	} 