package App;

import Utility.Utilities;
import index.*;

public class Appli {

	public static void main(String[] args) {
		// création d'un disque
		Disque disque = new Disque();
		// création de chansons
		Chansons chansons = new Chansons("rimk","portrait",1.5F);
		Chansons chansons1 = new Chansons("ninho","gucci",1.2F);
		Chansons chansons2 = new Chansons("naps","pochonbleu",1.5F);
		Chansons chansons3 = new Chansons("hatik","angel",0.9F);
		Chansons chansons4 = new Chansons("niro","raison",2F);
		Chansons chansons5 = new Chansons("Aznavour","boeme",1.5F);
		// Ajout des chansons dans le disque
		disque.addChansons(chansons);
		disque.addChansons(chansons1);
		disque.addChansons(chansons2);
		disque.addChansons(chansons3);
		disque.addChansons(chansons4);
		disque.addChansons(chansons5);
		//affichage du disque avant le trie
		System.out.println(disque);
		//les chansons sont trié par ordre décroissant par rapport a leur prix de location
		disque.sortChansons();
		//affichage du disque après le trie
		System.out.println(disque);
		
		
		//Déserialisation
		//TODO erreur à corrigé
//		RentedDisc rdisc=null;
//		System.out.println(rdisc);
//		System.out.println("----------------");
//		rdisc = Utilities.fromXml("RentedDisc.xml");
//		System.out.println(rdisc);

		// Sérialisation
//		RentedDisc rdisc = new RentedDisc("Youssef",2.5F,0);
//		System.out.println(rdisc);
//		Utilities.toXMLFile(rdisc,"RentedDisc.xml");
	}

}
