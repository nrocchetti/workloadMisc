package parserSWF;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface parserInterface {
	
	
	//Se deberá especificar la implementación de las funciónes para 
	//parsear los diferentes campos del formato
	//Esta es una función en particular, a medida de que se quieran hacer funciones
	//nuevas se irán agregando sucesivamente
	
	public void sumQuantities() throws FileNotFoundException, IOException;
	
	public double averageValue();
	
	public double stdDev();
	
	
}
