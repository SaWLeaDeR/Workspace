package denemeler;

import java.lang.reflect.Array;
import java.util.*;

public class dizisirala {
	public static void main(String[] args) {
		int[] dizi = { 8, 6, 3, 56, 12, 3, 1, 0, 23, -1, -5 };
		System.out.println("Siralanmamis Hali");
		for (int i = 0; i < dizi.length; ++i) {
			System.out.println((i + 1) + ". eleman= " + dizi[i]);
		}
		System.out.println("");
		System.out.println("Siralanmis Hali");
		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length; ++i) {
			System.out.println((i + 1) + ". eleman= " + dizi[i]);
		}
		/*{
			int[] dizi = { 8, 6, 3, 56, 12, 3, 1, 0, 23, -1, -5 };
			Arrays.sort(dizi, 5, 10);
			for (int i = 0; i < dizi.length; i++)
				;
			{

				System.out.println((+1) + ". eleman= " + dizi[i]);
			}*/
	}
	
}