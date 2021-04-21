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
	
	//Constructor
	public DisqueRental(String username,float prixLocation) {
		super();
		this.username=username;
		this.prixLocation=prixLocation;
	}
	
	//Getters and Setters	
	/*
	 * Return le prix de location
	 */
	public float getPrixLocation() {
		return prixLocation;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPrixLocation(float prixLocation) {
		this.prixLocation = prixLocation;
	}

	//Methods
	@Override
	public void rent(String name) {
		this.username=name;
	}

}
