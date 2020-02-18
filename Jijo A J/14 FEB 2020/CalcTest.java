import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;




public class CalcTest {

  @Test
  public void addNumbersTest() {
    //throw new RuntimeException("Test not implemented");
    Calc obj =new Calc();
    int a=2,b=2,expoutput=4,actoutput;
    actoutput=obj.addNumbers(a, b);
    assertEquals(actoutput, expoutput);
    
  }
}
