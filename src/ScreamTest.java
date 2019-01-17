import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ3 - red -> scream() function returns "people are amazing"
	
	@Test 
	public void testTwoPeopleShouting() {
		
		Scream s = new Scream();
		assertEquals("trump and obama are amazing",s.scream(new String[]{"trump","obama"}));
		
	}

}
