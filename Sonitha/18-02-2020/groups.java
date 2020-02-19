import org.testng.annotations.Test;

public class groups {
  @Test(groups= {"smoketests"})
  public void test1() 
  {
	  System.out.println("Smoke tests - Testcase1");
  }
  
  @Test(groups= {"smoketests"})
  public void test2()
  {
	  System.out.println("Smoke tests - test2");
  }
  
  @Test(groups = {"Regressiontest"})
  public void test3()
  {
	  System.out.println("Group2-test3");
  }
}
