package index;
/*
 * @author Youssef Chennou
 */
public interface Rentable {
	//Attributes
	/*
	 * Constant DEFAULT_DURATION fixée à 7 jours 
	 */
	public static final int DEFAULT_DURATION = 7;
	
	//Methods
	/*
	 * Objet pouvant être emprunté
	 */
	void rent(String name);
	
	
}
