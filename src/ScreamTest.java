import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ2 - green -> scream() function returns "you is amazing"
	
	@Test 
	public void testNobodyListening() {
		
		Scream s = new Scream();
		assertEquals("SHIVAM IS AMAZING",s.scream("SHIVAM"));
		
	}

}
