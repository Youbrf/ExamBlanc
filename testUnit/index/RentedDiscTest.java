package index;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RentedDiscTest {

	@Test
	public void testConstructeur() {
		RentedDisc rdisc = new RentedDisc("Youssef",2.5F,0);
		
		assertEquals("Youssef", rdisc.getUsername());
		assertEquals(2.5F,rdisc.getPrixLocation());
		assertEquals(7,rdisc.getDureeLocation());
	}
	
	@Test
	public void testCalculerPrixTotal() {
		RentedDisc rdisc = new RentedDisc("Youssef",2.5F,0);
		RentedDisc rdisc1 = new RentedDisc("Youssef",2.5F,10);
		
		Float calcul = rdisc.calculerPrixTotal();
		Float calcul1 = rdisc1.calculerPrixTotal();
		
		assertEquals(17.5F,calcul);
		assertEquals(25,calcul1);
	}

	@Test
	public void testRent() {
		RentedDisc rdisc = new RentedDisc("Youssef",2.5F,0);
		
		rdisc.rent("Ibra");
		
		assertEquals("Ibra",rdisc.getUsername());
	}
}
