import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit_Test_Case {

	@Test
	void test() {
		calc ob= new calc();
		int n1=1,n2=2;
		int Exp =3;
		int act = ob.addnumbers(n1,n2);
		assertEquals(Exp, act);
	}

}
