import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ1 - refactor satge -> scream() function returns correct value for all string input
	
	@Test 
	public void testOnePersonAmazing() {
		
		Scream s = new Scream();
		assertEquals("jenelle is amazing",s.scream("jenelle"));
		
	}

}
