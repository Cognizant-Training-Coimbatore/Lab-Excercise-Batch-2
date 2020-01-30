package sample;

interface dad
{ 
   
    default void show() 
    { 
        System.out.println("I am dad"); 
    } 
} 
  
interface mom
{ 
    
    default void show() 
    { 
        System.out.println("I am mom"); 
    } 
} 
  

class child implements dad, mom
{ 
    
    public void show() 
    { 
        
        dad.super.show(); 
  
        
        mom.super.show(); 
    } 
}
public class ques3{
  
    public static void main(String args[]) 
    { 
        child son = new child(); 
        son.show(); 
    } 
} 

