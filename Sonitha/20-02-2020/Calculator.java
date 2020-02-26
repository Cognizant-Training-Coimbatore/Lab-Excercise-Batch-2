package pack1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculator {

	@Test
	void test() {
		calc obj =new calc();
		int actualResult = obj.add(10,100);
		assertEquals(100, actualResult);
		
	}

}
