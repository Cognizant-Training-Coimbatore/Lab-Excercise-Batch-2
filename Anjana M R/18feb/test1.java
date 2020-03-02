import org.testng.annotations.Test;

public class test1 {
  @Test
  public void login() {
	  System.out.println("Login");
  }
  @Test(dependsOnMethods = {"login"})
  public void createOrder() {
	  System.out.println("Create Order");
  }
  @Test(dependsOnMethods = {"createOrder"})
  public void deleteOrder() {
	  System.out.println("Delete order");
  }
}
