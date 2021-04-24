package index;

import java.util.ArrayList;
import java.util.Collections;

public class Disque {
	/*
	 * liste des chansons
	 */
	private ArrayList<Chansons> disque;
	
	/*
	 * Constructeur d'un disque avec le nom du disque en parametre
	 */
	public Disque() {
		this.disque= new ArrayList<Chansons>();
	}

	/*
	 * Methode ajout chansons
	 */
	public void addChansons(Chansons chans) {
		disque.add(chans);
	}
	/*
	 * Chansons trié par le prix de location décroissant
	 */
	public void sortChansons() {
		Collections.sort(disque,Collections.reverseOrder());
		//autre méthode de trix décroissant
//		Collections.sort(disque);
//		Collections.reverse(disque);
	}

	@Override
	public String toString() {
		return "disque=\n" + disque ;
	}
	
	
	
}
