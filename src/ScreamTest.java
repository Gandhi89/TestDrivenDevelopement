import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ2 - red -> scream() function returns incorrect output
	
	@Test 
	public void testNobodyListening() {
		
		Scream s = new Scream();
		assertEquals("You is amazing",s.scream(""));
		
	}

}
