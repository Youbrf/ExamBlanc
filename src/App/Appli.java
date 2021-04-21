package App;

import Utility.Utilities;
import index.RentedDisc;

public class Appli {

	public static void main(String[] args) {
		RentedDisc rdisc = new RentedDisc("Youssef",2.5F,10);
		
		Utilities.toXMLFile(rdisc,"RentedDisc.xml");
	}

}
