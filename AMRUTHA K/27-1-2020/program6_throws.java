package packss;
class Example1{  
	  void method1() throws ArithmeticException{  
	throw new ArithmeticException("Calculation error");
	  }  
	  void method2() throws ArithmeticException{  
	method1();  
	  }  
	  void method3(){  
	try{  
	  method2();  
	}
	catch(ArithmeticException e){
	  System.out.println("ArithmeticException handled");
	}  
	  }  }


public class program6_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj=new Example1();  
		obj.method3();  
		System.out.println("End Of Program");  


	}

}
