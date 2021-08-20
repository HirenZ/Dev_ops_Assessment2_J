package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SqureTest {

	@Test
	void test() {
		UTesting test= new UTesting();
		int output =test.squre(5);
		assertEquals(25,output);
		
	}
	void test2() {
	UTesting test= new UTesting();
	int output =test.squre(6);
	assertEquals(36,output);
}
}