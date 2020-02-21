package feb_18;

import org.testng.annotations.Test;

public class dependency 
{
  @Test
  public void login() 
  {
	  System.out.println("Login");
  }
  @Test(dependsOnMethods = {"login"})
  public void Createorder() 
  {
	  System.out.println("Create order");
  }
  @Test(dependsOnMethods = {"Createorder"})
  public void deleteorder() 
  {
	  System.out.println("delete order");
  }
}
