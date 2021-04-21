package index;
/*
 * @author Youssef Chennou
 */
public interface Rentable {
	//Attributes
	/*
	 * Constant DEFAULT_DURATION fix�e � 7 jours 
	 */
	public static final int DEFAULT_DURATION = 7;
	
	//Methods
	/*
	 * Objet pouvant �tre emprunt�
	 */
	void rent(String name);
	
	
}
