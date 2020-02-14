package feb14;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class anootations1 {
  @Test
  public void test1() 
  {
	  System.out.println("test1 is running...");
  }
  @Test
  public void test2() 
  {
	  System.out.println("test2 is running....");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before method is running...");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After method is running....");
  }

}
