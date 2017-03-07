package control;

import java.util.ArrayList;

public class OtelYonetimi<T> implements yonetim<T> {

	private ArrayList<T> a1;
	
	public void ekle(T item) {
		a1.add(item);
	}

	public void cýkar(T item) {
		a1.remove(item);
		
	}

	public String kim(T item) {
		return item.toString();
	}

	public void yazdýr() {
		for(T a : a1){
		System.out.println(a.toString());
		}
		
	}

}
