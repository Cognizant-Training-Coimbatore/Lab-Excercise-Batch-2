package feb14;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import feb14.calc;

public class calcTest {

  @Test
  public void addNumberTest() {
	  calc obj= new calc();
	  int a=2, b=3, expoutput=5, actoutput;
	  actoutput=obj.addNumber(a,b);
	  assertEquals(actoutput,expoutput);
    
  }
}
