import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Formatter;
import java.util.Scanner;

public class Country {

	public void FindDensity(String inputFilename, String outputFilename) throws IOException {
		
		
		
		Scanner scanner = null;
		Formatter formatter = null;
		try {
			scanner = new Scanner(new BufferedReader(new FileReader(inputFilename)));
			formatter = new Formatter(new BufferedWriter(new FileWriter(outputFilename)));
			int number1 = 0;		
			Number population = 0;
			
			
			Number sq_km = 0;
			double Density = 0.0;
			String[] colNames = null;
			if (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				colNames = line.split("\t");
			
				
			} else {
				throw new IllegalArgumentException("File is empty");
			}

			scanner.useDelimiter("\t");
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] values = line.split("\t");
				
				
				int number2 = 0;
				String[] table = scanner.nextLine().split("\\t");
				if (number1 == 0) {
					number1++;
					continue;
				}			
				/*String line = scanner.nextLine();
				String[] values = line.split("\t");
				*/
				for (String x : table) {
					
					System.out.print(x + "\t");
					if (number2 == 0) {
						number2++;
						continue;
					}
					
					
					if (number2 == 1) {
						try {
							sq_km = NumberFormat.getNumberInstance(java.util.Locale.US).parse(x);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						number2++;
						continue;
					}
					
					
					if (number2 == 2) {
						try {
							population = NumberFormat.getNumberInstance(java.util.Locale.US).parse(x);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
				}
				Density = (population.longValue() / sq_km.longValue());
				
				System.out.print(Density);
				System.out.println();
			}
			

		
	

				/*for (int i = 0; i < values.length; i++) {
					if (colNames[i].startsWith("density")) {

						if ((values[i] != null) && (values[i].length() > 0)) {
							density = Integer.parseInt(values[i])/Integer.parseInt(values[i]);
						}
					
					if (colNames[i].startsWith("density")) {
						if ((values[i] != null) && (values[i].length() > 0)) {
							density = colNames[i].startsWith("area sq.km.")/colNames[i].startsWith("population");
						}
					
					} else {
						formatter.format(values[i]);
					}
				
				if (values.length >1){
					formatter.format("\t%.3f", density);
					formatter.format("%n");
				}*/
				
			
			} finally {
			if (scanner != null) {
				scanner.close();
			}
			if (formatter != null) {
				formatter.close();
			}
		}
	}

	

	public static void main(String[] args) throws IOException {
		Country country = new Country();
		
		String infile = "CountryInfo.txt";
		try {
		File file = new File("out.txt");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("a");
		bw.close();
		/*}catch (FileNotFoundException e) {
		
			System.out.println(infile + " does not exist");
		}*/	
		
		
		
		
			country.FindDensity(infile, "out.txt");
		
		} catch (FileNotFoundException e) {
		
			System.out.println(infile + " does not exist");
		
		}
	
	
		System.out.println("Done");
	}
}

	
	
