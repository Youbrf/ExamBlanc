package Utility;

import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import index.*;

public class Utilities {
	private static XStream xstream = new XStream(new DomDriver());
	/*
	 * Sérialisation
	 */
	public void toXMLFile(RentedDisc rdisc, String fileName) {
		
		//Configurer XStream
		xstream.alias("RentedD",RentedDisc.class);
		xstream.useAttributeFor(RentedDisc.class,"username");
		xstream.aliasField("DL", RentedDisc.class, "dureeLocation");
		xstream.aliasField("PL",DisqueRental.class, "prixLocation");
		//Convertir en String XML et sauve dans le fichier texte
		try {
			xstream.toXML(rdisc,new FileWriter(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * Déserialisation
	 */
	public static RentedDisc fromXml(String fileName) {
		//Configuration XStream
		xstream.alias("RentedD",RentedDisc.class);
		xstream.useAttributeFor(RentedDisc.class,"username");
		xstream.aliasField("DL", RentedDisc.class, "dureeLocation");
		xstream.aliasField("PL",DisqueRental.class, "prixLocation");
		// Récuperer l'objet Rdisc 
		return (RentedDisc) xstream.fromXML(fileName);
		
	}
}
