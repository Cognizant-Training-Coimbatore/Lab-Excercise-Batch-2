import org.testng.annotations.Test;

public class Dependency {
  @Test
  public void login() 
  {
	  System.out.println("Login");
  }
  
  @Test(dependsOnMethods= {"login()"})
  public void createOrder()
  {
	  System.out.println("Create Order");
  }
  
  @Test(dependsOnMethods= {"createOrder()"})
  public void deleteOrder()
  {
	  System.out.println("Delete Order");
  }
}
