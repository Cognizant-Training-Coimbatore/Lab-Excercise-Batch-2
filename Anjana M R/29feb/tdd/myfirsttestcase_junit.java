//create Junit Testcase
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class myfirsttestcase_junit {

	@Test
	void test() {
calc obj=new calc();//create calc class after this.
int n1=1,n2=3,n3=4;
int expResult=8;
int actResult=obj.add3Numbers(n1,n2,n3);//at first method add3Numbers was not created.the passed arguments will be fgiven in the method.
assertEquals(expResult, actResult);
int exre=12;
int actre=obj.mul3Numbers(n1,n2,n3);
assertEquals(exre, actre);
	}

}
