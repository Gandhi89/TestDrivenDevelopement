import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ1 - green -> scream() function returns same static value
	
	@Test 
	public void testOnePersonAmazing() {
		
		Scream s = new Scream();
		assertEquals("shivam is amazing",s.scream("shivam"));
		
	}

}
