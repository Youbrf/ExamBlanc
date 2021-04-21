package index;

public abstract class DisqueRental extends Disque implements Rentable {
	//Attributes
	/*
	 * Nom de la personne qui à loueé le disque
	 */
	private String username;
	/*
	 * Prix de la location par jour
	 */
	private float prixLocation;
	//Getters and Setters	
	/*
	 * Return le prix de location
	 */
	public float getPrixLocation() {
		return prixLocation;
	}
	
	//Methods
	@Override
	public void rent(String name) {
		this.username=name;
	}

}
