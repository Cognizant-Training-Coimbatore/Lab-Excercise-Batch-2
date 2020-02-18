package podemo;

import org.testng.annotations.Test;

public class priority {
  @Test(priority=1)
  public void banana() {
	  System.out.println("banana");
  }
  @Test(priority=3)
  public void apple() {
	  System.out.println("apple");
  }
  @Test(priority=2)
  public void cate() {
	  System.out.println("cat");
  }
}

