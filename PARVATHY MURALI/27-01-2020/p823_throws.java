
import java.io.*;  
class methods
{
 void method()throws IOException
 {  
  throw new IOException("device error");  
 }  
}  
public class p823_throws
{
   public static void main(String args[])
   {  
    try
    {  
     methods m=new methods();
     m.method();  
    }
    catch(Exception e)
    {
    	System.out.println("exception handled");
    	
    }     
  
    System.out.println("normal flow...");  
  }  
}  