package index;

public class RentedDisc extends DisqueRental {
	//Attributes
	private int dureeLocation;
	
	//Methods
	/*
	 * Permet de calculer le prix total de la location en fonction du prix ( prixLocation )
	 */
	public float calculerPrixTotal() {
		float prixTotal;
		if(dureeLocation == 0 ) {
			prixTotal = getPrixLocation()*DEFAULT_DURATION;
		}else {
			prixTotal = getPrixLocation()*dureeLocation;
		}
		return prixTotal;
	}
}
