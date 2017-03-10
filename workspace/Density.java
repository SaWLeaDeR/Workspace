import java.io.File;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;


public class Density {

	private Scanner F;
//open t x t file and try if it exist or if it 
	
	public void openFile() {
		try {
			F = new Scanner(new File("CountryInfo.txt"));
		} catch (Exception e) {
			System.out.println("can't find the file.");
		}
	}
//reading file
	
	public void readFile() {
		int pass1 = 0;		
		Number population = 0;
		
		Number sq_km = 0;
		
		double density = 0.0;
		
		while (F.hasNext()) {
			int pass2 = 0;
			String[] tabbedex = F.nextLine().split("\\t");
			if (pass1 == 0) {
				pass1++;
				continue;
			}			
			for (String x : tabbedex) {
				
				System.out.print(x + "\t");
				if (pass2 == 0) {
					pass2++;
					continue;
				}
				
				
				if (pass2 == 1) {
					try {
						sq_km = NumberFormat.getNumberInstance(java.util.Locale.US).parse(x);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					pass2++;
					continue;
				}
				
				
				if (pass2 == 2) {
					try {
						population = NumberFormat.getNumberInstance(java.util.Locale.US).parse(x);
					} catch (ParseException e) {
						e.printStackTrace();
					}
				}
			}
			density = (population.longValue() / sq_km.longValue());
			
			System.out.print(density);
			System.out.println();
		}

	}
}
	

//too hard to write this code but İ DİD teacher 
//work perfectly
