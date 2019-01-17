import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreamTest {

	// REQ6 - red -> strings with any size of array is amazing
	
	@Test 
	public void testAlotShouting() {
		
		Scream s = new Scream();
		assertEquals("rachel and monica and phoebe are amazing. JOEY ALSO!",s.scream(new String[]{"rachel","monica","phoebe","JOEY"}));
		
	}

}
