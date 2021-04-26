package index;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChansonsTest {

	@Test
	public void testConstructeur() {
		Chansons chansons = new Chansons("rimk","portrait",1.5F);
		
		assertEquals("rimk", chansons.getChanteur());
		assertEquals("portrait",chansons.getTitre());
		assertEquals(1.5F,chansons.getPrixLocation());
	}

	@Test
	public void testCompareTo() {
		Chansons chansons = new Chansons("rimk","portrait",1.5F);
		Chansons chansons1 = new Chansons("ninho","gucci",1.2F);
		Chansons chansons2 = new Chansons("naps","pochonbleu",1.5F);
		
		assertEquals(1, chansons.compareTo(chansons1));
		assertEquals(-1, chansons1.compareTo(chansons));
		assertEquals(0, chansons2.compareTo(chansons));
	}
}
