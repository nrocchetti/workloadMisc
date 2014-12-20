package parserSWF;

import java.io.FileNotFoundException;
import java.io.IOException;

public class mainParser {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Apéndice de método generado automáticamente
		//Aquí se ejecutarán las diferentes opciones del parser
		parserInterface Iparse = new userEstimates(args[0]); 
		
		try {
			Iparse.sumQuantities();
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
	}

}
