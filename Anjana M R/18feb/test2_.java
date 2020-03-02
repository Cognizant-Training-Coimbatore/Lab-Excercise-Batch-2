import org.testng.annotations.Test;

public class test2_ {
  @Test(groups = {"smoketests"})
  public void test1()
  {
	  System.out.println("Smoke tests-Testcase1");
  }
  @Test(groups = {"smoketests"})
  public void test2()
  {
	  System.out.println("Smoke tests-Test2");
  }
  @Test(groups = {"regressiontest"})
  public void test3()
  {
	  System.out.println("Group2-Test3");
  }
}
