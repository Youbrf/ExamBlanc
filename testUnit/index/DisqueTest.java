package index;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DisqueTest {

	@Test
	public void testConstructeur() {
		Disque disque = new Disque();
		Chansons chansons = new Chansons("rimk","portrait",1.5F);
		disque.addChansons(chansons);
		String chanteur = disque.getDisque().get(0).getChanteur();
		Assertions.assertEquals("rimk",chanteur);
	}
	
	@Test
	public void testsortChansons() {
		//TODO testUnitaire du tri des chansons
	}

}
