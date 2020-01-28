class abc
{
	static int a = 10; 
    static int b= a * 4;  
     
    static void m1() 
    { 
        a = 20; 
        System.out.println("from m1"); }	
}
public class qstn26 {// static variable 
    
    public static void main(String[] args) 
    { 
       abc xx=new abc();
       System.out.println("Value of a : "+xx.a); 
       System.out.println("Value of b : "+xx.b); 
       xx.m1();
    } 
}