package Utility;

import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import index.*;

public class Utilities {
	
	public static void toXMLFile(RentedDisc rdisc, String fileName) {
		XStream xstream = new XStream(new DomDriver());
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
}
