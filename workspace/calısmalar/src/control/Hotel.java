package control;

import Entity.Cal�san;
import Entity.Musteri;

public class Hotel {

	public static void main(String[] args) {

		Musteri m1 =new Musteri("mehmet", "amcan�z", 45);
		Musteri m2 =new Musteri("ahmak", "can�z", 38);
		Cal�san c1 =new Cal�san("sal�m", "tekil", 34, 1300, "hausekeeper");
		
		
		yonetim<Cal�san> y1 = new OtelYonetimi<>();
		y1.ekle(c1);
		
		y1.yazd�r();
		
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(c1);
		
	}

}
