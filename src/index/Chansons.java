package index;

public class Chansons implements Comparable<Chansons>{
	/*
	 * nom du chanteur
	 */
	private String chanteur;
	/*
	 * titre de la chanson
	 */
	private String titre;
	/*
	 * prix de location de la chanson 
	 */
	private float prixLocation;
	
	/*
	 * Constructeur d'une chanson
	 */
	public Chansons(String chanteur,String titre,float prixLocation) {
		this.chanteur=chanteur;
		this.titre=titre;
		this.prixLocation=prixLocation;
	}
	/*
	 * Méthode de comparaison
	 */
	@Override
	public int compareTo(Chansons chans2) {
		if(this.prixLocation>chans2.prixLocation) return 1;
		if(this.prixLocation<chans2.prixLocation) return -1;			
		return 0;
	}
	/*
	 * ToString
	 */
	@Override
	public String toString() {
		return "chanteur=" + chanteur 
				+ ", prixLocation=" + prixLocation + "\n";
	}


	
	
}
