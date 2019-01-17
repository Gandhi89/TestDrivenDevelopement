import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ3 - red -> scream() function returns "people are amazing"
	
	@Test 
	public void testTwoPeopleShouting() {
		
		Scream s = new Scream();
		assertEquals("joker and batman are amazing",s.scream(new String[]{"joker","batman"}));
		
	}

}
