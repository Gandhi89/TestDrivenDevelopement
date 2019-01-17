import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ5 - refactor stage -> expected value equals actual value
	
	@Test 
	public void testTwoPeopleShouting() {
		
		Scream s = new Scream();
		assertEquals("rachel and monica and phoebe and joey are amazing",s.scream(new String[]{"rachel","monica","phoebe","joey"}));
		
	}

}
