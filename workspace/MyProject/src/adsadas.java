import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
public class adsadas {

	public void processScores(String inputFilename, String outputFilename) throws IOException {
		Scanner scanner = null;
		Formatter formatter = null;
		try {
			scanner = new Scanner(new BufferedReader(new FileReader(inputFilename)));
			formatter = new Formatter(new BufferedWriter(new FileWriter(outputFilename)));
			String[] colNames = null;
			if (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				colNames = line.split("\n");
			} else {
				throw new IllegalArgumentException("File is empty");
			}

			scanner.useDelimiter("\t");
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] values = line.split("\t", -1);
				double grade = 0;
				for (int i = 0; i < values.length; i++) {
					if (colNames[i].startsWith("Midterm")) {
						if ((values[i] != null) && (values[i].length() > 0)) {
							grade += Integer.parseInt(values[i]) * 0.25;
						}
					} else if (colNames[i].startsWith("Quiz")) {
						if ((values[i] != null) && (values[i].length() > 0)) {
							grade += Integer.parseInt(values[i]) * 0.025;
						}
					} else if (colNames[i].startsWith("HW")) {
						if ((values[i] != null)&& (values[i].length() >0)){
							grade += Integer.parseInt(values[i]) * 0.015;
						}
					} else {
						formatter.format(values[i]);
					}
				}
				if (values.length >1){
					formatter.format("\t%.3f", grade);
					formatter.format("%n");
				}
			}

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
		adsadas calc = new adsadas();
		String infile = "CountryInfo.txt";
		try {
			calc.processScores(infile, "out.txt");
		} catch (FileNotFoundException e) {
			System.out.println(infile + " does not exist");
		}
	}

}
