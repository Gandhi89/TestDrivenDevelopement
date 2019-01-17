import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ1 - red -> scream() function returns unexpected value
	
	@Test 
	public void testOnePersonAmazing() {
		
		Scream s = new Scream();
		assertEquals("shivam is amazing",s.scream("shivam"));
		
	}

}
