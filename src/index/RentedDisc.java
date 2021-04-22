package index;

import Exception.InvalidDurationException;

public class RentedDisc extends DisqueRental {
	//Attributes
	private int dureeLocation;
	
	//Constructors
	public RentedDisc(String username, float prixLocation, int dureeLocation) throws InvalidDurationException{
		super(username, prixLocation);
		if(dureeLocation<0) {
			throw new InvalidDurationException();
		}else {
			this.dureeLocation=dureeLocation;
		}	
	}
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
	@Override
	public String toString() {
		return "-- Nom = " + getUsername() 
				+"\n-- Prix de la location = " + getPrixLocation()+" €" 
				+"\n-- duree de la Location = " + dureeLocation 
				+"\n-- Prix total = " + calculerPrixTotal()+" €";
	}

	//toString
	
}
