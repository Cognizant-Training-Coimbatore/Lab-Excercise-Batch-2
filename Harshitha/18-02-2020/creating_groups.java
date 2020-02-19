import org.testng.annotations.Test;

public class creating_groups {
  @Test(groups= {"smoketest"})
  public void tst1(){
	  System.out.println("Smoke Test-test1");
  }
  @Test(groups= {"smoketest"})
  public void tst2() {
	  System.out.println("Smoke Test-test2");
  }
  @Test(groups= {"regressiontest"})
  public void tst3() {
	  System.out.println("Group 2-Test 3");
  }
}
