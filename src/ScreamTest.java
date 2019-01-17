import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ5 - red -> scream() function returns first two names of array
	
	@Test 
	public void testTwoPeopleShouting() {
		
		Scream s = new Scream();
		assertEquals("rachel and monica and phoebe are amazing",s.scream(new String[]{"rachel","monica","phoebe"}));
		
	}

}
