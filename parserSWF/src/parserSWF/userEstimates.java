package parserSWF;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class userEstimates implements parserInterface{
	
	
	public String arch;
	
	public userEstimates(String arch){
		this.arch = arch;
	}
	
	@Override
	public void sumQuantities() throws IOException {
		// TODO Apéndice de método generado automáticamente
		File file = new File(arch);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		int numLine = 0;
		
		while ((((line = br.readLine()) != null)) && (numLine < 53)) {
		   // process the line.
			numLine++;
		}
		while (((line = br.readLine()) != null)) {
		   // process the line.
			System.out.println(line);
			String delims = "[ ]";
			String[] tokens = line.split(delims);
			System.out.println(tokens[8]);
		}
		br.close();
	}

	@Override
	public double averageValue() {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public double stdDev() {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}
	
	
}
