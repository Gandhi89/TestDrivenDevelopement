import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ6 - green -> expected output and actual output matches
	
	@Test 
	public void testAlotShouting() {
		
		Scream s = new Scream();
		assertEquals("rachel and monica and phoebe and ross are amazing. JOEY ALSO!",s.scream(new String[]{"rachel","monica","phoebe","JOEY","ross"}));
		
	}

}
