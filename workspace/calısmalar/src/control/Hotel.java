package control;

import Entity.Calýsan;
import Entity.Musteri;

public class Hotel {

	public static void main(String[] args) {

		Musteri m1 =new Musteri("mehmet", "amcanýz", 45);
		Musteri m2 =new Musteri("ahmak", "canýz", 38);
		Calýsan c1 =new Calýsan("salým", "tekil", 34, 1300, "hausekeeper");
		
		
		yonetim<Calýsan> y1 = new OtelYonetimi<>();
		y1.ekle(c1);
		
		y1.yazdýr();
		
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(c1);
		
	}

}
