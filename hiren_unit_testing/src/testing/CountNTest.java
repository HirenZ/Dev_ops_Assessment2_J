package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountNTest {

	@Test
	void test() {
		UTesting test= new UTesting();
		int output =test.countN("Nirav");
		assertEquals(1,output);
	}

}
