package feb_18;


import org.testng.annotations.Test;

public class group {
  @Test(groups = {"smoketest"})
  public void test1() {
	  System.out.println("smoketest-test1");
  }
  @Test(groups = {"smoketest"})
  public void test2() {
	  System.out.println("smoketest-test2");
  }
  @Test(groups = {"regression"})
  public void test3() {
	  System.out.println("regression-test3");
  }
}
